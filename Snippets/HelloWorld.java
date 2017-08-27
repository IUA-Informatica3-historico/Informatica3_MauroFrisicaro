package Snippets;

public class HelloWorld
{
    private static class Foo {
        public int x;
        public int y;

        public Foo(int x_, int y_) {
            x = x_;
            y = y_;
        }

        @Override
        public String toString() {
            return "{" + x + ", " + y + "}";
        }
    }

    public static void main(String[] args)
    {
        Foo f = new Foo(1, 2);
        Foo g = f;
        System.out.println(f);
        System.out.println(g);

        g.y = 0;
        System.out.println();
        System.out.println(f);
        System.out.println(g);

    }
}
