package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.entity.Category;
import net.skhu.entity.Product;
import net.skhu.mapper.CategoryMapper;
import net.skhu.repository.CategoryRepository;
import net.skhu.repository.ProductRepository;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductRepository productRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	CategoryMapper categoryMapper;


	@RequestMapping("list")
	public String list(Model model) {
		List<Product> products = productRepository.findAll();
		model.addAttribute("products", products);
		return "product/list";
	}

	@RequestMapping("listAsc")
	public String listAsc(Model model) {
		List<Product> products = productRepository.findByOrderById();
		model.addAttribute("products", products);
		return "product/listAsc";
	}

	@GetMapping("create")
	public String create(Model model) {
		Product product = new Product();
		List<Category> categorys = categoryRepository.findAll();
		model.addAttribute("product", product);
		model.addAttribute("categorys", categorys);
		return "product/edit";
	}

	@PostMapping("create")
	public String create(Model model, Product product) {
		productRepository.save(product);
		return "redirect:list";
	}

	@GetMapping("edit")
	public String edit(Model model, @RequestParam("id") int id) {
		Product product = productRepository.findById(id).get();
		List<Category> categorys = categoryRepository.findAll();
		model.addAttribute("product", product);
		model.addAttribute("categorys", categorys);
		return "product/edit";
	}

	@PostMapping("edit")
	public String edit(Model model, Product product) {
		productRepository.save(product);
		return "redirect:list";
	}

	@RequestMapping("delete")
	public String delete(Model model, @RequestParam("id") int id) {
		productRepository.deleteById(id);
		return "redirect:list";
	}

	@RequestMapping("list1")
	public String list1(Model model) {
		model.addAttribute("categorys", categoryRepository.findAll());
		return "product/list1";
	}

	@RequestMapping("listRm")
    public String listRm(Model model) {
        model.addAttribute("categorys", categoryMapper.findAll());
        return "product/listRm";
    }

}
