/**
 * @author Xavier Gonzalez
 *
 * This java file handles the display for the amount of current members in the 'group chat'
 */

public class TotalMembersDisplay implements Observer, DisplayElement {
	// currentMemberCount is set to 20 to simulate 20 individuals
    private int currentMemberCount = 20;
    private int previousMemberCount;
    private GroupChatData gcd;

    //this constructor is used to register TotalMembersDisplay as an observer
    public TotalMembersDisplay(GroupChatData gcd) {
        this.gcd = gcd;
        gcd.registerObs(this);
    }
    
    //this function is used to update the current member count and display it through the display function
    public void update(int totalM, int texts, int videos) {
    	previousMemberCount = currentMemberCount;
        currentMemberCount = totalM;
        display();
    }

    public void display() {
        System.out.println("Total Members in the Group Chat: " + currentMemberCount + ".");
        if (currentMemberCount > previousMemberCount) {
        	System.out.println("Hey! We've gain more members than yesterday! Let's go ME!");
        } else if (currentMemberCount == previousMemberCount) {
        	System.out.println("I guess we're the same as yesterday...");
        } else if (currentMemberCount < previousMemberCount) {
        	System.out.println("Did we do something for them to leave? They're gonna miss out of the fun!");
        }
    }

}
