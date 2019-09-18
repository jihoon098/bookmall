package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.OrderBookDao;
import kr.co.itcen.bookmall.vo.OrderBookVo;

public class OrderBookTest {
	public static void main(String[] args) {
		insertTest();
		selectTest();
		deleteAllTest();
	}
	
	public static void deleteAllTest(){
		OrderBookDao dao = new OrderBookDao();
		dao.delete();
		dao.initAutoIncrement();
	}

	
	public static void insertTest() {
		
		OrderBookDao dao = new OrderBookDao();

		OrderBookVo vo1 = new OrderBookVo();
		vo1.setOrderNo(1L);
		vo1.setBookCode(1L);
		dao.insert(vo1);
		
		OrderBookVo vo2 = new OrderBookVo();
		vo2.setOrderNo(1L);
		vo2.setBookCode(3L);
		dao.insert(vo2);

	}
	
	public static void selectTest() {
		System.out.println("-------------주문도서 select-------------");

		OrderBookDao dao = new OrderBookDao();

		List<OrderBookVo> list = dao.getList();
		for(OrderBookVo vo:list) {
			System.out.println(vo);
		}
	}
}
