public interface Handler {
    void setNext(Handler next);
    boolean handle(Persona p);
}
