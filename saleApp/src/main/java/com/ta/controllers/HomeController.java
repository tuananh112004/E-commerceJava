package com.ta.controllers;


import com.ta.Services.CategoryService;
import com.ta.Services.ProductService;
import com.ta.pojo.Category;
import jakarta.persistence.Query;
import java.util.Map;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @Autowired
    private CategoryService cateService;
    @Autowired
    private ProductService proService;
    @RequestMapping("/")
    @Transactional
    public String index(Model model, @RequestParam Map<String, String> params){
      
        model.addAttribute("categories", this.cateService.getCates());
        model.addAttribute("products", this.proService.getProducts(params));
        return "index";
    }
}
