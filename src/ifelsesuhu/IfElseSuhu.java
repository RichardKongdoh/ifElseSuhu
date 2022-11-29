package ifelsesuhu;

import java.util.Scanner;

public class IfElseSuhu {

    public static void main(String[] args) {
        int suhu;
      
      Scanner key = new Scanner(System.in);
      
      System.out.print("masukkan suhu = ");
      suhu = key.nextInt();
      
      if ( suhu >= 32){
          System.out.println(" cuaca sangat panas");    
      } else if ( suhu <= 31 && suhu >=27){
          System.out.println(" cuaca panas");
      } else if ( suhu <= 26 && suhu >=16){
          System.out.println("cuaca normal");
      } else if ( suhu <= 15 && suhu >= 5 ){
          System.out.println(" cuaca dingin");
      } else {
          System.out.println(" cuaca sangat dingin");
      }
      
    }
    
}
