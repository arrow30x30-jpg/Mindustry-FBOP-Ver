package mindustry.net;

import arc.*;
import arc.struct.*;
import arc.util.*;
import mindustry.core.*;
import mindustry.game.*;
import mindustry.gen.*;

import java.io.*;

/**
 * MULTIPLAYER DISABLED - This version is single-player only.
 * All networking functionality has been removed.
 */
public class Net{
    public static final int version = 8;
    public static final String versionType = "official";
    private static final int version = 8;
    
    private boolean active = false, server = false;
    
    public void reset(){
        active = false;
        server = false;
    }
    
    public boolean active(){
        return false;
    }
    
    public boolean server(){
        return false;
    }
    
    public boolean client(){
        return false;
    }
    
    public void dispose(){
        active = false;
        server = false;
    }
    
    // Stub methods - these do nothing in single-player mode
    public void handleClientReceived(Object object){
    }
    
    public void handleServerReceived(NetConnection connection, Object object){
    }
    
    public void disconnectClient(){
    }
    
    public void host(int port) throws IOException{
        throw new UnsupportedOperationException("Multiplayer is disabled in this version");
    }
    
    public void connectClient(String ip, int port, Runnable success) throws IOException{
        throw new UnsupportedOperationException("Multiplayer is disabled in this version");
    }
    
    public void sendClient(Object object, boolean reliable){
    }
    
    public void pingHost(String address, int port, Cons<Host> valid, Cons<Exception> failed){
        failed.get(new IOException("Multiplayer is disabled"));
    }
    
    public Iterable<? extends NetConnection> getConnections(){
        return new Seq<>();
    }
    
    public void closeServer(){
    }
    
    public static class Host{
        public String address;
        public int port;
        public String name;
        public int version;
    }
}
