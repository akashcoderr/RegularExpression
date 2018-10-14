/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpression;

import java.util.regex.Pattern;

/**
 *
 * @author The Robust Coder
 */
public class PatternSplitDomain {
    public static void main(String[] arr){
        Pattern p=Pattern.compile("[.]");
        String[] m=p.split("www.google.com");
        for(String s:m){
            System.out.println(s);
        }
    }
}
