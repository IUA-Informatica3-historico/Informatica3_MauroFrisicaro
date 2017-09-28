package Task5;

public class Queue<T> {
    private Nodo<T> frente;
    private Nodo<T> fondo;

    public Queue() {
        frente = null;
        fondo = null;
    }

    public void poner(T dato) {
        if (null == fondo) {
            fondo = new Nodo<T>(dato, null);
            frente = fondo;
        } else {
            fondo.setNext(new Nodo<T>(dato, null));
            fondo = fondo.getNext();
        }
    }

    public T sacar() throws Exception {
        if (frente == null)
            throw new Exception();

        T tmp = frente.getDato();
        if (frente.getNext() == null) {
            frente = fondo = null;
        } else {
            frente = frente.getNext();
        }
        return tmp;
    }

    public boolean esVacias() {
        return frente == null;
    }

    public void vaciar() {
        frente = fondo = null;
    }
}