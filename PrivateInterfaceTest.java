interface Greeting {
    private void log(String message) {
        System.out.println("LOG: " + message);
    }

    default void sayHello() {
        log("Hello");
    }

    default void sayGoodBye() {
        log("Good Bye");
    }
}

class Greeter implements Greeting {
    
}

public class PrivateInterfaceTest {
    public static void main(String[] args) {
        Greeter g = new Greeter();
        g.sayHello();
        g.sayGoodBye();
    }
}
