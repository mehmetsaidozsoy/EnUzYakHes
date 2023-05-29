import java.util.Scanner;
public class EnUzYakHes {
    
public static void main(String[] args) {
     int[] list = {15,12,788,1,-1,-778,2,0};
     Scanner inp=new Scanner(System.in);
     System.out.print("Sayıyı giriniz :"); //5
     int  input=inp.nextInt();
     int enKucukFark = Integer.MAX_VALUE;
     int enBuyukFark = Integer.MAX_VALUE;
     int enYakinKucuk = 0;
     int enYakinBuyuk = 0;
     
     for (int i = 0; i < list.length; i++) {
     if (list[i] < input) {
     int fark = input - list[i];
     if (fark < enKucukFark) {
     enKucukFark = fark;
     enYakinKucuk = list[i];
     }
     } else if (list[i] > input) {
     int fark = list[i] - input;
     if (fark < enBuyukFark) {
     enBuyukFark = fark;
     enYakinBuyuk = list[i];
     }
     }
     }
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + enYakinKucuk);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + enYakinBuyuk);
    
}
}