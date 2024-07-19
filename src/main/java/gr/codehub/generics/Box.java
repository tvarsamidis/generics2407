package gr.codehub.generics;

public class Box<T> {

    private T object;
    private String description;

    public Box(final T object, final String description) {
        this.object = object;
        this.description = description;
    }

    public Box(final T object) {
        this(object, "No description given");
    }

    public T get() {
        return object;
    }

    public String getDescription() {
        return description;
    }

}
