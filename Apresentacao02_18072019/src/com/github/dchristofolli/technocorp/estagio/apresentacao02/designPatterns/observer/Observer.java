package com.github.dchristofolli.technocorp.estagio.apresentacao02.designPatterns.observer;

public abstract class Observer {
    protected Observable observable;
    public abstract void update();
}
