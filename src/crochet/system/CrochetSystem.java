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
        d1.basketItemsIntoRecords();
        
        mainmenu.setVisible(true);
        mainmenu.loadAdviceItems();
        mainmenu.loadProducts();
        //mainmenu.loadProjects();
        
        
        
        // u1.editFileContent("TEST.txt", 0, "0, hello, will need to convert array to a string, test");  - works, but maybe put in a try catch
        
        
    }
    
}
