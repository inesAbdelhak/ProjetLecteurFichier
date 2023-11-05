
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FichierALenvers extends FileReaderr {
    private List<String> lignes = new ArrayList<>();

    @Override
    protected void processLine(String line) {
        lignes.add(line);
    }

    @Override
    public void readAndDisplay(String filename) throws IOException {
        super.readAndDisplay(filename); // Appel de la méthode de la classe mère pour remplir la liste
        Collections.reverse(lignes); // Inverse l'ordre des lignes
        for (String ligne : lignes) {
            System.out.println(ligne);
        }
    }
}
