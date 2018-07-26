package com.design.proxy;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRemoteImpl extends UnicastRemoteObject implements HelloRemote {

    public HelloRemoteImpl() throws RemoteException {
    }

    @Override
    public HelloWorld getHello() throws RemoteException {
        HelloWorld helloWorld = new HelloWorld();
        return helloWorld;
    }

    public static void main(String[] args) {
        try {
            HelloRemote helloRemote = new HelloRemoteImpl();
            Naming.rebind("HelloWorld", helloRemote);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
