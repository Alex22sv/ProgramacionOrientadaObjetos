package iterators;
import residents.Resident;

public interface ResidentIterator {
    Resident getNextResident();
    boolean hasNextResident();
    int getCurrentPosition();
    Resident getResidentByPosition(int position);
}
