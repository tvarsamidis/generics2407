package gr.codehub.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Generics2407 {

    public static void main(String[] args) {
        System.out.println("My choice is " + Chooser.<String>same("abc", "ABC"));
    }
}
