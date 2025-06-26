package com.javaex.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVO;

@Repository
public class PhonebookDAO {

	//필드
	@Autowired
	private SqlSession sqlSession;
	
	
	//메소드일반
	//--전체 리스트
	public List<PersonVO> personSelect() {
		System.out.println("PhonebookDAO.personSelect()");
		
		List<PersonVO> personList = sqlSession.selectList("phonebook.selectList2");
		System.out.println("----");
		System.out.println(personList);
		System.out.println("----");
		return personList;
	}
	
	//--1명데이터 가져오기
	public PersonVO personSelectOne(int personId) {
		System.out.println("PhonebookDAO.personSelectOne()");
	
		PersonVO personVO = sqlSession.selectOne("phonebook.selectOne", personId);
		
		Map<String, Object> map = sqlSession.selectOne("phonebook.selectOne2", personId);
		System.out.println("---------------");
		System.out.println(map);
		System.out.println(map.get("name"));
		System.out.println("---------------");
		/*
		"personId"   1
		"name"		"박명수"
		"hp" 		"010"
		"company" 	"02"
		*/
		
		return personVO;
	}
	
	//--1명저장
	public int personInsert(PersonVO personVO) {
		System.out.println("PhonebookDAO.personInsert()");
		
		int count = sqlSession.insert("phonebook.insert", personVO);
		
		return count;
	}
	
	//--1명저장Map
	public int personInsert2(Map<String, String> personMap) {
		System.out.println("PhonebookDAO.personInsert2()");
		
		System.out.println(personMap);
		int count = sqlSession.insert("phonebook.insert2", personMap);
		System.out.println(count);
		return count;
	}
	
}