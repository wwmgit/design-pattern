package com.wwm.pattern.strategy.comparable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Dog implements Comparable<Dog> {

    private int food;

    @Override
    public int compareTo(Dog dog) {
        if(this.food < dog.food){
            return -1;
        }
        if(this.food > dog.food){
            return 1;
        }
        return 0;
    }
}
