package mindustry.net;

import arc.struct.*;
import mindustry.gen.*;

/**
 * MULTIPLAYER DISABLED - Stub class for single-player only version.
 */
public class NetConnection{
    public Player player;
    public String address = "local";
    public String uuid;
    public boolean hasConnected = false;
    public boolean hasDisconnected = false;
    
    public boolean isConnected(){
        return false;
    }
    
    public void kick(Object reason){
    }
    
    public void send(Object object, boolean reliable){
    }
}
