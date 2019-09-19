import java.util.Scanner;

public class Convertisseur1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //entrer les données
        float rad;
        int deg;

        //écrire le message
        System.out.print("Quel est l'angle en radian? : ");
        rad = sc.nextFloat();

        //opération
        deg = (int) ((rad * 180) / Math.PI);

        //sortie
        System.out.print("Valeur en degré :" + deg);

        sc.close();


    }
}
