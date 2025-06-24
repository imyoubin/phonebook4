package com.javaex.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.javaex.dao.PhonebookDAO;
import com.javaex.vo.PersonVO;

@Controller
@RequestMapping("/phonebook4")
public class PhonebookController {

    // 1. 전체 리스트
    @RequestMapping(value = "/list", method = {RequestMethod.GET, RequestMethod.POST})
    public String list(Model model) {
        System.out.println("PhonebookController.list()");
        PhonebookDAO dao = new PhonebookDAO();
        List<PersonVO> list = dao.personSelect();
        model.addAttribute("pList", list);
        return "list";
    }

    // 2. 등록 폼
    @RequestMapping(value = "/wform", method = RequestMethod.GET)
    public String writeForm() {
        System.out.println("PhonebookController.writeForm()");
        return "writeForm";
    }

    // 3. 등록 처리
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public String insert(@ModelAttribute PersonVO personVO) {
        System.out.println("PhonebookController.insert()");
        System.out.println(personVO);
        new PhonebookDAO().personInsert(personVO);
        return "redirect:/phonebook4/list";
    }

    // 4. 수정 폼
    @RequestMapping(value = "/updateForm", method = RequestMethod.GET)
    public String updateForm(@RequestParam("no") int no, Model model) {
        System.out.println("PhonebookController.updateForm() - no: " + no);
        PersonVO pVO = new PhonebookDAO().personSelectOne(no);
        model.addAttribute("pVO", pVO);
        return "updateForm";
    }

    // 5. 수정 처리
    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@ModelAttribute PersonVO personVO) {
        System.out.println("PhonebookController.update()");
        System.out.println(personVO);
        new PhonebookDAO().personUpdate(personVO);
        return "redirect:/phonebook4/list";
    }

    // 6. 삭제 폼
    @RequestMapping(value = "/deleteForm", method = RequestMethod.GET)
    public String deleteForm(@RequestParam("no") int no, Model model) {
        System.out.println("PhonebookController.deleteForm() - no: " + no);
        model.addAttribute("no", no);
        return "deleteForm";
    }

    // 7. 삭제 처리
    @RequestMapping(value = "/delete", method = RequestMethod.GET)
    public String delete(@RequestParam("no") int no) {
        System.out.println("PhonebookController.delete() - no: " + no);
        new PhonebookDAO().personDelete(no);
        return "redirect:/phonebook4/list";
    }
}