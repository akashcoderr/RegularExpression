/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpression;

import java.util.StringTokenizer;

/**
 *
 * @author The Robust Coder
 */
public class StringTokenizerCustPattern {
    public static void main(String[] arr){
        StringTokenizer st=new StringTokenizer("akash.kumar.prajapati","\\.");
        while(st.hasMoreTokens()){//hasMoreElemnemts()
            System.out.println(st.nextToken());//nextElement()
        }
    }
}
