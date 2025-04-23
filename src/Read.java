import javax.imageio.IIOException;
import java.io.*;
import java.util.Scanner;

public class Read {

    public static void main (String[] args){

            StringBuilder content = new StringBuilder();
            try {
                File file = new File("quotes.txt");
                Scanner scan = new Scanner(file);
                while (scan.hasNext()){
                    String line = scan.nextLine();
                    System.out.println(line);
                }
            }
            catch (FileNotFoundException fnt){
                System.out.println("File not Found!");
                fnt.printStackTrace();
            }
            try {
                BufferedReader reader = new BufferedReader(new FileReader("quotes.txt"));
                String line1;
                while ((line1 = reader.readLine()) != null){
                    System.out.println(line1);
                }
            }
            catch (IOException e){
                System.out.println("Error Reding The File!");
            }
            Scanner keyscanner = new Scanner(System.in);
        System.out.println("inter ur pet Age :");
        int humnayear = Integer.parseInt(keyscanner.nextLine());
        int catyear = humnayear * 5;
        int dogyear = humnayear * 4;
        System.out.println("In cat year its = " + catyear);
        System.out.println("In dog year its = " + dogyear);



    }
}
