/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpression;

/**
 *
 * @author The Robust Coder
 */
public class StringSplit {
    public static void main(String[] arr){
        String s="www.google.com";
        String[] sar=s.split("\\.");
        for(String ss:sar){
            System.out.println(ss);
        }
    }
}
