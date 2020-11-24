import java.util.Random;

import static java.lang.Thread.sleep;

public class Tolva implements Runnable {
    private int idTolva;
    private Cinta cinta;
    Random random = new Random();

    public Tolva(int idTolva, Cinta cinta) {
        this.idTolva = idTolva;
        this.cinta = cinta;

    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            cinta.tolvaElements(new Elemento(idTolva, i));
           int rnd =  random.nextInt(2)+1;
            try {
                sleep(rnd* 1000L);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
