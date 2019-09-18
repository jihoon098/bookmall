package kr.co.itcen.bookmall.vo;

public class MemberVo {
	
	private Long no;
	private String name;
	private String phoneNum;
	private String email;
	private String passwd;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	@Override
	public String toString() {
		return "MemberVo [no=" + no + ", "
						+ "name=" + name + ", "
						+ "phoneNum=" + phoneNum + ", "
						+ "email=" + email + ", "
						+ "passwd="	+ passwd + "]";
	}
	
	
	
}
