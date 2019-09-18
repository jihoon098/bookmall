package kr.co.itcen.bookmall.dao.test;

public class BookMall {

	public static void main(String[] args) {
		
		MemberDaoTest.insertTest();
		CategoryDaoTest.insertTest();
		BookDaoTest.insertTest();
		CartDaoTest.insertTest();
		OrderDaoTest.insertTest();
		OrderBookTest.insertTest();
		
		MemberDaoTest.selectTest();
		CategoryDaoTest.selectTest();
		BookDaoTest.selectTest();
		CartDaoTest.selectTest();
		OrderDaoTest.selectTest();
		OrderBookTest.selectTest();
		
		OrderBookTest.deleteAllTest();
		OrderDaoTest.deleteAllTest();
		CartDaoTest.deleteAllTest();
		BookDaoTest.deleteAllTest();
		CategoryDaoTest.deleteAllTest();
		MemberDaoTest.deleteAllTest();
	}

}
