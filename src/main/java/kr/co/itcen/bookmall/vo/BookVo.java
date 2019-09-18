package kr.co.itcen.bookmall.vo;

public class BookVo {
	private Long bookCode;
	private String subject;
	private String cost;
	private Long categoryID;
	
	public Long getBookCode() {
		return bookCode;
	}
	public void setBookCode(Long bookCode) {
		this.bookCode = bookCode;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public Long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Long categoryID) {
		this.categoryID = categoryID;
	}
	
	@Override
	public String toString() {
		return "BookVo [bookCode=" + bookCode + ", subject=" + subject + ", cost=" + cost + ", categoryID=" + categoryID
				+ "]";
	}
	
	
	
}
