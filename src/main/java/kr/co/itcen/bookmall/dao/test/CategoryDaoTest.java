package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.CategoryDao;
import kr.co.itcen.bookmall.vo.CategoryVo;

public class CategoryDaoTest {

	public static void main(String[] args) {
		insertTest();
		selectTest();
		deleteAllTest();
	}
	
	public static void deleteAllTest(){
		CategoryDao dao = new CategoryDao();
		dao.delete();
		dao.initAutoIncrement();
	}

	
	public static void insertTest() {
		
		CategoryDao dao = new CategoryDao();

		CategoryVo vo1 = new CategoryVo();
		vo1.setCategoryType("로맨스");
		dao.insert(vo1);
		
		CategoryVo vo2 = new CategoryVo();
		vo2.setCategoryType("호러");
		dao.insert(vo2);
		
		CategoryVo vo3 = new CategoryVo();
		vo3.setCategoryType("액션");
		dao.insert(vo3);
	}
	
	public static void selectTest() {
		System.out.println("-------------카테고리 select-------------");

		CategoryDao dao = new CategoryDao();

		List<CategoryVo> list = dao.getList();
		for(CategoryVo vo:list) {
			System.out.println(vo);
		}
	}

}
