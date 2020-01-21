//Donark Patel
//Lab 7
//Date: 4/4/2018
import java.util.Scanner; //Need for scanner
import java.io.*;


public class Lab7

    {
        public static void main (String [] args) throws IOException
        {
            //Variable
        int choose,x;
        String str,name,strExam1,strExam2;
        float exam1,exam2,exam1total,exam2total,exam1avg,exam2avg;

        exam1total = 0;
        exam2total = 0;
        x=1;
        //User input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter one of the following: \n (1)Class Average(Exam 1,Exam 2) \n (2)Student Average \n (3) " +
                          " Studard Deviations \n (4) Letter Grades \n (5) Minimum/Maximum \n (6) Locate grades with name \n " +
                "(7) Difference between tests >15% \n (8) Histogram \n (9) Update Data \n (10) Quit");
        choose = keyboard.nextInt();
        //File input
        File MyFile = new File("inputfile.txt");
        Scanner inFile = new Scanner(MyFile);

        //*************
        // Class Average
        //*************
        if (choose == 1)
        {
            System.out.println("*******Class Average*******");
            inFile = new Scanner(MyFile);
            inFile.nextLine();
            System.out.println("*******Class Average*******");
           while (x <= 25)
           {
            str=inFile.nextLine();
            name=str.substring(0,9).trim();
            strExam1=str.substring(10,14).trim();
            exam1=Float.parseFloat(strExam1);
            strExam2=str.substring(15,16).trim();
            exam2=Float.parseFloat(strExam2);
            exam1total =exam1total+exam1;
            exam2total =exam2total+exam2;
           }
            exam1avg= exam1total/25;
            exam2avg=exam2total/25;

            System.out.println("Exam: 1 average: "+exam1avg);
            System.out.println("Exam: 1 average: "+exam2avg);
        }






























        }


        }


























