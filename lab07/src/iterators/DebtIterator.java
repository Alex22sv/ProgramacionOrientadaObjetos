package iterators;

import residents.Resident;
import java.util.ArrayList;
import java.util.List;

public class DebtIterator implements ResidentIterator{
    private ResidentCollection residentCollection;
    private List<Resident> debtResidents = new ArrayList<>();
    private int currentPos = 0;
    public DebtIterator(ResidentCollection residentCollection){
        this.residentCollection = residentCollection;
    }
    private void initIterator(){
        if(debtResidents.isEmpty()){
            debtResidents = residentCollection.getDebtResidents();
        }
    }
    @Override
    public Resident getNextResident() {
        if(hasNextResident()){
            Resident resident = debtResidents.get(currentPos++);
            return resident;
        } else return null;
    }
    @Override
    public boolean hasNextResident() {
        initIterator();
        return currentPos < debtResidents.size();
    }
    @Override
    public int getCurrentPosition(){
        return currentPos;
    }
    @Override
    public Resident getResidentByPosition(int position){
        return debtResidents.get(position);
    }
}
