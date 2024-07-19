package gr.codehub.generics;

public class Viewer<T> {
    
    public T view(T t){
        System.out.println("The viewer says: " + t.toString());
        return t;
    }
    
    public static void main(String[] args) {
        Viewer<Double> viewer = new Viewer();
        Double justShown = viewer.view(23.0);
    }
    
}
