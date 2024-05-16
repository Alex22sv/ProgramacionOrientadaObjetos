import java.time.LocalDate;

public class CheckAgeHandler implements Handler{
    private Handler next;

    @Override
    public void setNext(Handler next) {
        this.next = next;
    }
    @Override
    public boolean handle(Persona p) {
        int age = LocalDate.now().getYear() - p.getFechaNacimiento().getYear();
        if(age<=27){
            if(next==null){
                return true;
            } else { return next.handle(p); }
        } else { return false; }
    }
}
