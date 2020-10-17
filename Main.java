package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        final Random random = new Random();
        boolean favorite = random.nextBoolean();
        AbstractFactory factory;
        if(favorite == false)
            factory = new AbstractFactory(new WhiteFactory());
        else
            factory = new AbstractFactory(new BlackFactory());
        factory.someMotion();


    }
}
