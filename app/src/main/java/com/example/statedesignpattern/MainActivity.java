package com.example.statedesignpattern;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.statedesignpattern.withoutstate.VPNStateManager;
import com.example.statedesignpattern.withstatepattern.StateContext;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Log.v("===>>> ","===>>> oncreate");
        VPNStateManager vpnManager = new VPNStateManager();

        vpnManager.setState(Type.CONNECT);
        vpnManager.performOperation();

        vpnManager.setState(Type.DISCONNECT);
        vpnManager.performOperation();

        vpnManager.setState(Type.BYPASS);
        vpnManager.performOperation();

        vpnManager.setState(Type.INACTIVE);
        vpnManager.performOperation();*/

        StateContext stateContext = new StateContext();
        stateContext.perform("Connected");
        stateContext.perform("BypassState");
        stateContext.perform("InactiveState");
        stateContext.perform("DisconnectState");
    }
}