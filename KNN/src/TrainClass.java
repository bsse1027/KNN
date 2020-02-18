import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TrainClass {

    public void Start() throws IOException {

        BufferedReader input =new BufferedReader(new FileReader("iris.txt"));

        Scanner scanner = new Scanner(new FileInputStream("iris.txt"));
        int countLine=0, TestStart,readCount=0,kFold=10;
        int max=countLine,min=1;

       /* ArrayList<Double> Iris_Setosa=new ArrayList<Double>();
        ArrayList<Double> Iris_Versicolor=new ArrayList<Double>();
        ArrayList<Double> Iris_Virginia=new ArrayList<Double>();*/
       while (input.readLine()!=null)
       {
           countLine++;


       }
        System.out.println(countLine);

        Random random=new Random();
        TestStart = (int) (Math.random() * (max - min + 1) + min);

        System.out.println(TestStart);

        int TestBound= TestStart +(countLine/kFold)-1;

        System.out.println(TestBound);




        double p1,p2,p3,p4;
        String className;
        ArrayList<Points> testPoints =new ArrayList<Points>();


        scanner.useDelimiter(",");

        for(int i=0;i<countLine;i++){

            readCount++;
            /*System.out.println(readCount);*/

            if (readCount>= TestStart && readCount<=TestBound)

            {
                continue;
            }

            p1=scanner.nextDouble();
            p2=scanner.nextDouble();
            p3=scanner.nextDouble();
            p4=scanner.nextDouble();
            className=scanner.nextLine();

            Points newPoint=new Points(p1,p2,p3,p4,className);
            testPoints.add(newPoint);

        }

        scanner.close();
        System.out.println(testPoints);
        System.out.println(testPoints.size());




    }


}
