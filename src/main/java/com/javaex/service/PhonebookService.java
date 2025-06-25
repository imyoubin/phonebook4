package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.PhonebookDAO;
import com.javaex.vo.PersonVO;

@Service
public class PhonebookService {

    @Autowired
    private PhonebookDAO phonebookDAO;

    // 전체 리스트 가져오기
    public List<PersonVO> exeGetPhonebookList() {
        System.out.println("PhonebookService.exeGetPhonebookList()");
        
        List<PersonVO> PhonebookList = phonebookDAO.personSelect();
        
        return PhonebookList; 
    }

    // 전화번호 저장하기
    public int exePhonebookAdd(PersonVO personVO) {
        System.out.println("PhonebookService.exePhonebookAdd()");

        int count = phonebookDAO.personInsert(personVO);

        return count;
    }

    // 전화번호 삭제하기
    public int exePhonebookRemove(PersonVO personVO) {
        System.out.println("PhonebookService.exePhonebookRemove()");
        
        int count = phonebookDAO.personDelete(0);
        
        return count;
    }
}