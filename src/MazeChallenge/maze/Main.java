package MazeChallenge.maze;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {
    private final Image image = new Image("file:src/MazeChallenge/pictures/tileLab.png");
    private MazeGenerator m;
    private GraphicsContext gc;

    public static void main(String[] args) {
        launch(args);
    }

    /**
     * Method started from launch(args) inside main.
     *
     * @param primaryStage the primary stage for this application, onto which the application scene can be set.
     */
    @Override
    public void start(Stage primaryStage) {
        int size = 25;
        m = new MazeGenerator(size, size);

        // Display on Console
        m.display();
        System.out.println();
        m.getAllData();

        // Display on frame
        primaryStage.setTitle("-- Maze Generator --");
        primaryStage.getIcons().add(new Image("file:src/MazeChallenge/pictures/mazeLogo.png"));
        Group root = new Group();
        Canvas canvas = new Canvas(32 * size, 32 * size);
        gc = canvas.getGraphicsContext2D();

        drawMap();

        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        Task taskResolver = new Task() {
            @Override
            protected Object call() throws Exception {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                resolve(0, 0);
                return true;
            }
        };
        Thread threadResolver = new Thread(taskResolver);
        threadResolver.start();
    }

    /**
     * Recursive function to solve the labyrinth.
     *
     * @param x current position in x to be solved
     * @param y current position in x to be solved
     * @return true if the cell is part of the answer.
     */
    private boolean resolve(int x, int y) {
        // We set the point as visited.
        m.visiting(x, y);

        // We paint it yellow.
        drawPoint(x, y, 1);

        // We store the integer of the actual position.
        int data = m.getData(x, y);

        // We check if we are not the exit.
        if (x == m.getW() - 1 && y == m.getH() - 1) {
            drawPoint(x, y, 2);
            return true;
        }

        // Checking if we can go down.
        if ((data & 2) == 2 && !m.isVisited(x, y + 1)) {

            if (resolve(x, y + 1)) {
                drawPoint(x, y, 2);
                return true;
            }
        }
        // Checking if we can go right.
        if ((data & 4) == 4 && !m.isVisited(x + 1, y)) {

            if (resolve(x + 1, y)) {
                drawPoint(x, y, 2);
                return true;
            }
        }
        // Checking if we can go up.
        if ((data & 1) == 1 && !m.isVisited(x, y - 1)) {

            if (resolve(x, y - 1)) {
                drawPoint(x, y, 2);
                return true;
            }
        }
        // Checking if we can go left.
        if ((data & 8) == 8 && !m.isVisited(x - 1, y)) {
            if (resolve(x - 1, y)) {
                drawPoint(x, y, 2);
                return true;
            }
        }

        // If we cant go anywhere we paint it red and we return false.
        drawPoint(x, y, 0);
        return false;
    }

    /**
     * Draw the map on the canvas.
     */
    private void drawMap() {
        for (int i = 0; i < m.getW(); i++)
            for (int j = 0; j < m.getH(); j++)
                gc.drawImage(image, 0, 32 * m.getData(i, j), 32, 32, i * 32, j * 32, 32, 32);
    }

    /**
     * Draw a yellow, green of red dot on (x,y).
     *
     * @param x     position on y.
     * @param y     position on x.
     * @param color 0 for Red, 1 for Yellow and 2 for Green.
     */
    private void drawPoint(int x, int y, int color) {
        int radio = 10;

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        switch (color) {
            case 0:
                gc.setFill(Color.RED);
                break;
            case 1:
                gc.setFill(Color.YELLOW);
                break;
            case 2:
                gc.setFill(Color.GREEN);
                break;
        }
        Platform.runLater(() ->
                gc.fillOval(x * 32 + 16 - radio, y * 32 + 16 - radio, 2 * radio, 2 * radio)
        );
    }
}