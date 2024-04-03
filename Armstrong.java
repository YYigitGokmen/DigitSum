




import java.util.Scanner;




public class Armstrong {
public static void main(String[]args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Sayı Giriniz : ");
    int number = scan.nextInt();

    int basNumber=0;
    int tempNumber = number;
    int basValue;
     int sonuc= 0;


    while (tempNumber !=0) {
    tempNumber /=10;
    basNumber++;

    }

        tempNumber = number;

        while (tempNumber !=0) {
            basValue = tempNumber % 10;
                sonuc += basValue;
            tempNumber /=10;


        }
      System.out.println("Sum of Digits : " +  sonuc);



      }
   }
