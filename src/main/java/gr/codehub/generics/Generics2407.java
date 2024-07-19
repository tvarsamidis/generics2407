package gr.codehub.generics;

import java.util.List;

public class Generics2407 {

    public static void main(String[] args) {
  
        
        NaturalNumber<Integer> pi = new NaturalNumber<>(1234);
        System.out.println(pi.get());
        
        Box<Integer> b1 = new Box<>(1, "My lucky number");
        Box<Double> b2 = new Box<>(22.0/7, "π accoring to ancient Greeks");
        
        Box<Person> personBox = new Box<>(new Employee(), "random person");
        Box<Employee> employeeBox = new Box<>(new Employee(), "random employee");
        
        // personBox = employeeBox; // will not work!
        
        showInfo(personBox);
        // showInfo(employeeBox); // will not work!
        
        List<Number> list1 = List.of(1, 2, 3);
        List<Integer> list2 = List.of(4, 5, 6);
        
        showInfo(list1);
        showInfo(list2);
        
    }
    
    public static void showInfo(Box<Person> box) {
        System.out.println("Info: " + box.getDescription());
    }
    
    
    
    public static void showInfo(List<? super Integer> list) {
        System.out.println("Number of elements in list = " + list.size());
    }
    
    
}
