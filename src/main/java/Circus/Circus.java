package Circus;

import Circus.animal.Animal;
import Circus.animal.Duck;
import Circus.animal.Parrot;
import Circus.stuff.Cannon;
import Circus.stuff.Equipment;
import Circus.stuff.Ladder;

public class Circus {
    private static Animal[] animals = {
            new Duck(),
            new Parrot()
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateValue(Asset [] Assets) {
        int total = 0;
        for (Asset e : Assets) {
            if (e.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + e.getValue());
                continue;
            }
            total += e.getValue();
            System.out.println("Adding item value: " + e.getValue());
            // some
            // more
            // code
            // here ...
        }
        return total;
    }

    public static void main(String[] args) {
        makeAnimalsTalk();
        System.out.println("Total value of equipments " + calculateValue(equipments));
        System.out.println("Total value of animals " + calculateValue(animals));
    }
}
