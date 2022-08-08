package Inheritence;


import Inheritence.AbstractClass.AbstractProperty;
import Inheritence.Interface.Interface;

/**
 * In java, classes can only inherit one class and multiple amount of interfaces.
 * this is a design decision which sole purpose is to avoid diamond inheritance issue.
 * <p>
 * Types of Inheritance
 * <p>
 * Single Inheritance – In this type of inheritance one derived class inherits from only one base class. It is the simplest form of Inheritance.
 * Multiple Inheritance – In this type of inheritance a single derived class may inherit from two or more than two base classes.
 * Hierarchical Inheritance – In this type of inheritance, multiple derived classes inherits from a single base class.
 * Multilevel Inheritance – In this type of inheritance the derived class inherits from a class, which in turn inherits from some other class. The Super class for one, is sub class for the other.
 * Hybrid Inheritance (also known as Virtual Inheritance) – Hybrid Inheritance is combination of Hierarchical and Multilevel Inheritance.
 */

public class Inheritance extends AbstractProperty implements Interface {

    private String fieldA;

    private String fieldB;
    private Integer fieldC;
    private Boolean fieldD;
    private myEnum myEnum;

    /**
     * by overriding abstract method that's available in AbstractProperty class
     * error will be gone and can subclasses implement their respective methods.
     */
    @Override
    public void abstractMethod() {
        System.out.println("implement your method body here");
    }

    @Override
    public void interfaceMethodA() {

    }

    @Override
    public String interfaceMethodB() {
        return null;
    }

    enum myEnum {
        enum1, enum2, enum3, enum4
    }
}
