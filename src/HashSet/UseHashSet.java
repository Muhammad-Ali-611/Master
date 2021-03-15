package HashSet;

import java.util.HashSet;

public class UseHashSet {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("Toyota");

        System.out.println(cars);

        for (int i=0; i<9; i++){
            System.out.println(i);

            if (cars.contains(i));
            System.out.println(i+" was found in the set ");
            System.out.println(i+" was not found in the set");
        };
        }
    }

