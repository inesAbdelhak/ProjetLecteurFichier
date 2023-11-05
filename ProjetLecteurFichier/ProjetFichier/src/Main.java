import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String fichierTexte = "test.txt";
        String fichierCsv = "test.csv";

        // Lecteurs de fichiers texte
        FichierALendroit lecteurTexteALendroit = new FichierALendroit();
        FichierALenvers lecteurTexteALenvers = new FichierALenvers();
        FichierPalindromique lecteurTextePalindromique = new FichierPalindromique();

        // Lecteurs de fichiers CSV
        FichierALendroit lecteurCsvALendroit = new FichierALendroit();
        FichierALenvers lecteurCsvALenvers = new FichierALenvers();
        FichierPalindromique lecteurCsvPalindromique = new FichierPalindromique();

        try {
            System.out.println("Contenu du fichier texte à l'endroit :");
            lecteurTexteALendroit.readAndDisplay(fichierTexte);

            System.out.println("Contenu du fichier texte à l'envers :");
            lecteurTexteALenvers.readAndDisplay(fichierTexte);

            System.out.println("Contenu du fichier texte sous forme palindromique :");
            lecteurTextePalindromique.readAndDisplay(fichierTexte);

            System.out.println("Contenu du fichier CSV à l'endroit :");
            lecteurCsvALendroit.readAndDisplay(fichierCsv);

            System.out.println("Contenu du fichier CSV à l'envers :");
            lecteurCsvALenvers.readAndDisplay(fichierCsv);

            System.out.println("Contenu du fichier CSV sous forme palindromique :");
            lecteurCsvPalindromique.readAndDisplay(fichierCsv);
        } catch (IOException e) {
            e.printStackTrace();
        }



  ComparateurDeFichier comparateur = new ComparateurDeFichier();

    boolean fichiersIdentiques = comparateur.comparerFichiers(fichierTexte, fichierCsv);

    if (fichiersIdentiques) {
        System.out.println("Le contenu des fichiers texte et CSV sont identiques.");
    } else {
        System.out.println("Le contenu des fichiers texte et CSV ne sont pas identiques.");
    }


    }



}
