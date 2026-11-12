/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crochet.system;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lbh20b
 */
public class Utils {
    public boolean presenceCheck(String text){
        if(text.equals("")){
            return false;
        }
        return true;
    }
    
    public boolean rangeCheck(int num, int min, int max){
        if(num>=min && num<=max){
            return true;
        }
        return false;
    }
    
    public boolean lengthCheck(String text, boolean equalto, int num){
        if(equalto){
            if(text.length()==num){
                return true;
            }
            return false;
        }
        else{
            if(text.length()>num){
                return true;
            }
            return false;
        }
    }
    
    public int getID(String filename) throws FileNotFoundException, IOException{
        try{
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String id = br.readLine();
            int intid;
            try{
                intid = Integer.parseInt(id);
                FileWriter fw = new FileWriter(filename,false);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(String.valueOf(intid+1));
                bw.close();
                return intid;
            }
            catch(NumberFormatException e){
                FileWriter fw = new FileWriter(filename,false);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("1");
                bw.close();
                return 0;
            }
            
        }
        catch(FileNotFoundException e){
            FileWriter fw = new FileWriter(filename,false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("1");
            bw.close();
            return 0;
            
        }
    }
}
