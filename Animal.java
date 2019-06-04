package com.trimind.training.java07.HOME01;

public class Animal {
    public void greeting() {

    }

    public class Cat extends Animal {
        @Override
        public void greeting() {
            System.out.println("Meow!");
        }
    }

    public class Dog extends Animal {
        @Override
        public void greeting() {
            System.out.println("Woof!");
        }

        public void greeting(Dog another) {
            System.out.println("Woooooooooof!");
        }
    }

    public class BigDog extends Dog {
        @Override
        public void greeting() {
            System.out.println("Woow!");
        }

        @Override
        public void greeting(Dog another) {
            System.out.println("Woooooowwwww!");
        }
    }
}

