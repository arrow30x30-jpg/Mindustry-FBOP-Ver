package mindustry.net;

import arc.struct.*;

/**
 * MULTIPLAYER DISABLED - Stub interface for single-player only.
 */
public interface NetProvider{
    void connectClient(String ip, int port, Runnable success) throws java.io.IOException;
    void sendClient(Object object, boolean reliable);
    void disconnectClient();
    void discoverServers(Cons<Net.Host> callback, Runnable done);
    void pingHost(String address, int port, Cons<Net.Host> valid, Cons<Exception> failed);
    void hostServer(int port) throws java.io.IOException;
    Iterable<? extends NetConnection> getConnections();
    void closeServer();
    default void dispose(){
        disconnectClient();
    }
}
