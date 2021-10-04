package com.example.statedesignpattern.withstatepattern;

import android.util.Log;

public class StateContext {

    private State state;

    public StateContext() {
        state = new Idle();
    }

    public void setState(State state) {
        this.state = state;
        Log.v("===>>>","===>>> setState:");
    }

    public void perform(String message) {
        state.perform(this, message);
    }
}
