import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class TestClass {


    public static void main(String[] args) throws IOException {

        double kFold=1;
        TrainClass Train =new TrainClass();

        for (int i=0;i<kFold;i++)
        {
            Train.Start();
            Scanner scanner = new Scanner(new FileInputStream("iris.txt"));


        }








    }



}
