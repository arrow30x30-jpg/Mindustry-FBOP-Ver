package mindustry.core;

import arc.util.*;
import mindustry.gen.*;
import mindustry.net.*;

import static mindustry.Vars.*;

/**
 * MULTIPLAYER DISABLED - Single-player only stub.
 */
public class NetClient{
    public void update(){}
    public void reset(){}
    public void setQuiet(){}
    public static void traceInfo(Player player, Object info){}
    public boolean isConnecting(){ return false; }
    public boolean isConnected(){ return false; }
    public void send(Object object, boolean reliable){}
}
