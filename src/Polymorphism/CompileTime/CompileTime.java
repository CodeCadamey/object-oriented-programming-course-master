package Polymorphism.CompileTime;

public class CompileTime {

    /**
     * same methods with different variants that does different kinds of things.
     * this is also called early binding.
     */
    public String methodA() {
        return "method A called";
    }

    public String methodA(String subString) {
        return "method B called with message" + subString;
    }

    public String methodA(String subString, Integer value) {
        return "method B called with message" + subString + " and with value " + value;
    }
}
