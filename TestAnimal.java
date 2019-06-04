package com.trimind.training.java07.HOME01;

public class TestAnimal
{
        public static void main(String[] args)
        {
            // Using the subclasses
            Animal cat1 = new  Animal();
            cat1.greeting();
            Animal dog1 = new Animal();
            dog1.greeting();
            Animal bigDog1 = new Animal();
            bigDog1.greeting();

            Animal animal1 = new Animal();
            animal1.greeting();
            Animal animal2 = new Animal();
            animal2.greeting();
            Animal animal3 = new Animal();
            animal3.greeting();

            Animal dog2 = (Animal.Dog)animal2;
            Animal.BigDog bigDog2 = (Animal.BigDog)animal3;
            Animal.Dog dog3 = (Animal.Dog)animal3;

        }
}



