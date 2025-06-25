package com.javaex.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVO;

@Repository
public class PhonebookDAO {

	// 필드
	@Autowired
	private SqlSession sqlSession;
	
    // 전체 리스트 가져오기
    public List<PersonVO> personSelect() {
        System.out.println("PhonebookDAO.personSelect()");
        List<PersonVO> personList = sqlSession.selectList("phonebook.selectList");
        return personList;
    }
    	
	//등록
	public int personInsert(PersonVO personVO) {
		System.out.println("PhonebookDAO.personInsert()");
		
		int count = sqlSession.insert("Phonebook.insert", personVO);		
		
		return count;
	}
	
	//삭제
	public int personDelete(PersonVO personVO) {
		System.out.println("PhonebookDAO.personDelete()");
		
		int count = sqlSession.delete("Phonebook.delete", personVO);
		
		return count;
	}
	
	
	// 수정
	public int personUpdate(PersonVO personVO) {
        System.out.println("PhonebookDAO.personUpdate()");
        
        int count = sqlSession.update("phonebook.update", personVO);
        
        return count;
	}
	
}