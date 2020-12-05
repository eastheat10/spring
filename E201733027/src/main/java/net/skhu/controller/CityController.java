package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.entity.City;
import net.skhu.entity.District;
import net.skhu.repository.CityRepository;
import net.skhu.repository.DistrictRepository;

@Controller
@RequestMapping("/city")
public class CityController {

	@Autowired
	DistrictRepository districtRepository;
	@Autowired
	CityRepository cityRepository;

	@RequestMapping("list")
	public String list(Model model) {
		List<City> cities = cityRepository.findAll();
		model.addAttribute("cities", cities);
		return "city/list";
	}

	@GetMapping("create")
	public String create(Model model) {
		City city = new City();
		List<District> districts = districtRepository.findAll();
		model.addAttribute("city", city);
		model.addAttribute("districts", districts);
		return "city/edit";
	}

	@PostMapping("create")
	public String create(Model model, City city) {
		cityRepository.save(city);
		return "redirect:list";
	}

}
