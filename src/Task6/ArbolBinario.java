package Task6;

public class ArbolBinario<T extends Comparable> {

    private NodoArbolBinario<T> root;

    ArbolBinario() {
        root = null;
    }

    void insert(T dato) {
        if (root == null)
            root = new NodoArbolBinario<T>(dato);
        else
            root.insert(dato);
    }

    void delete(T dato) throws Exception {
        if (root != null)
            root = root.delete(dato);
    }

    void preorder() {
        if (root != null)
            root.preorder();
        System.out.println();
    }

    void inorder() {
        if (root != null)
            root.inorder();
        System.out.println();
    }

    void postorder() {
        if (root != null)
            root.postorder();
        System.out.println();
    }

    public boolean esVacio() {
        return root == null;
    }

    public void vaciar() {
        root = null;
    }
}