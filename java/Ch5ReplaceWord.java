import java.io.*;
import java.util.*;
public class Ch5ReplaceWord
{
    public static void main(String[] args) 
    {
        try 
        {
            File file = new File("Vidu.txt");
            Scanner sc = new Scanner(file);
            FileWriter writer = new FileWriter(new File("a.txt"));
            while (sc.hasNextLine()) 
            {
                String line = sc.nextLine();
                System.out.println(line);
                line = line.replaceAll("vidisha", "vidu");
                writer.append(line);
            }
            writer.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
    }
}
