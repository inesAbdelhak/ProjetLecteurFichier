import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ComparateurDeFichier {
    public boolean comparerFichiers(String cheminFichier1, String cheminFichier2) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader("test.txt"));
             BufferedReader reader2 = new BufferedReader(new FileReader("test.csv"))) {

            String ligne1, ligne2;

            while ((ligne1 = reader1.readLine()) != null) {
                ligne2 = reader2.readLine();
                if (ligne2 == null || !ligne1.equals(ligne2)) {
                    return false;
                }
            }

            // Vérifie que le fichier 2 n'a pas plus de lignes que le fichier 1
            return reader2.readLine() == null;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
