package java_assignment_10_interfaces_and_packages.com.library.members;

public class Member {

    private int memberId;
    private String memberName;
    private String memberEmailId;
    private long memberPhoneNo;
    private String memberAddress;
    private static int uniqueID = 0;
    public Member(String memberName, String memberEmailId, long memberPhoneNo, String memberAddress) {
        this.memberName = memberName;
        this.memberEmailId = memberEmailId;
        this.memberPhoneNo = memberPhoneNo;
        this.memberAddress = memberAddress;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId() {
        memberId = ++uniqueID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEmailId() {
        return memberEmailId;
    }

    public void setMemberEmailId(String memberEmailId) {
        this.memberEmailId = memberEmailId;
    }

    public long getMemberPhoneNo() {
        return memberPhoneNo;
    }

    public void setMemberPhoneNo(long memberPhoneNo) {
        this.memberPhoneNo = memberPhoneNo;
    }

    public String getMemberAddress() {
        return memberAddress;
    }

    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    @Override
    public String toString(){
        return memberId+ "  |  " + memberName+ "  |  " +memberEmailId+ "  |  " +memberPhoneNo+ "  |  " +memberAddress;
    }

}
