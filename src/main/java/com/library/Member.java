public class Member {
    private String name;
    private int memberId;

    // Constructor
    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    // Getters
    public String getName() { return name; }
    public int getMemberId() { return memberId; }

    // Method to display member details
    public void displayMemberInfo() {
        System.out.println("Member Name: " + name + ", Member ID: " + memberId);
    }
}
