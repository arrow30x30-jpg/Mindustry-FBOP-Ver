package mindustry.core;

import mindustry.net.*;

/**
 * MULTIPLAYER DISABLED - Stub implementation for single-player only.
 * Server functionality has been completely removed.
 */
public class NetServer implements ApplicationListener{
    public Administration admins = new Administration();
    public CommandHandler clientCommands = new CommandHandler("/");
    
    public NetServer(){
    }
    
    @Override
    public void init(){
    }
    
    @Override
    public void update(){
    }
    
    public void openServer(){
        throw new UnsupportedOperationException("Multiplayer is disabled in this version");
    }
    
    public void kickAll(KickReason reason){
    }
}
