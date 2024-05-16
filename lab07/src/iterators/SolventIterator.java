package iterators;

import residents.Resident;
import java.util.ArrayList;
import java.util.List;

public class SolventIterator implements ResidentIterator{
    private ResidentCollection residentCollection;
    private List<Resident> solventResidents = new ArrayList<>();
    private int currentPos = 0;
    public SolventIterator(ResidentCollection residentCollection){
        this.residentCollection = residentCollection;
    }
    private void initIterator(){
        if(solventResidents.isEmpty()){
            solventResidents = residentCollection.getSolventResidents();
        }
    }
    @Override
    public Resident getNextResident() {
        if(hasNextResident()){
            Resident resident = solventResidents.get(currentPos++);
            return resident;
        } else return null;
    }
    @Override
    public boolean hasNextResident() {
        initIterator();
        return currentPos < solventResidents.size();
    }
    @Override
    public int getCurrentPosition(){
        return currentPos;
    }
    @Override
    public Resident getResidentByPosition(int position){
        return solventResidents.get(position);
    }
}
