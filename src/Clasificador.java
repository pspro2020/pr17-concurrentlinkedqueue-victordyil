import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import static java.lang.Thread.sleep;

public class Clasificador implements Runnable {
    private Cinta cinta;
    Random random = new Random();
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");

    public Clasificador(Cinta cinta) {
        this.cinta = cinta;
    }

    @Override
    public void run() {
        Elemento elemento;

        boolean exit = true;
        while (exit) {
            if ((elemento = cinta.tryGetElement()) != null) {
                int rnd = random.nextInt(2) + 1;
                try {
                    sleep(rnd * 1000L);
                    System.out.printf("%s -> Se ha clasificado el elemento: %s\n",
                            LocalTime.now().format(dateTimeFormatter), elemento.identifierName());
                } catch (InterruptedException e) {
                    return;
                }
            } else exit = false;
        }
        System.out.printf("%s -> Ya no hay mas elementos en la cinta\n",
                LocalTime.now().format(dateTimeFormatter));

    }

}
