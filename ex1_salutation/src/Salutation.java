import java.util.Scanner;

public class Salutation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Entrer les variables
        String nom = "";

        //Lecture des valeurs
        System.out.print("Quel est votre nom? : ");
        nom = sc.next();

        //afficher le resultat
        System.out.println("Hello, " + nom);

        sc.close();
    }
}
