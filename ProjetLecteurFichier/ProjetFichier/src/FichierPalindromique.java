public class FichierPalindromique extends FileReaderr {
    @Override
    protected void processLine(String line) {
       // Utilise un StringBuilder pour inverser la ligne et la convertit en une chaîne
        System.out.println(new StringBuilder(line).reverse().toString());
    }
}












