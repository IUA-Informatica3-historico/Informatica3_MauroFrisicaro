package Task6;

import java.util.Stack;

public class BinaryTree<T extends Comparable> {
    private Node<T> root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(T dato) {
        if (root == null) {
            root = new Node<T>(dato);
        } else {
            root.insert(dato);
        }
    }

    public void delete(T dato) throws Exception {
        if (root != null) {
            root = root.delete(dato);
        }
    }

    // Task 6.6
    public String preOrder() {
        if (root != null) {
            return root.preOrder();
        }
        return "";
    }

    // Task 6.6
    public String inOrder() {
        if (root != null) {
            return root.inOrder();
        }
        return "";
    }

    // Task 6.6
    public String postOrder() {
        if (root != null) {
            return root.postOrder();
        }
        return "";
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void doEmpty() {
        root = null;
    }

    // Task 6.1
    public int countAtLevel(int number) {
        if (root != null) {
            return root.countAtLevel(number);
        }
        return 0;
    }

    // Task 6.3
    public int count() {
        if (root != null) {
            return root.count();
        }
        return 0;
    }

    // Task 6.4
    public String inOrderNonRecursive() {
        if (root != null) {
            return root.inOrderNonRecursive();
        }
        return "";
    }

    // Task 6.8
    public int depth() {
        if (root != null) {
            return root.depth();
        }
        return 0;
    }

    // Task 6.9 (WIP)
    public void dTree(Node node, int number) {

    }

    private class Node<T extends Comparable> {
        private T data;
        private Node<T> left;
        private Node<T> right;

        private Node(T d) {
            data = d;
            left = null;
            right = null;
        }

        private T getData() {
            return data;
        }

        private void setData(T data) {
            this.data = data;
        }

        // Task 6.7
        private void insert(T data) {
            if (this.data.compareTo(data) == 0) {
                return; // If it is a duplicated value
            }

            if (this.data.compareTo(data) > 0) {
                if (left == null) {
                    left = new Node<T>(data);
                } else {
                    left.insert(data);
                }
            } else {
                if (right == null) {
                    right = new Node<T>(data);
                } else {
                    right.insert(data);
                }
            }
        }

        private void insert(Node<T> nodo) {
            if (data.compareTo(nodo.getData()) > 0) {
                if (left == null) {
                    left = nodo;
                } else {
                    left.insert(nodo);
                }
            } else {
                if (right == null) {
                    right = nodo;
                } else {
                    right.insert(nodo);
                }
            }
        }

        private Node<T> delete(T d) throws Exception {
            int comp = data.compareTo(d);
            if (comp < 0) {
                if (right != null)
                    right = right.delete(d);
                else
                    throw new Exception("Not found.");
            } else if (comp > 0) {
                if (left != null)
                    left = left.delete(d);
                else
                    throw new Exception("Not found.");
            } else {
                if (right != null) {
                    right.insert(left);
                    return right;
                } else {
                    return left;
                }
            }
            return this;
        }

        @Override
        public String toString() {
            return data + "";
        }

        // Task 6.6
        private String preOrder() {
            if (isEmpty()) {
                return "";
            }
            StringBuilder txt = new StringBuilder();

            txt.append(data.toString()).append(" ");
            if (left != null) {
                txt.append(left.preOrder());
            }
            if (right != null) {
                txt.append(right.preOrder());
            }

            return txt.toString();
        }

        // Task 6.6
        private String inOrder() {
            if (isEmpty()) {
                return "";
            }

            StringBuilder txt = new StringBuilder();

            if (left != null) {
                txt.append(left.inOrder());
            }
            txt.append(data.toString()).append(" ");
            if (right != null) {
                txt.append(right.inOrder());
            }

            return txt.toString();
        }

        // Task 6.6
        private String postOrder() {
            if (isEmpty()) {
                return "";
            }

            StringBuilder txt = new StringBuilder();

            if (left != null) {
                txt.append(left.postOrder());
            }
            if (right != null) {
                txt.append(right.postOrder());
            }
            txt.append(data.toString()).append(" ");

            return txt.toString();
        }

        // Task 6.4
        private String inOrderNonRecursive() {
            if (isEmpty()) {
                return "";
            }

            StringBuilder txt = new StringBuilder();

            Stack<BinaryTree.Node> stack = new Stack<>();
            BinaryTree.Node node = root;

            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            while (stack.size() > 0) {
                node = stack.pop();

                txt.append(node.data).append(" ");

                if (node.right != null) {
                    node = node.right;

                    while (node != null) {
                        stack.push(node);
                        node = node.left;
                    }
                }
            }

            return txt.toString();
        }

        // Task 6.3
        private int count() {
            int acum = 1;
            if (left != null) {
                acum += left.count();
            }
            if (right != null) {
                acum += right.count();
            }
            return acum;
        }

        // Task 6.1
        private int countAtLevel(int number) {
            int acum = 0;

            if (number == 0) {
                acum = 1;
            }

            if (left != null) {
                acum += left.countAtLevel(number - 1);
            }
            if (right != null) {
                acum += right.countAtLevel(number - 1);
            }
            return acum;
        }

        // Task 6.8
        private int depth() {
            if (root == null) {
                return 0;
            }

            int count = 0;

            while (true) {
                if (this.countAtLevel(count) > 0) {
                    count++;
                } else {
                    break;
                }
            }
            return count;
        }

        private int depthAlternative() {
            if (this == null) {
                return 0;
            } else {
                int leftD = this.left.depth();
                int rightD = this.right.depth();

                return Math.max(leftD, rightD) + 1;
            }
        }

        // Task 6.9 (WIP)
        private Node dTree(Node dRoot, int key) {
            /*
            Node p1, p2;
            if (dRoot == null) {
                return dRoot;
            }

            if (dRoot.data == key) {
                //arbol vacio
                if (dRoot.left == dRoot.right) {
                    return null;
                }
                //un sub-arbol es nulo
                else if (dRoot.left == null) {
                    p1 = dRoot.right;
                    return p1;
                } else if (dRoot.right == null) {
                    p1 = dRoot.left;
                    return p1;
                }
                //ambos sub-arboles presentes
                else {
                    p2 = dRoot.right;
                    p1 = dRoot.right = null;
                    while (p1.left != null) {
                        p1 = p1.left;
                    }
                    p1.left = dRoot.left;
                    return p2;
                }
            }
            if (dRoot.data < key) {
                dRoot.right = dtree(dRoot.right, key);
            } else
                dRoot.left = dtree(dRoot.left, key);
            return dRoot;
            */
            return dRoot;
        }
    }
}
