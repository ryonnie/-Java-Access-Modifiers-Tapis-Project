package modificateur;
import java.util.Scanner;
public class Usage1Tapis {
    
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.print("Entrer la longueur du tapis (en mètres) : ");
        float longueur = scan.nextFloat();

        System.out.print("Entrer la largeur du tapis (en mètres) : ");
        float largeur = scan.nextFloat();

        System.out.print("Entrer le prix par mètre carré : ");
        float prixMetreCarre = scan.nextFloat();

        Tapis t = new Tapis(longueur,largeur,prixMetreCarre);

       float surface=t.calculerSurfaceTapis();
       float prix =t.calculerPrixTapis(surface);

        System.out.println("\n--- Résumé du Tapis ---");
        System.out.println("Longueur : " + longueur + " m");
        System.out.println("Largeur : " + largeur + " m");
        System.out.println("Surface : " + surface + " m²");
        System.out.println("Prix total : " + prix + " dinars");

        

        scan.close();
    }
}
