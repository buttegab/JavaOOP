package net.gabriel.huffman;
import java.io.*;

public class Reader {
	public String wordNumber(String fileName) {
		int total = 0;  
		String words = "";
		try {
	           File myFile = new File(fileName);
	           FileReader fileReader = new FileReader(myFile);
	           BufferedReader reader = new BufferedReader(fileReader);
	           String line = null;
	           while ((line = reader.readLine()) != null) {
	              total = total + line.trim().split("\\s+").length;
	              words = words + line;
	              
	              
	              
	           }
	           
	           reader.close();
	       } catch(Exception ex) {
	            ex.printStackTrace();
	       }
		return words;
	}
	
	
	public static void main(String[] args) {
	    Reader reader = new Reader();
	    System.out.println(reader.wordNumber("MyText.txt"));

	}

}
