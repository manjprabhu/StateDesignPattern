package com.example.statedesignpattern.withstatepattern;

import android.util.Log;

public class InactiveState extends State {
    @Override
    public void perform(StateContext stateContext, String message) {
        Log.v("===>>>", "===>>> VPN is "+ message);
        stateContext.setState(new DisconnectState());
    }
}
