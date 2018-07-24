package com.design.proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface HelloRemote extends Remote {
    HelloWorld getHello() throws RemoteException;
}
