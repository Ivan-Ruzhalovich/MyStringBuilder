import java.util.ArrayList;
import java.util.List;

public class SnapShotImpl implements SnapShot{
    private final List<String> history;

    public SnapShotImpl() {
        history = new ArrayList<>();
    }

    public SnapShotImpl(int capacity) {
        history = new ArrayList<>(capacity);
    }

    public List<String> getHistory() {
        return history;
    }
}