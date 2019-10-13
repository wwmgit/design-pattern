package com.wwm.pattern.strategy.comparator;

public class CatAgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if(o1.getAge() < o2.getAge()){
            return -1;
        }
        if(o1.getAge() > o2.getAge()){
            return 1;
        }
        return 0;
    }
}
