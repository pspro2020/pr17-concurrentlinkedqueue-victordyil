import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Cinta cinta = new Cinta();
        Thread[] tolvas = new Thread[5];
        Thread clasi = new Thread(new Clasificador(cinta));
        for (int i = 0; i < 5; i++) {
            tolvas[i] = new Thread(new Tolva(i, cinta));
        }
        for (Thread thread : tolvas) {
            thread.start();
        }
        sleep(3000);
        clasi.start();


    }
}
