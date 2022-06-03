public class App {
    public static void main(String[] args) {
        MiddleClass middleClass = new MiddleClass();

        middleClass.test();

        // Can't create any object of interface
        // MyInterface myInterface = new MyInterface(); // Not possible

        // But we can create refference of interface
        MyInterface m = new MiddleClass();
        m.test();

       // Accessing interface variables
       System.out.println("Value of i is "+middleClass.a);
    }
}
