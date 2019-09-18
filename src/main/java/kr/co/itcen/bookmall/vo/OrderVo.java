package kr.co.itcen.bookmall.vo;

public class OrderVo {
	
	private Long orderNo;
	private Long totalCost;
	private String address;
	private String date;
	private Long no;
	
	public Long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(Long orderNo) {
		this.orderNo = orderNo;
	}
	public Long getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Long totalCost) {
		this.totalCost = totalCost;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	
	@Override
	public String toString() {
		return "OrderVo [orderNo=" + orderNo + ", totalCost=" + totalCost + ", address=" + address + ", date=" + date
				+ ", no=" + no + "]";
	}
	
	
	
}
