/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crochet.system;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author lbh20b
 */
public class Data {
    public static Map<String, ProductsRecord> productMap = new HashMap();
    public static Map<String, AdviceRecord> adviceMap = new HashMap();
    public static Map<String, UserProjectsRecord> projectsMap = new HashMap();
    
    public void projectsIntoRecords() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("UserProjects.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            String items[] = line.split(",");
            String id = items[0];
            String title = items[1];
            String description = items[2];
            String type = items[3];
            String row = items[4];
            String pattern = items[5];
            String dateStarted = items[6];
            
            UserProjectsRecord u = new UserProjectsRecord(Integer.valueOf(id),title,description,type,Integer.valueOf(row),pattern,dateStarted);
            Data.projectsMap.put(String.valueOf(id), u);
        }
    }
    
    public void productsIntoRecords() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("Products.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            String items[] = line.split(",");
            int id = Integer.parseInt(items[0]);
            String itemname = items[1];
            String description = items[2];
            float price = Float.parseFloat(items[3]);
            String unit = items[4];
            String size = items[5];
            String type = items[6];
            int quantity = Integer.parseInt(items[7]);
            String seller = items[8];
            String rating = items[9];
            
            ProductsRecord p = new ProductsRecord(id,itemname,description,price,unit,size,type,quantity,seller,rating);
            Data.productMap.put(String.valueOf(id),p);
            
        }
    }
    
    public void adviceIntoRecords() throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("Advice.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line=br.readLine())!=null){
            String items[] = line.split(",");
            int id = Integer.parseInt(items[0]);
            String title = items[1];
            String content = items[2];
            String type = items[3];
            String adviser = items[4];
            int noReports = Integer.parseInt(items[5]);
            
            AdviceRecord a = new AdviceRecord(id,title,content,type,adviser,noReports);
               Data.adviceMap.put(String.valueOf(id), a);
        }
    }
    

    
}

