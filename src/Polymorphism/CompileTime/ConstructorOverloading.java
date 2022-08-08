package Polymorphism.CompileTime;

public class ConstructorOverloading {

    private String fieldA;
    private String fieldB;
    private Boolean fieldC;

    ConstructorOverloading() {

    }

    ConstructorOverloading(String a1, String a2) {
        this.fieldA = a1;
        this.fieldB = a2;
    }
}
