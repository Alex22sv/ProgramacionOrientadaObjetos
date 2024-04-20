public class Animal {
    private String nombre;
    private String nombreCientifico;
    private String habitat;
    private String tipoDieta;
    private int longevidad;
    public Animal(String nombre, String nombreCientifico, String habitat, String tipoDieta, int longevidad){
        this.nombre = nombre;
        this.nombreCientifico = nombreCientifico;
        this.habitat = habitat;
        this.tipoDieta = tipoDieta;
        this.longevidad = longevidad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombreCientifico() {
        return nombreCientifico;
    }
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }
    public String getHabitat() {
        return habitat;
    }
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    public int getLongevidad() {
        return longevidad;
    }
    public void setLongevidad(int longevidad) {
        this.longevidad = longevidad;
    }
    public void atacar(){
        System.out.println("I'm attacking.");
    }

    public static void main(String[] args) {
        Animal libelula = new Animal("Libelula", "cositus dragonflynitus", "desierto", "insectos", 10);
        Mammal perro = new Mammal("Perro", "CAnis familiaris", "Mi casa", "De todo", 12, 3, "liso", 4);
        Bird pollo = new Bird("Pollo", "torchic normalis", "árboles", "semillas", 12, true, "picudo", "liso");
        System.out.println(libelula.getNombre());
        System.out.println(perro.getNombre());
        System.out.println(pollo.getNombre());
        libelula.atacar();
        perro.atacar(); // Estamos sobreescribiendo (override), en vez de Animal con Mammal
        pollo.atacar();
        pollo.volar();

    }
}
