public class Gobierno {
    private Gobierno instancia;
    private String lider;
    private String pais;
    private String sistemaPolitico;
    private Gobierno(String lider, String pais, String sistemaPolitico) {
        this.lider = lider;
        this.pais = pais;
        this.sistemaPolitico = sistemaPolitico;
    }

    public Gobierno getInstancia() {
        if(instancia == null) {
            // Lazy Singletone
            // Se inicializa hasta cuando es llamada
            instancia = new Gobierno("Bukele", "El Salvador", "Yes");
        }
        return instancia;
    }
    public void crearLeyes(){
        System.out.println("Nueva ley creada.");
    }
    public void somethingSomethingMoney(){
        // yes
    }
}
