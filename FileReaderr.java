package java_Collection_10thMarch;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderr {
	    public static void main(String[] args) throws IOException
	    {
	        int ch;
	        FileReader fr=null;
	        
	        try
	        {
	            fr = new FileReader("/Users/jagatnasakar/eclipse-workspace/javaCodes/springcore2/src/main/java/java_Collection_10thMarch/ReadingFile.txt");
	        }
	        catch (FileNotFoundException fe)
	        {
	            System.out.println("File_not_found");
	        }
	 
	        // read from FileReader 
	        while ((ch=fr.read())!=-1)
	            System.out.print((char)ch);
	 
	       System.out.println("...................");
	        fr.close();
	        System.out.println("_________________________________________________________________________________________________");
	    }
	
}
