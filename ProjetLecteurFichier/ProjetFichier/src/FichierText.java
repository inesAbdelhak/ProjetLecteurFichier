public class FichierText extends FileReaderr {
    @Override
    protected void processLine(String line) {
        
        System.out.println("Traitement pour Fichier .txt : " + line);
    }
}
