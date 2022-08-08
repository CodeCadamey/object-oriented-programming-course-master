package Inheritence.Interface;

/**
 * What is an interface in Java?
 * <p>
 * Interface looks like a class but it is not a class. An interface can have methods and variables just like the class
 * but the methods declared in interface are by default abstract (only method signature, no body,
 * see: Java abstract method). Also, the variables declared in an interface are public, static & final by default. We will cover this in detail, later in this guide.
 * <p>
 * What is the use of interface in Java?
 * As mentioned above they are used for full abstraction.
 * Since methods in interfaces do not have body, they have to be implemented by the class before you can access them.
 * The class that implements interface must implement all the methods of that interface.
 * Also, java programming language does not allow you to extend more than one class, However you can implement more than one interfaces in your class.
 */
public interface Interface {
    /**
     * Key points: Here are the key points to remember about interfaces:
     * 1) We can’t instantiate an interface in java. That means we cannot create the object of an interface
     * <p>
     * 2) Interface provides full abstraction as none of its methods have body. On the other hand abstract class provides partial abstraction as it can have abstract and concrete(methods with body) methods both.
     * <p>
     * 3) implements keyword is used by classes to implement an interface.
     * <p>
     * 4) While providing implementation in class of any method of an interface, it needs to be mentioned as public.
     * <p>
     * 5) Class that implements any interface must implement all the methods of that interface, else the class should be declared abstract.
     * <p>
     * 6) Interface cannot be declared as private, protected or transient.
     * <p>
     * 7) All the interface methods are by default abstract and public.
     * <p>
     * 8) Variables declared in interface are public, static and final by default.
     */

    public static String staticField = "Hello World"; //variable *should* be instantiated just in case It might not be getting instantiated.

    void interfaceMethodA();

    String interfaceMethodB();
}
