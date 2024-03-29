package com.github.dchristofolli.technocorp.estagio.apresentacao02.designPatterns.observer;

public class BinaryObserver extends Observer{

    public BinaryObserver(Observable observable){
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Binary String: " + Integer.toBinaryString( observable.getState() ) );
    }
}
