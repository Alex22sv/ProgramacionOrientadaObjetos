// Hola
/* Hola mundo */
class Main {
    public static void main(String[] args){
        Pokemon magnemite = new Pokemon();
        Pokemon applin = new Pokemon();
        // Si agregáramos private al método de atacar, igualmente funcionará porque estaremos dentro de la misma clase. EL main es parte del pokemon.
        magnemite.atacar();
    }
}
class Pokemon {
    // El tipo de dato string en C++ es en realidad una clase, está disfrazado. En Java no está disfrazado
    // Estamos inicializando datos, pero esta no es la manera.
    String name = new String();
    String[] types = new String[2];
    String[] abilities = new String[2];
    int[] stats;

    public void atacar() {
        // Todo en Java son objetos y clases. TOdo se hace a través de métodos
        // Podríamos usar .print, pero .println es más común. Con print es para cosas consecutivas, println para después de imprimir haga salto de línea.
        System.out.println(name + ": Estoy atacando.");
    }

    public static void main(String[] args){
        Pokemon magnemite = new Pokemon();
        magnemite.name = "Magnemite";
        Pokemon applin = new Pokemon();
        // Si agregáramos private al método de atacar, igualmente funcionará porque estaremos dentro de la misma clase. EL main es parte del pokemon.
        magnemite.atacar();
    }

}

