package com.github.dchristofolli.technocorp.estagio.apresentacao02.designPatterns.observer;

public class OctalObserver extends Observer{

    public OctalObserver(Observable observable){
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println( "Octal String: " + Integer.toOctalString( observable.getState() ) );
    }
}
