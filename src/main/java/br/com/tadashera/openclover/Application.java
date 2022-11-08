package br.com.tadashera.openclover;

public class Application {
    private static final String NO_COVERAGE_LOG = "Please dont catch me";

    public static void main(String[] args) {
        System.out.println("Hello OpenClover");

        try {
            System.out.println("Hello OpenClover inside TryCatch");
        } catch (Exception ex){
            //Do Nothing
        }
    }
}
