package mindustry.core;

import mindustry.net.*;

/**
 * MULTIPLAYER DISABLED - Stub implementation for single-player only.
 */
public class NetClient{
    public void update(){}
    public void reset(){}
    public void setQuiet(){}
    public void traceInfo(Player player, TraceInfo info){}
    public boolean isConnecting(){ return false; }
    public boolean isConnected(){ return false; }
    public void send(Object object, boolean reliable){}
}
