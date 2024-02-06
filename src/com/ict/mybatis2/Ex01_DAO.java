package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Ex01_DAO {
	private static SqlSession ss;
	
	private synchronized static SqlSession getSession() {
		if(ss == null) {
			ss = Ex01_DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB처리하는 메서드들 
	// 전체 테이블 보기
	public static List<Ex01_VO> getList(){
		List<Ex01_VO> list = null;
		list = getSession().selectList("members.selectAll");
		return list;
	}
	
	// idx를 받아서 특정 데이터 보기 
	public static Ex01_VO getOne(String idx) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("members.selectOne", idx);
		return vo;
	}
	
	// 삽입하기
	public static int getInsert(Ex01_VO vo2) {
		int res = 0 ;
		res = getSession().insert("members.insert", vo2);
		if(res>0) {
			ss.commit();
		}
		return res ;
	}
	// 삭제하기
	public static int getDelete(String idx) {
		int res = 0 ;
		res = getSession().delete("members.delete", idx);
		if(res>0) {
			ss.commit();
		}
		return res;
	}
	// 삭제하기
	public static int getDelete(Ex01_VO vo3) {
		int res = 0 ;
		res = getSession().delete("members.delete2", vo3);
		if(res>0) {
			ss.commit();
		}
		return res;
	}
		
	public static int getUpdate(Ex01_VO vo4) {
		int res = 0 ;
		res = getSession().update("members.update", vo4);
		if(res>0) {
			ss.commit();
		}
		return res;
	}
	public static Ex01_VO getLogin(Ex01_VO vo5) {
		Ex01_VO vo = null;
		vo = getSession().selectOne("members.login", vo5);
		
		// 아이디가 없으면 null이 되므로 return null;
		if(vo != null) {
			// pw를 얻어내자 (db에 암호화가 되어있다.)
			String pw = vo.getPw();
			
			// 우리가 입력한 pw 를 암호화 하자 (나중에) 
			// String s_pw = vo5.getPw().암호화 메서드 사용
			
			// db에서 꺼낸 pw와 암호화된 pw를 비교하자 (나중에)
			// 이것이 true 성공 , false이면 실패
			boolean res = false;
			
			if(res) {
				return vo;
			}else {
				return null;
			}
		}else {
			return null;
		}
	}
}























