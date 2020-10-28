package fileoperations;

import java.io.File;
import java.io.FileOutputStream;  
import java.util.Scanner;

public class deleteafile {

	public static void main(String[] args) {
	try{    
		File myObj = new File("/home/smitha/Desktop/israr/testout.txt"); 
	    if (myObj.delete()) { 
	      System.out.println("Deleted the file: " + myObj.getName());
	    } else {
	      System.out.println("Failed to delete the file.");
	    } 
	    System.out.println("success...");    
	    }
	catch(Exception e)
	{System.out.println(e);}    
}
}