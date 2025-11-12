package library.members;

public class Member {
    public String name;

    public Member(String name) {
        this.name = name;
    }

    public void showMember() {
        System.out.println("Member: " + name);
    }
}
