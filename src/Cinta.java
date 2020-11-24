import org.w3c.dom.Element;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Cinta {
    private final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    ConcurrentLinkedQueue<Elemento> elements = new ConcurrentLinkedQueue<>();

    void tolvaElements(Elemento elemento) {
        System.out.printf("%s -> La tolva ha enviado a la cinta el elemento: %s\n",
                LocalTime.now().format(dateTimeFormatter), elemento.identifierName());

        elements.add(elemento);
    }

    public Elemento tryGetElement() {
        return elements.poll();
    }
}
