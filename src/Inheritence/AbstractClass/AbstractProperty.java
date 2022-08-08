package Inheritence.AbstractClass;


/**
 * abstract classes cannot be instantiated, but they can have a subclass
 * abstract methods are declared without an implementation and doesn't contain default body, instead should be overwritten by
 * inherit class
 */
public abstract class AbstractProperty {

    protected String fieldE;
    protected String fieldF;

    public abstract void abstractMethod();

    public void nonAbstractMethod() {
        System.out.println("non abstract method can have body");
    }
}
