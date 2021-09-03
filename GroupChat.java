public class GroupChat {
    public static void main(String[] args) {
        GroupChatData gcd = new GroupChatData();

        // Calls the constructor for each display to register as an observer
        TotalMembersDisplay tmd = new TotalMembersDisplay(gcd);
        TotalTextsDisplay ttd = new TotalTextsDisplay(gcd);
        TotalVideosDisplay tvd = new TotalVideosDisplay(gcd);

        //Parameters: Total members, total messages, total videos
        gcd.setMidnightUpdate(21, 100, 51);
        gcd.setMidnightUpdate(19, 101, 51);
        gcd.removeObs(tmd);
        gcd.setMidnightUpdate(20, 100, 45);
        gcd.setMidnightUpdate(20, 120, 80);
    }
}
