package mindustry.ui.dialogs;

import arc.scene.ui.*;
import arc.util.*;
import mindustry.graphics.*;

/**
 * MULTIPLAYER DISABLED - Stub for join dialog.
 * Connecting to multiplayer servers is not available in this single-player version.
 */
public class JoinDialog extends Dialog{
    public JoinDialog(){
        super("@joingame");
        addCloseButton();
        
        cont.add("@joingame.disabled").pad(20f);
    }
}
