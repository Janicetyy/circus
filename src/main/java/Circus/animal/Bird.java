package Circus.animal;

import Circus.Circus;
import Circus.animal.Animal;

public abstract class Bird extends Animal {
    //Abstract classes don't have to implement every method of the child class
    public void fly() {
        System.out.println("Whee ...");
    }
}
