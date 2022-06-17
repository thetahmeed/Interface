public class App implements A, B {
    public static void main(String[] args) {
        A a = new App();
        B b = new App();
        a.cat();
        b.dog();
    }
    public void dog() {
        System.out.println("I am dog");
    }
    public void cat() {
        System.out.println("I am cat");
    }
}
