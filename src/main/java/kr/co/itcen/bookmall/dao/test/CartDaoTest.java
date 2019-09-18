package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.CartDao;
import kr.co.itcen.bookmall.vo.CartVo;

public class CartDaoTest {

	public static void main(String[] args) {
		insertTest();
		selectTest();
		deleteAllTest();
	}
	
	public static void deleteAllTest(){
		CartDao dao = new CartDao();
		dao.delete();
		dao.initAutoIncrement();
	}

	
	public static void insertTest() {

		CartDao dao = new CartDao();

		CartVo vo1 = new CartVo();
		vo1.setNo2(1L);
		vo1.setBookCode(2L);
		dao.insert(vo1);
		
		CartVo vo2 = new CartVo();
		vo2.setNo2(1L);
		vo2.setBookCode(3L);
		dao.insert(vo2);
	}
	
	public static void selectTest() {
		System.out.println("-------------카트 select-------------");

		CartDao dao = new CartDao();

		List<CartVo> list = dao.getList();
		for(CartVo vo:list) {
			System.out.println(vo);
		}
	}
}
