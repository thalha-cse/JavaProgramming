import java.io.IOException;
import java.util.Scanner;
public class Shutdown_System
{
    public static void main(String args[]) throws IOException
    {
        int sec;
        String operatingSystem = System.getProperty("os.name");
        System.out.println("Name of Operating System:"+operatingSystem);
        if(operatingSystem.equals("Linux"))
        {
            Runtime runtime = Runtime.getRuntime();
            Scanner s = new Scanner(System.in);
            System.out.print("Enter the no. of seconds after which you want your computer to shutdown:");
            sec = s.nextInt();
            Process proc = runtime.exec("shutdown -h -t "+sec);
            System.exit(0);
        }
        else
        {
            System.out.println("Unsupported operating system.");
        }
    }
}
