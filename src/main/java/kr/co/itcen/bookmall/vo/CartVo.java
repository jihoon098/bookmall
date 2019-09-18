package kr.co.itcen.bookmall.vo;

public class CartVo {
	private Long no;
	private Long no2;
	private Long bookCode;
	
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public Long getNo2() {
		return no2;
	}
	public void setNo2(Long no2) {
		this.no2 = no2;
	}
	public Long getBookCode() {
		return bookCode;
	}
	public void setBookCode(Long bookCode) {
		this.bookCode = bookCode;
	}
	
	@Override
	public String toString() {
		return "CartVo [no=" + no + ", no2=" + no2 + ", bookCode=" + bookCode + "]";
	}
	
	
	
}
