/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author The Robust Coder
 */
public class ValidMobileNumber {
    public static void main(String[] arr){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter A Mobile Number :");
        String mobNum=scan.next();
        Pattern p=Pattern.compile("(0|\\+91)?[7-9][0-9]{9}");
        Matcher m=p.matcher(mobNum);
        if(m.find()&&m.group().equals(mobNum)){
            System.out.println("Valid Number");
        }else{
            System.out.println("Invalid Number");
        }
    }
}
