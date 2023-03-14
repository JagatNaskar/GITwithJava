package java_Collection_10thMarch;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class FileReader {
	    public static void main(String[] args) throws IOException
	    {
	     
	        String str = "Mike testing 1, 2, 3....";
	        FileWriter fw=null;
	        try
	        {
	            fw = new FileWriter("/Users/jagatnasakar/eclipse-workspace/javaCodes/springcore2/src/main/java/java_Collection_10thMarch/WritingFile.txt");
	        }
	        catch (FileNotFoundException fe)
	        {
	            System.out.println("File not found");
	        }
	        
	        for (int i = 0; i < str.length(); i++)
	        {
	            fw.write(str.charAt(i));
	            System.out.print(str.charAt(i));
	        }System.out.println();
	        System.out.println("Writing successful");
	        //close the file
	        fw.close();
	    }
	
}