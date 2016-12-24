import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 *
 * @author Owner
 */
public class MakesJarTextFile 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        if (args[0]!=null && args[1]!=null && args[0].endsWith(".txt"))
        {
            try
            {
                FileOutputStream streamy = new FileOutputStream(new File(args[0]));
                PrintWriter trial = new PrintWriter(streamy);
                trial.println("Main-Class: "+args[1]);
                trial.close();
            }
            catch (Exception e)
            {
                
            }
        }
    }
    
}
