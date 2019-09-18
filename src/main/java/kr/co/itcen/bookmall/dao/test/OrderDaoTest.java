package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.OrderDao;
import kr.co.itcen.bookmall.vo.OrderVo;

public class OrderDaoTest {
	

	public static void main(String[] args) {
		insertTest();
		selectTest();
		deleteAllTest();
	}
	
	public static void deleteAllTest(){
		OrderDao dao = new OrderDao();
		dao.delete();
		dao.initAutoIncrement();
	}

	
	public static void insertTest() {
		
		OrderDao dao = new OrderDao();

		OrderVo vo1 = new OrderVo();
		vo1.setTotalCost(50000L);
		vo1.setAddress("경기도 성남시 분당구 정자동");
		vo1.setDate("2019년 9월 1일");
		vo1.setNo(1L);
		dao.insert(vo1);

		
	}
	
	public static void selectTest() {
		System.out.println("-------------주문 select-------------");

		OrderDao dao = new OrderDao();

		List<OrderVo> list = dao.getList();
		for(OrderVo vo:list) {
			System.out.println(vo);
		}
	}
}
