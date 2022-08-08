package Encapsulation;

public class Encapsulation {

    /**
     * Encapsulation: attributes of a class will be hidden or private,
     * can be accessed only through methods (getters & setters)
     * you should make attributes private if you don't have a reason to make them public/protected.
     */

    private String fieldA;
    private String fieldB;
    private Integer fieldC;
    private Boolean fieldD;
    private myEnum myEnum;

    enum myEnum {
        enum1, enum2, enum3, enum4
    }

    public String getFieldA() {
        return fieldA;
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public String getFieldB() {
        return fieldB;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    public Integer getFieldC() {
        return fieldC;
    }

    public void setFieldC(Integer fieldC) {
        this.fieldC = fieldC;
    }

    public Boolean getFieldD() {
        return fieldD;
    }

    public void setFieldD(Boolean fieldD) {
        this.fieldD = fieldD;
    }

    public myEnum getMyEnum() {
        return myEnum;
    }

    public void setMyEnum(myEnum myEnum) {
        this.myEnum = myEnum;
    }

    @Override
    public String toString() {
        return "Inheritence{" +
                "fieldA='" + fieldA + '\'' +
                ", fieldB='" + fieldB + '\'' +
                ", fieldC=" + fieldC +
                ", fieldD=" + fieldD +
                ", myEnum=" + myEnum +
                '}';
    }
}
