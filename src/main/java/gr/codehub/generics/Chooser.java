package gr.codehub.generics;


public class Chooser {
//public class Chooser<T> {
//    public T choose(T s1, T s2) {
//        if (Math.random() >= 0.5) {
//            return s1;
//        }
//        return s2;
//    }  
    
    public  <T> boolean same(T o1, T o2){
        if (o1.equals(o2)) {
            return true;
        }
        return false;
    }
}

