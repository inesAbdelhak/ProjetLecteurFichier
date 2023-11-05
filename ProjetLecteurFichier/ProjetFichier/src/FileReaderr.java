import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public abstract class FileReaderr implements IfileReader {
    @Override
        // La méthode readAndDisplay lit et affiche le contenu du fichier dont le nom est spécifié.
    public void readAndDisplay(String filename) throws IOException {
        // Crée un objet BufferedReader pour lire le contenu du fichier.
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        // Lit chaque ligne du fichier et appelle la méthode processLine pour traiter chaque ligne.
        while ((line = reader.readLine()) != null) {
            processLine(line);
        }

        reader.close();  // Ferme le lecteur de fichier une fois la lecture terminée.
    }

    protected abstract void processLine(String line);  // méthode abstraite processLine définie pour être implémentée par les sous-classes.
}
