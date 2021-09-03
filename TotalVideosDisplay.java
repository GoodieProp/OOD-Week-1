/**
 * @author Xavier Gonzalez
 * 
 * This java file handles the display for the amount of Total Videos in the 'group chat'
 */

public class TotalVideosDisplay implements Observer, DisplayElement {
	private int currentTotalVideos = 50;
	private int previousTotalVideos;
	private GroupChatData gcd;

	public TotalVideosDisplay(GroupChatData gcd) {
		this.gcd = gcd;
		gcd.registerObs(this);
	}

	public void update(int totalM, int texts, int videos) {
		previousTotalVideos = currentTotalVideos;
		currentTotalVideos = videos;
		display();
	}

	public void display() {
		System.out.println("Total videos in the Group Chat!: " + currentTotalVideos + ".");
		if (currentTotalVideos > previousTotalVideos) {
			System.out.println("Quick! Look at the videos before they're gone!\n");
		} else if (currentTotalVideos == previousTotalVideos) {
			System.out.println("Don't worry, today is the day someone won't post a video for their Snapchat story.\n");
		} else if (currentTotalVideos < previousTotalVideos) {
			System.out.println("Yeah, you missed out on some crazy videos. They're gone by now.\n");
		}
	}

}

