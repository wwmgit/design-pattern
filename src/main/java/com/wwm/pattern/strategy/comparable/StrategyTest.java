package com.wwm.pattern.strategy.comparable;

public class StrategyTest {

    public static void main(String[] args) {
        Dog[] array = {new Dog(1), new Dog(5), new Dog(2)};
        Sorter sorter = new Sorter();
        sorter.sort(array);
        for (Dog dog : array) {
            System.out.println(dog);
        }
    }

}
