package iterators;

import residents.Resident;

import java.util.ArrayList;
import java.util.List;

public class ResidentCollection implements IterableCollection{
    private List<Resident> residents;
    public ResidentCollection(List<Resident> residents){
        this.residents = residents;
    }
    @Override
    public ResidentIterator createDebtIterator() {
        return new DebtIterator(this);
    }

    @Override
    public ResidentIterator createSolventIterator() {
        return new SolventIterator(this);
    }
    public List<Resident> getDebtResidents(){
        List<Resident> debtResidents = new ArrayList<>();
        for(Resident resident : residents){
            if(resident.getDebtBalance()>0){
                debtResidents.add(resident);
            }
        }
        return debtResidents;
    }
    public List<Resident> getSolventResidents(){
        List<Resident> solventResidents = new ArrayList<>();
        for(Resident resident : residents){
            if(resident.getDebtBalance()==00){
                solventResidents.add(resident);
            }
        }
        return solventResidents;
    }
}
