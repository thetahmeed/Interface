
public class MiddleClass implements MyInterface{

    // We can merge class and interface through,
    //
    // class to class => extends
    // interface to interface => extends
    // class to interface => implements

    public void test() {
        System.out.println("Interface implementation from test MiddleClass");
    }
}
