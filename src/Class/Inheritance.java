package Class;

class A{
    int i, j;

    void showij(){
        System.out.println("i and j: " + i + "  " + j);
    }
}
class B extends A{
    int k;

    void showk(){
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }
}

public class Inheritance {
    public static void main(String[] args) {
        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;
        System.out.println("Содержимое объкта superOb: ");
        superOb.showij();
        System.out.println();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;

        System.out.println("Содержимое объкта subOb: ");
        subOb.showij();
        subOb.showk();

        System.out.println();
        System.out.println("Сумма i, j и k в объекте superOb:");
        subOb.sum();
    }
}
