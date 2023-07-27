package cm.Jtech;

public class StructureDeControle {
    public static void main(String[] args) {
        int age = 10;

        // Dans le cas de figure de deux choix uniquement
        if (age >= 18 ){
            System.out.println("vous etes adulte");
        } else {
            System.out.println("vous etes mineur");
        }

        //si on a plusieur choix
        if ( age < 10 ){
            System.out.println("Vous etes un enfant");
        }else if (age >= 10 && age < 18 ){
            System.out.println("Vous etes un ado");
        }else {
            System.out.println("Vous etes un adulte");
        }
    }

}
