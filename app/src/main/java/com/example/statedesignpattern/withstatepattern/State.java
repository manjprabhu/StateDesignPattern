package com.example.statedesignpattern.withstatepattern;

public abstract class State {

    public abstract void perform(StateContext stateContext, String message);
}
