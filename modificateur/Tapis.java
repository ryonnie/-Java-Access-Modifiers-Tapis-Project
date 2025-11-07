package modificateur;

public class Tapis {
    float longeur;
    public float largeur;
    protected float prixMettreCaree;

      public Tapis() {
        this.longeur = 0.0f;
        this.largeur = 0.0f;
        this.prixMettreCaree = 0.0f;
    }
    public Tapis(float longeur,float largeur,float prixMetreCarre){
        this.longeur=longeur;
        this.largeur=largeur;
        this.prixMettreCaree=prixMetreCarre;
    }
    float calculerSurfaceTapis(){
        return this.largeur * this.longeur;
    }
    protected float calculerPrixTapis(float surfaceTapis){
        return this.prixMettreCaree *surfaceTapis;
    }

}


