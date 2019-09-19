import java.util.Scanner;

public class ExperienceVerte {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Entrée des variables
        int a, b, c, d, e, f, co2 = 0, k, r1, r2, r3;
        //Scanner les données
        System.out.println("Entrée des quantités...");
        System.out.print("A : ");
        a = sc.nextInt();
        System.out.print("B : ");
        b = sc.nextInt();
        System.out.print("C : ");
        c = sc.nextInt();
        System.out.print("D : ");
        d = sc.nextInt();
        System.out.print("E : ");
        e = sc.nextInt();
        System.out.print("F : ");
        f = sc.nextInt();

        //Afficher nombre d'élément
        System.out.println("Avant toute réaction");
        System.out.println("A : " + a + ", B : " + b + ", C : " + c + ", D : " + d + ", E : "
                + e + ", F : " + f + ", co2 : " + co2);

        //2A + 4C = 3D + Co2
        k = Math.min(a / 2, c / 4);
        a -= 2 * k;
        c -= 4 * k;
        d += 3 * k;
        co2 = k;

        System.out.println("Après la première réaction");
        System.out.println("A : " + a + ", B : " + b + ", C : " + c + ", D : " + d + ", E : "
                + e + ", F : " + f + ", co2 : " + co2);

        //B + 2C + E = 4F + 4Co2
        k = Math.min(Math.min(b, c / 2), e);
        b -= k;
        c -= 2 * k;
        e -= k;
        f += 4 * k;
        co2 += 4 * k;

        System.out.println("Après la deuxième réaction");
        System.out.println("A : " + a + ", B : " + b + ", C : " + c + ", D : " + d + ", E : "
                + e + ", F : " + f + ", co2 : " + co2);

        //A/2 + 4F = B + 4E + Co2
        k = (int) Math.min(a / 0.5, f / 4);
        a -= 0.5 * k;
        f -= 4 * k;
        b += k;
        e += 4 * k;
        co2 += k;

        System.out.println("Après la troisième réaction");
        System.out.println("A : " + a + ", B : " + b + ", C : " + c + ", D : " + d + ", E : "
                + e + ", F : " + f + ", co2 : " + co2);

        sc.close();
    }
}
