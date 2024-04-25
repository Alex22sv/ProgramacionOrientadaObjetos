public class Gobierno1 {
    private static Gobierno1 instancia;
    private String lider;
    private String pais;
    private String sistemaPolitico;
    private Gobierno1(String lider, String pais, String sistemaPolitico) {
        this.lider = lider;
        this.pais = pais;
        this.sistemaPolitico = sistemaPolitico;
    }

    public static Gobierno1 getInstancia() {
        if(instancia == null) {
            // Lazy Singletone
            // Se inicializa hasta cuando es llamada
            instancia = new Gobierno1("Bukele", "El Salvador", "Yes");
        }
        return instancia;
    }
    public void crearLeyes(){
        System.out.println("Nueva ley creada.");
    }
    public void somethingSomethingMoney(){
        // yes
    }

    // Los setters dejan de tener sentido, porque no se puede modificar.
    public String getLider() {return lider;}
    public String getPais() {return pais;}
    public String getSistemaPolitico() {return sistemaPolitico;}
}
