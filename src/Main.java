import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Artık Yıl Hesaplama Programı");
        System.out.print("Yıl Girin : ");
        year = scanner.nextInt();

        if(year%4 == 0){
            if(year%100 == 0 && year%400 != 0){
                System.out.println(year + " yılı 4'ün katı olmasına rağmen artık yıl sayılmamaktadır.");
            }else{
                System.out.println(year + " yılı bir artık yıldır. ");
            }
        }else{
            System.out.println(year + " yılı bir artık yıl değildir. ");
        }
    }
}
