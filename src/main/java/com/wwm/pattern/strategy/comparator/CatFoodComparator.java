package com.wwm.pattern.strategy.comparator;

public class CatFoodComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getFood() < o2.getFood()) {
            return -1;
        }
        if (o1.getFood() > o2.getFood()) {
            return 1;
        }
        return 0;
    }
}
