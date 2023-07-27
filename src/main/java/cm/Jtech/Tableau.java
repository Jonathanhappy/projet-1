package cm.Jtech;

public class Tableau {
    public static void main(String[] args) {

        System.out.println("\t ============================");
        System.out.println("\t :: Table de multiplication de x ::");
        System.out.println("\t ============================");

        int[][] mult = new int [12][2];
        int x = 8;
        // Remplissage de la 1 ligne
        mult[0][0] = 1;
        mult[0][1] = x*mult[0][0];
        // Remplissage de la 2 ligne
        mult[1][0] = 2;
        mult[1][1] = x*mult[1][0];
        // Remplissage de la 3 ligne
        mult[2][0] = 3;
        mult[2][1] = x*mult[2][0];
        // Remplissage de la 4 ligne
        mult[3][0] = 4;
        mult[3][1] = x*mult[3][0];
        // Remplissage de la 5 ligne
        mult[4][0] = 5;
        mult[4][1] = x*mult[4][0];
        // Remplissage de la 6 ligne
        mult[5][0] = 6;
        mult[5][1] = x*mult[5][0];
        // Remplissage de la 7 ligne
        mult[6][0] = 7;
        mult[6][1] = x*mult[6][0];
        // Remplissage de la 8 ligne
        mult[7][0] = 8;
        mult[7][1] = x*mult[7][0];
        // Remplissage de la 9 ligne
        mult[8][0] = 9;
        mult[8][1] = x*mult[8][0];
        // Remplissage de la 10 ligne
        mult[9][0] = 10;
        mult[9][1] = x*mult[9][0];
        // Remplissage de la 11 ligne
        mult[10][0] = 11;
        mult[10][1] = x*mult[10][0];
        // Remplissage de la 12 ligne
        mult[11][0] = 12;
        mult[11][1] = x*mult[11][0];

        // Affichage de la 1 ligne de notre tableau
       /* System.out.println("\t\t\t  --- ---");
        System.out.println("\t\t\t | "+mult[0][0]+ " | " + mult[0][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 2 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[1][0]+ " | " + mult[1][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 3 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[2][0]+ " | " + mult[2][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 4 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[3][0]+ " | " + mult[3][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 5 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[4][0]+ " | " + mult[4][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 6 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[5][0]+ " | " + mult[5][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 7 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[6][0]+ " | " + mult[6][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 8 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[7][0]+ " | " + mult[7][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 9 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[8][0]+ " | " + mult[8][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 10 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[9][0]+ " | " + mult[9][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 11 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[10][0]+ " | " + mult[10][1] +" |");
        System.out.println("\t\t\t  --- ---");
        // Affichage de la 12 ligne de notre tableau
        System.out.println("\t\t\t | "+mult[11][0]+ " | " + mult[11][1] +" |");
        System.out.println("\t\t\t  --- ---");*/

        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[0][0] + " | = | " + mult[0][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[1][0] + " | = | " + mult[1][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[2][0] + " | = | " + mult[2][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[3][0] + " | = | " + mult[3][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[4][0] + " | = | " + mult[4][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[5][0] + " | = | " + mult[5][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[6][0] + " | = | " + mult[6][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[7][0] + " | = | " + mult[7][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[8][0] + " | = | " + mult[8][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[9][0] + " | = | " + mult[9][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[10][0] + " | = | " + mult[10][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");
        System.out.println("\t\t | " + x + " | x | " + mult[11][0] + " | = | " + mult[11][1] + " |" );
        System.out.println("\t\t  --- --- --- --- ---");


    }
}
