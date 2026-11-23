/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package crochet.system;

import java.io.IOException;

/**
 *
 * @author lbh20b
 */
public class CrochetSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        MainMenu mainmenu = new MainMenu(0);
        Utils u1 = new Utils();
        Data d1 = new Data();
        
        d1.projectsIntoRecords();
        d1.productsIntoRecords();
        d1.adviceIntoRecords();
        
        mainmenu.setVisible(true);
        mainmenu.loadAdviceItems();
        mainmenu.loadProducts();
        //mainmenu.loadProjects();
        
        
    }
    
}
