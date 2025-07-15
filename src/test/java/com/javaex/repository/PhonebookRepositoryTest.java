package com.javaex.repository;

import java.util.List;

import com.javaex.vo.PersonVO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
public class PhonebookRepositoryTest {

    @Autowired
    private PhonebookRepository phonebookRepository;

    @Test
    public void testPersonSelect() {
        // when
        List<PersonVO> personList = phonebookRepository.personSelect();

        // then
        assertThat(personList).isNotNull();
        assertThat(personList.size()).isGreaterThan(0);

        // 출력 확인 (캡처용)
        for (PersonVO vo : personList) {
            System.out.println(vo);
        }
    }
}