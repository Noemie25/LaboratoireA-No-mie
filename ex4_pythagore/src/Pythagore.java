import java.util.Scanner;

public class Pythagore {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);
        //déclarer les variables
        float varA;
        float varB;
        int pyt;

        //énoncés et scanning
        System.out.print("Quelle est la valeur A? : ");
        varA = sc.nextFloat();
        System.out.print("Quelle est la valeur B? : ");
        varB = sc.nextFloat();

        //opération
        pyt = (int) (Math.sqrt((Math.pow(varA, 2)) + (Math.pow(varB, 2))));

        //sortie
        System.out.print("Valeur de pythagore     : " + pyt);

        sc.close();
    }
}
