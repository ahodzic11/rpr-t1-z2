package ba.unsa.etf.rpr.predavanje02;

import java.util.Scanner;
public class Main {
    public static int sumaCifara(int broj){
        int cifra, suma = 0;
        while(broj!=0){
            cifra=broj%10;
            broj/=10;
            suma+=cifra;
        }
        return suma;
    }

    public static void main(String[] args) {
	    int n;
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();
        for(int i=1; i<=n; i++){
            if(i%sumaCifara(i)==0){
                System.out.println(i);
            }
        }
    }
}
