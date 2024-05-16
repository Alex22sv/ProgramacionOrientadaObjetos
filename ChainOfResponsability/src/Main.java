import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona("María", "Estudiante", 3, 5, LocalDate.of(2024, 6, 1), );
        Handler chain = makeChain(new CheckWFHandler(), new)
    }
    // Le decimos a Java que hay una cantidad indefinida de handlers que se le pueden pasar, pero habrá uno fijo (first), pueden haber X cantidad fijos<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<.
    private static Handler makeChain(Handler first, Handler... theRest){
        Handler aux = first;
        for (Handler next: theRest){
            aux.setNext(next);
            aux = next;
        }
        return first;
    }

}

