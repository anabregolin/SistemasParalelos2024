public class App {
    public static void main(String[] args) {
        MinhaPrimeiraThread t = new MinhaPrimeiraThread();
        t.start();

        try {
            t.join(); // Espera a thread terminar
        } catch (InterruptedException e) {
            e.printStackTrace(); // Tratar a exceção se a thread principal for interrompida
        }
    }
}