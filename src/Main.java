import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.println("Yıl Giriniz:");
        yil= input.nextInt();


        if( yil%100 == 0 && yil%400 == 0){;
            System.out.print(yil);
            System.out.print("Artık yıldır.");
        }
        else if(!(yil%100 == 0) && !(yil%400 == 0)){
            if(yil%4 == 0){
                System.out.print(yil);
                System.out.print(" Artık yıldır.");
            }
            else{
                System.out.print(yil);
                System.out.print(" Artık yıl değildir.");
            }
        }
        else{
            System.out.print(yil);
            System.out.print(" Artık yıl değildir.");
        }
    }
}