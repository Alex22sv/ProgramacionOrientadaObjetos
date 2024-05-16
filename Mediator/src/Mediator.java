public interface Mediator {
    public void add(Empleado e);
    public void notify(String message, String to, String from);
}
