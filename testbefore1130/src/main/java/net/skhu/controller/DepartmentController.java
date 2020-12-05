package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.mapper.DepartmentMapper;

@Controller
public class DepartmentController {

	@Autowired DepartmentMapper departmentMapper;

    @RequestMapping("department/list")
    public String list(Model model
    		,@RequestParam(value="order", required=false, defaultValue="0") int order) {
        model.addAttribute("departments", departmentMapper.findAll(order));
        model.addAttribute("order", order);
        return "department/list";
    }

}
