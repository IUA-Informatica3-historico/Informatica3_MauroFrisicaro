package Task6;

import java.util.Random;

public class BinaryTreeMain {

    public static void main(String[] args) {

        // Task 6.5 Making the Binary Tree
        BinaryTree<Integer> tree = new BinaryTree<>();
        Random randomNumber = new Random();
        int number;

        System.out.print("Number List: ");
        for (int i = 0; i < 10; ++i) {
            number = randomNumber.nextInt(26);
            System.out.print(number + " ");
            tree.insert(number);
        }

        System.out.print("\n\nLevel\tNodes\nALL\t\t" + tree.count()
                + "\n0\t\t" + tree.countAtLevel(0)
                + "\n1\t\t" + tree.countAtLevel(1)
                + "\n2\t\t" + tree.countAtLevel(2)
                + "\n3\t\t" + tree.countAtLevel(3)
                + "\n4\t\t" + tree.countAtLevel(4)
                + "\n5\t\t" + tree.countAtLevel(5)
                + "\n6\t\t" + tree.countAtLevel(6)
                + "\n\nDepth: " + tree.depth()
                + "\n\nPreOrder: " + tree.preOrder()
                + "\nInOrder: " + tree.inOrder()
                + "\nPostOrder: " + tree.postOrder()
                + "\nInOrderNonRecursive: " + tree.inOrderNonRecursive() + "\n");
    }
}
