/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpression;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author The Robust Coder
 */
public class FileInFolder {
    public static void main(String[] arr){
        int count=0;
        Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9$_.]*[.]java");
        File f=new File("D:\\java\\java");
        String[] s=f.list();
        for(String s1:s){
            Matcher m=p.matcher(s1);
            if(m.find()&&m.group().equals(s1)){
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("The Total Number Is :"+count);
    }
}
