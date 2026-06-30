package mindustry.net;

/**
 * MULTIPLAYER DISABLED - Stub packet class.
 */
public class Packet{
    public static final int priorityHigh = 0;
    public static final int priorityNormal = 1;
    public static final int priorityLow = 2;
    
    public int getPriority(){
        return priorityNormal;
    }
    
    public boolean allow(boolean isServer){
        return false;
    }
    
    public void handled(){}
    public void handleClient(){}
    public void handleServer(NetConnection connection){}
}
