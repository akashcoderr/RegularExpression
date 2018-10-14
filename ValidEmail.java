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
public class ValidEmail {
    public static void main(String[] arr){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter A Email Id :");
        String mobNum=scan.next();
        Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
        //for gamil "[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com"
        //for yahoo "[a-zA-Z0-9][a-zA-Z0-9_.]*@yahoo[.]co[.]in"
        Matcher m=p.matcher(mobNum);
        if(m.find()&&m.group().equals(mobNum)){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email");
        }
    }
}
