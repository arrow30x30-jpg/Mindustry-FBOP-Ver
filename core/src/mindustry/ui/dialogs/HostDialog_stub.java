package mindustry.ui.dialogs;

import arc.scene.ui.*;
import arc.util.*;
import mindustry.graphics.*;

/**
 * MULTIPLAYER DISABLED - Stub for host dialog.
 * Server hosting is not available in this single-player version.
 */
public class HostDialog extends Dialog{
    public HostDialog(){
        super("@hostserver");
        addCloseButton();
        
        cont.add("@hostserver.disabled").pad(20f);
    }
}
