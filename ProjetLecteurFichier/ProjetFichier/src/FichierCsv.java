public class FichierCsv extends FileReaderr {
    @Override
    protected void processLine(String line) {
       
        System.out.println("Traitement pour Fichier .csv : " + line);
    }
}