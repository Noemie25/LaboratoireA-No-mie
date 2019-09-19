import java.util.Scanner;

public class Convertisseur2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //entrer les variables
        int deg;
        double rad;

        //écrire le message + lecture des valeurs
        System.out.print("Quel est l'angle en degré? : ");
        deg = sc.nextInt();

        //operation Math
        rad = (Math.toRadians(deg));

        //Sortie
        System.out.print("Valeur en radian : " + rad);

        //DecimalFormat df = new DecimalFormat(Pattern:"###,##");
        //Défi( à retravailler )

        sc.close();

    }
}
