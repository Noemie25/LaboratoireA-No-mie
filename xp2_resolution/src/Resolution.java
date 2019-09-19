import java.util.Scanner;

public class Resolution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Déclarer les variables
        float a, b, c, dis, x1, x2;

        //Scanner valeurs
        System.out.println("Entre tes valeurs");
        System.out.print("a = ");
        a = sc.nextFloat();
        System.out.print("b = ");
        b = sc.nextFloat();
        System.out.print("c = ");
        c = sc.nextFloat();

        //Print l'équation
        System.out.println("Équation : " + a + "x2" + " + " + b + "x" + " + " + c + " = 0");

        //Calculer discriminant
        dis = (float) (Math.pow(b, 2) - (4 * a * c));
        System.out.println("Discriminant : " + dis);

        //Calculer x1 et x2
        x1 = (float) ((-b + Math.sqrt(dis)) / (2 * a));
        System.out.println("x1 = " + x1);
        x2 = (float) ((-b - Math.sqrt(dis)) / (2 * a));
        System.out.println("x2 = " + x2);

        sc.close();

    }
}
