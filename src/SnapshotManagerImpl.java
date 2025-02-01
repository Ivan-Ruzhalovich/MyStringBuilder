import java.util.NoSuchElementException;

public class SnapshotManagerImpl implements SnapshotManager {

    SnapShot snapShot;

    public SnapshotManagerImpl() {
        this.snapShot = new SnapShotImpl();
    }

    public SnapshotManagerImpl(int capacity){
        this.snapShot = new SnapShotImpl(capacity);
    }

    public void save(String str){
        snapShot.getHistory().add(str);
    }

    public String getSnapShot() throws NoSuchElementException{
        String result = snapShot.getHistory().getLast();
        snapShot.getHistory().removeLast();
        return result;
    }
}
