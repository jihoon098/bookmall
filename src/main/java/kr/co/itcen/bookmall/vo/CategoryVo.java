package kr.co.itcen.bookmall.vo;

public class CategoryVo {
	
	private Long categoryID;
	private String categoryType;
	
	public Long getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(Long categoryID) {
		this.categoryID = categoryID;
	}
	public String getCategoryType() {
		return categoryType;
	}
	public void setCategoryType(String categoryType) {
		this.categoryType = categoryType;
	}
	
	@Override
	public String toString() {
		return "categoryVo [categoryID=" + categoryID + ", categoryType=" + categoryType + "]";
	}
	
}
