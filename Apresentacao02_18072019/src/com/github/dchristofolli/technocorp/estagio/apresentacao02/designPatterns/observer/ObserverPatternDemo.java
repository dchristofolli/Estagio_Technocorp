package com.github.dchristofolli.technocorp.estagio.apresentacao02.designPatterns.observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Observable observable = new Observable();

        new HexaObserver(observable);
        new OctalObserver(observable);
        new BinaryObserver(observable);

        System.out.println("First state change: 15");
        observable.setState(15);
        System.out.println("Second state change: 10");
        observable.setState(10);
    }
}