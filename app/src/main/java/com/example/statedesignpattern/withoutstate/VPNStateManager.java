package com.example.statedesignpattern.withoutstate;

import android.util.Log;

import com.example.statedesignpattern.Type;


public class VPNStateManager {

    private Type state;

    public VPNStateManager() {

    }

    public void setState(Type state) {
        this.state = state;
    }

    public void performOperation() {
        Log.v("===>>>", "===>>> performOperation..." + state);
        if (state == Type.CONNECT) {
            Log.v("===>>>", "===>>> VPN is connecting...");
        } else if (state == Type.DISCONNECT) {
            Log.v("===>>>", "===>>> VPN is disconnecting...");
        } else if (state == Type.BYPASS) {
            Log.v("===>>>", "===>>> VPN is Bypass...");
        } else if (state == Type.INACTIVE) {
            Log.v("===>>>", "===>>> VPN is inactive...");
        }
    }
}
