package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.CategoryMapper;

@Controller
public class CategoryController {

    @Autowired CategoryMapper categoryMapper;

    @RequestMapping("category/list")
    public String list(Model model) {
        model.addAttribute("categorys", categoryMapper.findAll());
        return "category/list";
    }

}
