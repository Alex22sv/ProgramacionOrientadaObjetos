package iterators;

public interface IterableCollection {
    ResidentIterator createDebtIterator();
    ResidentIterator createSolventIterator();
}
