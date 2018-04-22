/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import com.codename1.ui.Dialog;
import com.codename1.ui.Display;
import com.codename1.ui.FontImage;
import com.codename1.ui.Form;
import com.codename1.ui.Toolbar;
import com.codename1.ui.events.ActionEvent;
import com.codename1.ui.events.ActionListener;
import com.codename1.ui.layouts.BorderLayout;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

/**
 *
 * @author escobar
 */
public class ClientAcceuil {
     private Form current;
    private Resources theme;

    public ClientAcceuil() {
         theme = UIManager.initFirstTheme("/theme");

        // Enable Toolbar on all Forms by default
        Toolbar.setGlobalToolbar(true);

    }
    
    public void start() {
        if (current != null) {
            current.show();
            return;
        }
        Form hi = new Form("Acceuil", new BorderLayout(BorderLayout.CENTER_BEHAVIOR_CENTER_ABSOLUTE));
      
        Toolbar tb = hi.getToolbar();
      
       
        tb.addMaterialCommandToSideMenu("Produit", FontImage.MATERIAL_WEB, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
               Client.ClientProduit clientTemplate = new ClientProduit();
               clientTemplate.startClientProduit();

            }
        });
       
        tb.addMaterialCommandToSideMenu("Formation", FontImage.MATERIAL_WEB, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                    Client.ClientFormation clientTemplate = new ClientFormation();
                    clientTemplate.startClientFormation();}
        });
        tb.addMaterialCommandToSideMenu("Recette", FontImage.MATERIAL_WEB, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
             Client.ClientTemplate clientTemplate = new ClientTemplate();
                    clientTemplate.startClientTemplate();
            }
        });
       
        tb.addMaterialCommandToSideMenu("Commande", FontImage.MATERIAL_WEB, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                
             Client.ClientCommande clientTemplate = new ClientCommande();
                    clientTemplate.startClientCommande();

            }
        });
        tb.addMaterialCommandToSideMenu("Panier", FontImage.MATERIAL_WEB, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
             Client.ClientPanier clientTemplate = new ClientPanier();
                    clientTemplate.startClientPanier();

            }
        });
        tb.addMaterialCommandToSideMenu("Promotion", FontImage.MATERIAL_WEB, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
             Client.ClientPromotion clientTemplate = new ClientPromotion();
                    clientTemplate.startClientPromotion();
            }
        });
        hi.show();
    }

    public void stop() {
        current = Display.getInstance().getCurrent();
        if (current instanceof Dialog) {
            ((Dialog) current).dispose();
            current = Display.getInstance().getCurrent();
        }
    }

    public void destroy() {
    }

    
}
