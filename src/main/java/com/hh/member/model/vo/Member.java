package com.hh.member.model.vo;


public class Member {
	private int mNo;
	private String mId;
	private String mPw;
	private String mNickName;
	private String email;
	private String address;
	private String phone;
	
	public Member() {}		// 기본 생성자

	public Member(int mNo, String mId, String mPw, String mNickName, String email, String address, String phone) {
		super();
		this.mNo = mNo;
		this.mId = mId;
		this.mPw = mPw;
		this.mNickName = mNickName;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}
	

	public int getmNo() {
		return mNo;
	}

	public void setmNo(int mNo) {
		this.mNo = mNo;
	}

	public String getmId() {
		return mId;
	}

	public void setmId(String mId) {
		this.mId = mId;
	}

	public String getmPw() {
		return mPw;
	}

	public void setmPw(String mPw) {
		this.mPw = mPw;
	}

	public String getmNickName() {
		return mNickName;
	}

	public void setmNickName(String mNickName) {
		this.mNickName = mNickName;
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
		return "Member [mNo=" + mNo + ", mId=" + mId + ", mPw=" + mPw + ", mNickName=" + mNickName + ", email=" + email
				+ ", address=" + address + ", phone=" + phone + "]";
	}
	
}
