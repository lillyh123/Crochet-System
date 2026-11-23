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
    
    public boolean typeCheck(String num, String datatype){
        if(datatype.equals("Int")){
            int number = 0;
            try{
                number = Integer.parseInt(num);
                return true;
            }
            catch(NumberFormatException e){
                return false;
            }
        }
        else if(datatype.equals("Float")){
            float number = 0;
            try{
                number = Float.parseFloat(num);
                return true;
            }
            catch(NumberFormatException e){
                return false;
            }
        }
        return false;
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
    
    public void writeToFile(String filename, String data) throws IOException{
        FileWriter fw = new FileWriter(filename,true);
        BufferedWriter br = new BufferedWriter(fw);
        br.write(data);
        br.newLine();
        br.close();
    }
    
    public String getRecordBasedOnId(String filename, int id) throws FileNotFoundException{
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        // read record
        return "";
    }
    
    public int countReports(String adviceid) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader("Advice.txt");
        BufferedReader br = new BufferedReader(fr);
        int count = 0;
        String line;
        while((line=br.readLine())!=null){
            String items[] = line.split(",");
            if(items[1].equals(adviceid)){
                count ++;
            }
        }
        return count;
    }
  
    public String getAllFileContent(String filename) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(filename);
        BufferedReader br = new BufferedReader(fr);
        String content = "";
        String line;
        while((line=br.readLine())!=null){
            content = content+"\n"+line;
        }
        return content;
    }
}
