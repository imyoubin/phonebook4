package com.javaex.repository;

import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVO;

@Repository
public class PhonebookRepository {

    @Autowired
    private SqlSession sqlSession;

    public List<PersonVO> personSelect() {
        return sqlSession.selectList("phonebook.selectList2");
    }
}