public class BoiteNoire {

    public static void main(String[] args) {

        //Déclarer mes variables
        double volBoite = 125, poidsBoite = 375, mVolSphere = 3517, raySphere = 2.15;
        double mVolSubIso = 13545.88, volSphere, poidsSphere, poidsTotal, poidsSubIso;
        double quantSubIso, volSubIso;

        System.out.println(" - RAPPORT D'INFORMATIONS");

        //Équation Sphere (Volume sphere)
        volSphere = (4 * Math.PI * Math.pow(raySphere, 3)) / 3;

        //Équation Sphere (Poids Sphere)
        poidsSphere = volSphere * mVolSphere;

        //Sphere
        System.out.println("   Sphère");
        System.out.println("    - Masse volumique : " + mVolSphere + " kg/m3");
        System.out.println("    - Poids : " + poidsSphere + " kg");
        System.out.println("    - Rayon : " + raySphere + " m");
        System.out.println("    - Volume : " + volSphere + " m3");

        //Équation SubIso (Volume)
        volSubIso = volBoite - volSphere;

        //Équation SubIso (Poids)
        poidsSubIso = volSubIso * mVolSubIso;

        //Équation Quantité en litre
        quantSubIso = volSubIso * 1000;

        //Substance isolante
        System.out.println("    Substance isolante");
        System.out.println("    - Masse volumique :" + mVolSubIso + " kg/m3");
        System.out.println("    - Poids :" + poidsSubIso + " kg");
        System.out.println("    - Volume :" + volSubIso + " m3");
        System.out.println("    - Quantité :" + quantSubIso + " l");

        //Équation poids total
        poidsTotal = poidsBoite + poidsSphere + poidsSubIso;

        //Boite noire
        System.out.println("    Boite noire");
        System.out.println("    - Poids :" + poidsBoite + " kg");
        System.out.println("    - Volume :" + volBoite + " m3");
        System.out.println("    - Poids Total :" + poidsTotal + " kg");

    }
}
