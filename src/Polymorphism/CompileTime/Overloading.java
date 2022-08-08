package Polymorphism.CompileTime;

public class Overloading extends ConstructorOverloading {

    private String fieldA;
    private String fieldB;
    private Boolean fieldC;

    /**
     * default constructor
     */
    Overloading() {

    }

    /**
     * overloaded constructors
     */
    Overloading(String a1, String a2) {
        super(a1,a2);
    }

    Overloading(String fieldA, Boolean fieldC) {
        this.fieldA = fieldA;
        this.fieldC = fieldC;
    }
}
