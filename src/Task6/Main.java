package Task6;

public class Main {

    public static void main(String[] args) {
        // write your code here

        ArbolBinario<String> ar = new ArbolBinario<>();

        ar.insert("Hola");
        ar.insert("Chau");
        ar.insert("Arriba");
        ar.insert("Derecha");
        ar.insert("Izquierda");
        ar.insert("Abajo");
        ar.insert("Frente");
        ar.insert("Fondo");

        ar.preorder();
        ar.inorder();
        ar.postorder();
        try {
            ar.delete("Fondo");
            ar.delete("Chau");
            ar.delete("Hola");
            ar.delete("NoEstoy");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("andubo");
    }
}