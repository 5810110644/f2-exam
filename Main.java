import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args){ 
        try{
        Scanner sc = new Scanner(new File("file.txt"));
        System.out.println("Found file");
        System.out.println(sc.nextLine());
        
        }catch(FileNotFoundException e){
            System.out.println("File not Found");
        }

}
}