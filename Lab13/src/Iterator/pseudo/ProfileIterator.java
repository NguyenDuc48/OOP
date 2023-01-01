package Iterator.pseudo;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}