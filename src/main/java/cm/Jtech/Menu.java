package cm.Jtech;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] menuTab = {"Accueil", "Nos Produits", "Nous contacter", "A propos"};

        System.out.println("Veillez choisir une option dans le Menu en Entrant le numero correspondant (Exple : 1 pour Accueil) :");
        System.out.println("1-) " + menuTab[0]);
        System.out.println("2-) " + menuTab[1]);
        System.out.println("3-) " + menuTab[2]);
        System.out.println("4-) " + menuTab[3]);


        System.out.print("Entre votre choix : ");
        int choix = sc.nextInt();

        if (choix == 1){
            System.out.println("\n\n vous avez choisi de consulter le menu : " + menuTab[0]);
        } else if ( choix == 2) {
            System.out.println("\n\n vous avez choisi de consulter le menu : " + menuTab[1]);
        } else if (choix == 3) {
            System.out.println("\n\n vous avez choisi de consulter le menu : " + menuTab[2]);
        } else if (choix == 4) {
            System.out.println("\n\n vous avez choisi de consulter le menu : " + menuTab[3]);
        }else {
            System.out.println("Mauvais choix !!!!!! Entre votre choix a nouveau compris entre 1 et 5: ");
        }
        //System.out.println("\n\n vous avez choisi de consulter le menu : " + menuTab[choix-1]);



    }
}
