class animal {
    void walk() {
        System.out.println("Animals can walk ");
    }
}

class dog extends animal {
    void walk() {
        System.out.println("Dog can walk ");
    }

}

public class override {
    static public void main(String args[]) {
        dog d1 = new dog();
        animal a1 = new animal();

        d1.walk();
        a1.walk();
    }
}
