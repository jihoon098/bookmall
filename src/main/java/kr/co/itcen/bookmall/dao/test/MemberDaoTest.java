package kr.co.itcen.bookmall.dao.test;

import java.util.List;

import kr.co.itcen.bookmall.dao.MemberDao;
import kr.co.itcen.bookmall.vo.MemberVo;

public class MemberDaoTest {

	public static void main(String[] args) {
		insertTest();
		selectTest();
		deleteAllTest();
	}
	
	public static void deleteAllTest(){
		MemberDao dao = new MemberDao();
		dao.delete();
		dao.initAutoIncrement();
	}

	
	public static void insertTest() {
		
		MemberDao dao = new MemberDao();

		MemberVo vo1 = new MemberVo();
		vo1.setName("jihoon");
		vo1.setPhoneNum("010-1111-1111");
		vo1.setEmail("jihoon@naver.com");
		vo1.setPasswd("1234");
		dao.insert(vo1);
		
		MemberVo vo2 = new MemberVo();
		vo2.setName("selgi");
		vo2.setPhoneNum("010-2222-2222");
		vo2.setEmail("selgi@naver.com");
		vo2.setPasswd("1111");
		dao.insert(vo2);
	}
	
	public static void selectTest() {
		System.out.println("-------------고객 select-------------");

		MemberDao dao = new MemberDao();

		List<MemberVo> list = dao.getList();
		for(MemberVo vo:list) {
			System.out.println(vo);
		}
	}
}
