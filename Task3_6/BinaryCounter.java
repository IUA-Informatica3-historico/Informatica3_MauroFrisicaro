/*  Escriba un método recursivo que devuelva el número de unos en la representación binaria de N.
    Use el hecho de que es igual al número de unos en la representación binaria de N/2, más 1 si N es impar. */

package Task3_6;

public class BinaryCounter {
    public static void main(String[] args) {


    }

    int cu(int n) {
        if (n < 2)
            return n;
        return (n%2+cu(n-2));
    }
}
