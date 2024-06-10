import java.io.*;
import java.util.*;
public class Ch5CharacterRead {
    public static void main(String[] args) {
        try{
            File file=new File("V:\\\\VIDU\\\\java\\\\vidu.txt");
            Scanner sc= new Scanner(file);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } 
        catch(Exception e){
            System.out.println(e);
        }   
    }
}
