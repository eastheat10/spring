package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.dto.Category;
import net.skhu.dto.Product;
import net.skhu.mapper.CategoryMapper;
import net.skhu.mapper.ProductMapper;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired ProductMapper productMapper;
	@Autowired CategoryMapper categoryMapper;

	@RequestMapping("list")
	public String list(Model model) {
		// List<Category> categorys = categoryMapper.findAll();
		List<Product> products = productMapper.findAll();
		// model.addAttribute("categorys", categorys);
		model.addAttribute("products", products);
		return "product/list";
	}

	@GetMapping("create")
	public String create(Model model) {
		Product product = new Product();
		List<Category> categorys = categoryMapper.findAll();
		model.addAttribute("product", product);
		model.addAttribute("categorys", categorys);
		return "product/edit";
	}

	@PostMapping("create")
	public String create(Model model, Product product) {
		productMapper.insert(product);
		return "redirect:list";
	}

	@GetMapping("edit")
	public String edit(Model model, @RequestParam("id") int id) {
		Product product= productMapper.findOne(id);
		List<Category> categorys = categoryMapper.findAll();
		model.addAttribute("product", product);
		model.addAttribute("categorys", categorys);
		return "product/edit";
	}

	@PostMapping("edit")
	public String edit(Model model, Product product) {
		productMapper.update(product);
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(Model model, @RequestParam("id") int id) {
		productMapper.delete(id);
		return "redirect:list";
	}

}
