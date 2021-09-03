import java.util.*;

public class GroupChatData implements Subject {
	// Initialized variables and ArrayList
    private List<Observer> obs;
    private int totalM;
    private int texts;
    private int videos;

    public GroupChatData() {
        obs = new ArrayList<Observer>();
    }

    public void registerObs(Observer o) {
        obs.add(o);
    }

    public void removeObs(Observer o) {
        obs.remove(o);
    }

    public void notifyObservers() {
        for (Observer observer : obs) {
            observer.update(totalM, texts, videos);
        }
    }

    public void midnightUpdate() {
        notifyObservers();
    }

    public void setMidnightUpdate(int totalM, int texts, int videos) {
        this.totalM = totalM;
        this.texts = texts;
        this.videos = videos;
        midnightUpdate();
    }

    public int getTotalM() {
        return totalM;
    }

    public int getTotalTexts() {
        return texts;
    }

    public int getTotalVideos() {
        return videos;
    }

}
