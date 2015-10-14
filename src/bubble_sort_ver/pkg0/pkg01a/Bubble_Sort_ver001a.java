package bubble_sort_ver.pkg0.pkg01a;

import java.util.Scanner;

public class Bubble_Sort_ver001a {
   public static void main(String[] args) {

       
       final int MAXITEM = 100;
       int[] pole = new int [MAXITEM];
       Scanner vstup = new Scanner(System.in);
       System.out.println("Vlož číslo: ");
       int cislo = vstup.nextInt();
       int pocet = 0;
       while (cislo != 0){
           pole[pocet] = cislo;
           pocet++;
           System.out.print("Vlož číslo: ");
           cislo = vstup.nextInt();
       }
        for(int j = 1; j<= pocet - 1; j++){
           for(int i=0;i<=pocet - j - 1; i++){
               if(pole[i]>pole[i+1]){
                   int pom = pole[i];
                   pole[i] = pole[i+1];
                   pole[i+1] = pom;
               }
           }
       }
       System.out.println();
       System.out.print("Seřazená čísla za sebou: ");
      
       for(int s=0;s<pocet;s++){
          
           System.out.print(pole[s]+" ");
       }
       System.out.println();
       
   }
    
}
