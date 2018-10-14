/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regularexpression;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author The Robust Coder
 */
public class ReadTextInFile {
    public static void main(String[] arr) throws FileNotFoundException, IOException{
        Pattern p=Pattern.compile("(0|\\+91)?[7-9][0-9]{9}");
        PrintWriter pw=new PrintWriter("output.txt");
        BufferedReader b=new BufferedReader(new FileReader("myfile.txt"));
        String line=b.readLine();
        while(line!=null){
            Matcher m=p.matcher(line);
            while(m.find()){
                pw.println(m.group());
            }
            line=b.readLine();
        }
        pw.flush();
        b.close();
        pw.close();
    }
}
