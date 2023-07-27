package cm.Jtech;

import java.util.Arrays;
import java.util.Scanner;

public class InputOuput {
    public static void main(String[] args) {
        String nomUtilisateur;
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrez votre numero de table : ");
        int numero = sc.nextInt();
        sc.nextLine();
        System.out.print("Entrez votre nom : ");
       nomUtilisateur = sc.nextLine();
       System.out.println(" bonjour " + nomUtilisateur + " Bienvenue dans le forum votre numero est le n° : "+numero );
    }
}
