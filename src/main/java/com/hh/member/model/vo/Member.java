package com.hh.member.model.vo;


public class Member {
	private int memberNo;
	private String memberId;
	private String memberPwd;
	private String nickName;
	private String email;
	private String address;
	private String phone;
	
	public Member() {}		// 기본 생성자

	public Member(int memberNo, String memberId, String memberPwd, String nickName, String email, String address,
			String phone) {
		super();
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberPwd = memberPwd;
		this.nickName = nickName;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPwd() {
		return memberPwd;
	}

	public void setMemberPwd(String memberPwd) {
		this.memberPwd = memberPwd;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [memberNo=" + memberNo + ", memberId=" + memberId + ", memberPwd=" + memberPwd + ", nickName="
				+ nickName + ", email=" + email + ", address=" + address + ", phone=" + phone + "]";
	}

	
}
