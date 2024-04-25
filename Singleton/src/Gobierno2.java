public class Gobierno2 {
    private static Gobierno2 instancia;
    private String lider;
    private String pais;
    private String sistemaPolitico;
    private Gobierno2(String lider, String pais, String sistemaPolitico) {
        this.lider = lider;
        this.pais = pais;
        this.sistemaPolitico = sistemaPolitico;
    }
    public static void initializeInstance(){
        if(instancia == null){
            instancia = new Gobierno2("Alexander", "Parqueland", "Líder de todo");
        } else {
            System.out.println("Instance already initialized.");
        }
    }

    public static Gobierno2 getInstancia() {
        return instancia;
    }

    public String getLider() {
        return lider;
    }

    public String getPais() {
        return pais;
    }

    public String getSistemaPolitico() {
        return sistemaPolitico;
    }
}
