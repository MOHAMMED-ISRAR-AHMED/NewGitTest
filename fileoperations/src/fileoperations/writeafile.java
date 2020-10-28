package fileoperations;

import java.io.*;  
public class writeafile{    
public static void main(String args[])throws Exception{    
     FileOutputStream fout=new FileOutputStream("/home/smitha/Desktop/israr/testout.txt");    
     BufferedOutputStream bout=new BufferedOutputStream(fout);    
     String s="Welcome to girmiti software.";    
     byte b[]=s.getBytes();    
     bout.write(b);    
     bout.flush();    // it means to clear the stream of any element that may be or maybe not inside the stream. It neither accepts any parameter nor returns any value.
     bout.close();    
     fout.close();    
     System.out.println("success");    
}    
}  