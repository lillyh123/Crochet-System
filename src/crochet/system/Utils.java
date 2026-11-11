/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package crochet.system;

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
}
