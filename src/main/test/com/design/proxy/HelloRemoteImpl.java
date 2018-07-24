package com.design.proxy;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloRemoteImpl extends UnicastRemoteObject implements HelloRemote {

    public HelloRemoteImpl() throws RemoteException {
    }

    @Override
    public HelloWorld getHello() throws RemoteException {
        return null;
    }

    public static void main(String[] agrs) {
        try{
            HelloRemote helloRemote=new HelloRemoteImpl();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
