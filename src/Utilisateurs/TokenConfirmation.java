/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilisateurs;

import com.codename1.ui.Button;
import com.codename1.ui.Container;
import com.codename1.ui.Form;
import com.codename1.ui.TextField;
import com.codename1.ui.Toolbar;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;
import com.codename1.ui.util.UIBuilder;

/**
 *
 * @author aziz
 */
public class TokenConfirmation {
    private Resources theme;
    private Form current, f1;
    private Container c1;
    private UIBuilder uiBuilder;

    public TokenConfirmation() {
        theme = UIManager.initFirstTheme("/theme");

        // Enable Toolbar on all Forms by default
        Toolbar.setGlobalToolbar(true);
    }
    
    public void start() {
        uiBuilder = new UIBuilder (); 
        c1 =uiBuilder.createContainer(theme, "verif_mp");
        TextField login = (TextField)uiBuilder.findByName("User", c1);
        TextField email = (TextField)uiBuilder.findByName("email", c1);
        Button bt_val =(Button)uiBuilder.findByName(("bt_val"), c1);

        f1=(Form)c1;
        f1.getToolbar().addCommandToLeftBar("<", null, e->new Login().start());  
        f1.show();
    }
    
}
