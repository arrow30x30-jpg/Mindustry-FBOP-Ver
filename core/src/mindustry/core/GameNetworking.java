package mindustry.core;

import arc.struct.*;
import mindustry.net.*;

/**
 * MULTIPLAYER DISABLED - Single-player only game logic.
 * This class handles disabling all server/client networking logic.
 */
public class GameNetworking{
    // All networking operations are now no-ops
    
    public static void init(){
        // Server networking disabled
    }
    
    public static void update(){
        // No network updates
    }
    
    public static void reset(){
        // Network reset - does nothing
    }
    
    public static void dispose(){
        // Cleanup - does nothing
    }
}
