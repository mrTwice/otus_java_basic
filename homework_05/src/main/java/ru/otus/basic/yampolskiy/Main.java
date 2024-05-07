package ru.otus.basic.yampolskiy;

import ru.otus.basic.yampolskiy.animals.Cat;
import ru.otus.basic.yampolskiy.animals.Dog;
import ru.otus.basic.yampolskiy.animals.Horse;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Пушок", 1, 10);
        System.out.println(cat.run(12));
        cat.info();
        System.out.println(cat.swim(1));

        Dog dog = new Dog("Бобик", 2, 1, 20);
        System.out.println(dog.run(30));
        dog.info();
        dog.setCurrentEndurance(20);
        dog.info();
        System.out.println(dog.swim(11));

        Horse horse = new Horse("Мерен", 4, 2, 40);
        System.out.println(horse.run(50));
        horse.info();
        horse.setCurrentEndurance(40);
        horse.info();
        System.out.println(horse.swim(20));
    }
}