import java.sql.SQLOutput;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Total Percentage Of Subject:");
        float sum1 = sc.nextFloat();
        System.out.println("Physics:");
        float sum2 = sc.nextFloat();
        System.out.println("Chemistry:");
        float sum3 = sc.nextFloat();
        System.out.println("Mathematics:");
        float sum4 = sc.nextFloat();
        System.out.println("Java:");
        float sum5 = sc.nextFloat();
        System.out.println("Programming In C:");
        Float sum6 = sc.nextFloat();
        System.out.println("economics");
        Float sum = sum1+sum2+sum3+sum4+sum5+sum6;
        System.out.println(sum);
        Float  average = sum*100/600;
        System.out.println("total percentage is:" + average);



    }
}



