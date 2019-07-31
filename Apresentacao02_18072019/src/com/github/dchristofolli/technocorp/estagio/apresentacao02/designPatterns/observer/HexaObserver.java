package com.github.dchristofolli.technocorp.estagio.apresentacao02.designPatterns.observer;

public class HexaObserver extends Observer{

    public HexaObserver(Observable observable){
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString( observable.getState() ).toUpperCase() );
    }
}

