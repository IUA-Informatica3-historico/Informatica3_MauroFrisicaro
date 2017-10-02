package Task6;

public class Main {
    public static void main(String[] args) {
        BinaryTree<String> ar = new BinaryTree<>();

        ar.insert("Hola");
        ar.insert("Chau");
        ar.insert("Arriba");
        ar.insert("Derecha");
        ar.insert("Izquierda");
        ar.insert("Abajo");
        ar.insert("Frente");
        ar.insert("Fondo");

        System.out.print(ar.preOrder() + "\n" + ar.inOrder() + "\n" + ar.postOrder() + "\n\n");

        try {
            ar.delete("Fondo");
            ar.delete("Chau");
            ar.delete("Hola");
            ar.delete("NoEstoy");
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Funciona");
    }
}
