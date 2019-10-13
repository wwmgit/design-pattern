package com.wwm.pattern.strategy.comparator;

public class StrategyTest {

    public static void main(String[] args) {
        Cat[] array = {new Cat(1, 8), new Cat(5, 4), new Cat(2, 6)};
        Sorter<Cat> sorter = new Sorter<Cat>();
        sorter.sort(array, new CatAgeComparator());  
        for (Cat cat : array) {
            System.out.println(cat);
        }
    }

}
