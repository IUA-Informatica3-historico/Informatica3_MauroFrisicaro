/*
 * Recursive Backtracking Algorithm.
 * Shamelessly borrowed from the ruby at:
 * http://weblog.jamisbuck.org/2010/12/27/maze-generation-recursive-backtracking
 */

package MazeChallenge.maze;

import java.util.Arrays;
import java.util.Collections;

public class MazeGenerator {

    private final int width;
    private final int height;
    private final int[][] maze;

    /**
     * Constructor of the class.
     *
     * @param w Number of columns of tiles / Width size.
     * @param h Number of rows of tiles / Height size.
     */
    MazeGenerator(int w, int h) {
        this.width = w;
        this.height = h;
        maze = new int[this.width][this.height];
        generateMaze(0, 0);
    }

    /**
     * @param number to be compared.
     * @param upper  the top number.
     * @return true if number is between 0 and upper.
     */
    private static boolean between(int number, int upper) {
        return (number >= 0) && (number < upper);
    }

    /**
     * @return the width size of the MazeChallenge.maze.
     */
    int getWidth() {
        return width;
    }

    //x

    /**
     * @return the height size of the MazeChallenge.maze.
     */
    int getHeight() {
        return height;
    }

    /**
     * @param x the position on x of the data.
     * @param y the position on y of the data.
     * @return
     */
    int getData(int x, int y) {
        return maze[x][y];
    }

    /**
     *
     */
    public void getAllData() {
        for (int i = 0; i < height; ++i) {
            for (int j = 0; j < width; ++j) {
                System.out.print(maze[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * Draws the MazeChallenge.maze in console..
     * '-' and '|' are walls, '+' are corners and ' ' are available spaces to move.
     */
    public void display() {
        for (int i = 0; i < height; i++) {
            // Draw the north edge
            for (int j = 0; j < width; j++) {
                System.out.print((maze[j][i] & 1) == 0 ? "+---" : "+   ");
            }
            System.out.println("+");

            // Draw the west edge.
            for (int j = 0; j < width; j++) {
                System.out.print((maze[j][i] & 8) == 0 ? "|   " : "    ");
            }
            System.out.println("|");
        }

        // Draw the bottom line.
        for (int j = 0; j < width; j++) {
            System.out.print("+---");
        }
        System.out.println("+");
    }


    // X

    /**
     * @param cx
     * @param cy
     */
    private void generateMaze(int cx, int cy) {
        DIR[] dirs = DIR.values();
        Collections.shuffle(Arrays.asList(dirs));

        for (DIR dir : dirs) {
            int nx = cx + dir.dx;
            int ny = cy + dir.dy;

            if (between(nx, width) && between(ny, height) && (maze[nx][ny] == 0)) {
                maze[cx][cy] |= dir.bit;
                maze[nx][ny] |= dir.opposite.bit;
                generateMaze(nx, ny);
            }
        }
    }

    /**
     * @param x
     * @param y
     */
    void visiting(int x, int y) {
        maze[x][y] |= 0x10;
    }

    /**
     * @param x
     * @param y
     * @return
     */
    public boolean isVisited(int x, int y) {
        return (maze[x][y] & 0x10) != 0;
    }

    /**
     *
     */
    private enum DIR {
        N(1, 0, -1), S(2, 0, 1), E(4, 1, 0), W(8, -1, 0);

        // Use the static initializer to resolve forward references.
        static {
            N.opposite = S;
            S.opposite = N;
            E.opposite = W;
            W.opposite = E;
        }

        private final int bit, dx, dy;
        private DIR opposite;

        DIR(int bit, int dx, int dy) {
            this.bit = bit;
            this.dx = dx;
            this.dy = dy;
        }
    }

    public int getW() {
        return width;
    }

    public int getH() {
        return height;
    }

}