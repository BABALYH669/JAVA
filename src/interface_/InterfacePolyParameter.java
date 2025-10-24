package interface_;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        IF if01 = new A();
        if01 = new B();
    }
}

interface IF {
}

class A implements IF {
}

class B implements IF {
}
