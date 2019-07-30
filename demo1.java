public class demo1 {

    public int add(int x, int y) {
        System.out.println("Add function");
        return add(x, y);
    }

    int subtract(int x, int y) {
        System.out.println("Subract function");
        return x-y;
    }

    int multiply(int x, int y) {
        System.out.println("Multiply function");
        System.out.println("Multiply function2");

        return x*y;
    }

    void divide(int x, int y) {
        System.out.println("Divide function");
        //pass x/y
    }
    public static void main(String[] args) {


    }
}
