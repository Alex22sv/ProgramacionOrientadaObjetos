public static class GeneradorISBN {
    private int contador = 0;

    public String generarISBN(){
        return "00"+contador;
    }
    public void nuevoISBN(){
        contador++;
    }

}