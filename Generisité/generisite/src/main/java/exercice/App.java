package exercice;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        IMetier<Produit> metier=new MetierProduitImpl();

        // test
        metier.add(new Produit(1, "Produit A", "Marque A", 100.0, "Description A", 10));


        while (true){
            System.out.println("Menu:");
            System.out.println("1. Afficher la liste des produits");
            System.out.println("2. Rechercher un produit par son id");
            System.out.println("3. Ajouter un nouveau produit");
            System.out.println("4. Supprimer un produit par id");
            System.out.println("5. Quitter");
            System.out.println("mettre votre choix : ");

            int choix= scanner.nextInt();
            scanner.nextLine();
            switch (choix){
                case 1:
                    // l'affichage de liste
                    List<Produit> produits=metier.getAll();
                    if (produits.isEmpty()){
                        System.out.println("pas de produit dans la liste");
                    }else {
                        for (Produit produit: produits){
                            System.out.println(produit);
                        }
                    }
                    break;
                    // pour trouver un produit avec la methode rechercher
                case 2:
                    System.out.println("entrer Id produit");
                    Long idRecherche=scanner.nextLong();
                    scanner.nextLine();
                    Produit prodtrouver=metier.findById(idRecherche);
                    if (prodtrouver!=null){
                        System.out.println("produit trouver est : " +prodtrouver);
                    }else {
                        System.out.println("produit non trouver");
                    }
                    break;
                case 3:
                    //  ajouter produit dans la liste
                    System.out.println("entrer id produit");
                    long id=scanner.nextLong();
                    scanner.nextLine();
                    System.out.println("entrer le nom");
                    String nom=scanner.nextLine();
                    System.out.println("entre le marque");
                    String marque=scanner.nextLine();
                    System.out.println("entrer le prix");
                    double prix=scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("donner une description a votre produit");
                    String description=scanner.nextLine();
                    System.out.println("quantite en stock");
                    int Nbrproduit=scanner.nextInt();
                    scanner.nextLine();
                    Produit NVproduit=new Produit(id,nom,marque,prix,description,Nbrproduit);
                    metier.add(NVproduit);
                    System.out.println("produit ajouter avec succes");
                    break;
                case 4:
                    // supprimer un produit
                    System.out.println("entrer le id de produit à supprimer");
                    long idSupprimer=scanner.nextLong();
                    scanner.nextLine();
                    metier.delete(idSupprimer);
                    System.out.println("produit bien supprimer");
                    break;
                case 5:
                    // pour quitter
                    System.out.println("au revoir");
                    scanner.close();
                    return;
                default:
                    break;

            }


        }

    }
}

