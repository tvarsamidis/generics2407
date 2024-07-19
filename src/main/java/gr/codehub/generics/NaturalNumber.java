package gr.codehub.generics;

public class NaturalNumber<T extends Number> {
    private T number;
    
    public NaturalNumber(T number) {
        this.number = number;
    }
    
    public boolean isEven() {
        return number.intValue() % 2 == 0;
    }
    
    public Integer get() {
        return number.intValue();
    }
    
}
