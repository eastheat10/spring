package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.mapper.DistrictMapper;

@Controller
public class DistrictController {

	@Autowired DistrictMapper districtMapper;

    @RequestMapping("district/list")
    public String list(Model model) {
        model.addAttribute("districts", districtMapper.findAll());
        return "district/list";
    }
}
