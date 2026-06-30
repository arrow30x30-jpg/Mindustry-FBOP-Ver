package mindustry.net;

import arc.struct.*;

/**
 * MULTIPLAYER DISABLED - Stub implementation for single-player only.
 */
public class ArcNetProvider implements NetProvider{
    @Override
    public void connectClient(String ip, int port, Runnable success){
        throw new UnsupportedOperationException("Multiplayer is disabled");
    }
    
    @Override
    public void sendClient(Object object, boolean reliable){
    }
    
    @Override
    public void disconnectClient(){
    }
    
    @Override
    public void discoverServers(Cons<Host> callback, Runnable done){
        done.run();
    }
    
    @Override
    public void pingHost(String address, int port, Cons<Host> valid, Cons<Exception> failed){
        failed.get(new IOException("Multiplayer is disabled"));
    }
    
    @Override
    public void hostServer(int port){
        throw new UnsupportedOperationException("Multiplayer is disabled");
    }
    
    @Override
    public Iterable<? extends NetConnection> getConnections(){
        return new Seq<>();
    }
    
    @Override
    public void closeServer(){
    }
}
