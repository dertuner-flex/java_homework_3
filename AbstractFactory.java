package com.company;

class AbstractFactory {
    private BaseFactory getFactory;

    AbstractFactory(BaseFactory factory) {
        getFactory = factory;
    }

    void someMotion() {

        getFactory.createCircle().paint();
        getFactory.createTriangle().paint();
    }
}
