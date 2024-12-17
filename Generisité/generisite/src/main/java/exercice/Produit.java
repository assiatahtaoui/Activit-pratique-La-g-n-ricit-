package exercice;

public class Produit {
    private Long Id;
    private String nom;
    private String marque;
    private double prix;
    private String description;
    private int NbrStock;

    public Produit(long Id, String nom, String marque, double prix, String description, int nbrStock) {
        this.Id=Id;
        this.nom = nom;
        this.marque = marque;
        this.prix = prix;
        this.description = description;
        NbrStock = nbrStock;
    }

    public Produit() {
    }


    public void setId(int id) {
        Id = Id;
    }
public long getId(){
        return Id;
}
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNbrStock() {
        return NbrStock;
    }

    public void setNbrStock(int nbrStock) {
        NbrStock = nbrStock;
    }
    @Override
    public String toString() {
        return "Produit{id=" + Id + ", nom='" + nom + "', marque='" + marque + "', prix=" + prix + ", description='" + description + "', stock=" + NbrStock + "}";
    }

}

