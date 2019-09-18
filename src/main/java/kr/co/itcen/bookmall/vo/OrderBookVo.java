package kr.co.itcen.bookmall.vo;

public class OrderBookVo {
	
	private Long orderBookNum;
	private Long orderNo;
	private Long bookCode;
	
	public Long getOrderBookNum() {
		return orderBookNum;
	}
	public void setOrderBookNum(Long orderBookNum) {
		this.orderBookNum = orderBookNum;
	}
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public Long getBookCode() {
		return bookCode;
	}
	public void setBookCode(Long bookCode) {
		this.bookCode = bookCode;
	}
	
	@Override
	public String toString() {
		return "OrderBookVo [orderBookNum=" + orderBookNum + ", orderNo=" + orderNo + ", bookCode=" + bookCode + "]";
	}
	
	
}
