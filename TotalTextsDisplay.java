/**
 * @author Xavier Gonzalez
 * 
 * This java file handles the display for the current amount of texts in the 'group chat'
 */

public class TotalTextsDisplay implements Observer, DisplayElement {
	// currentTotalTexts is set to 100 to simulate 100 messages in the 'group chat'
	private int currentTotalTexts = 100;
	private int previousTotalTexts;
	private GroupChatData gcd;
	
	// this constructor allows TotalTextsDisplay to be registered as an Observer
	public TotalTextsDisplay(GroupChatData gcd) {
		this.gcd = gcd;
		gcd.registerObs(this);
	}
	
	// this function updates the amount of messages in the 'group chat' and displays it through the display function
	public void update(int totalM, int texts, int videos) {
		previousTotalTexts = currentTotalTexts;
		currentTotalTexts = texts;
		display();
	}
	
	public void display() {
		System.out.println("Total messages in the Group Chat!: " + currentTotalTexts + ".");
		if (currentTotalTexts > previousTotalTexts) {
			System.out.println("You've been missing out on some tea my friend.");
		} else if (currentTotalTexts == previousTotalTexts) {
			System.out.println("You don't have to worry about anything. Everyone has been quit for some reason.");
		} else if (currentTotalTexts < previousTotalTexts) {
			System.out.println("Either someone accidently sent something, or you were too late to view the message.");
		}
	}
	
}
