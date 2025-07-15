package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.repository.PhonebookRepository;
import com.javaex.vo.PersonVO;

@Service
public class PhonebookService {

    @Autowired
    private PhonebookRepository phonebookRepository;

    public List<PersonVO> exeList() {
        return phonebookRepository.personSelect();
    }
}