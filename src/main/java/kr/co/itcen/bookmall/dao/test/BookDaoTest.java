package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.BookDao;
import kr.co.itcen.bookmall.vo.BookVo;


public class BookDaoTest {

	public static void main(String[] args) {
		insertTest();
		selectTest();
		deleteAllTest();
	}
	
	public static void deleteAllTest(){
		BookDao dao = new BookDao();
		dao.delete();
		dao.initAutoIncrement();
	}

	
	public static void insertTest() {

		BookDao dao = new BookDao();

		BookVo vo1 = new BookVo();
		vo1.setSubject("로맨스소설 명작1");
		vo1.setCost("20000");
		vo1.setCategoryID(1L);
		dao.insert(vo1);
		
		BookVo vo2 = new BookVo();
		vo2.setSubject("호러소설 명작1");
		vo2.setCost("14000");
		vo2.setCategoryID(2L);		
		dao.insert(vo2);
		
		BookVo vo3 = new BookVo();
		vo3.setSubject("사랑이란");
		vo3.setCost("30000");
		vo3.setCategoryID(1L);		
		dao.insert(vo3);
	}
	
	public static void selectTest() {
		System.out.println("-------------도서 select-------------");

		BookDao dao = new BookDao();

		List<BookVo> list = dao.getList();
		for(BookVo vo:list) {
			System.out.println(vo);
		}
	}


}
