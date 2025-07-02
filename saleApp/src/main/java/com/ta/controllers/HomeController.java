package com.ta.controllers;


import com.ta.Services.CategoryService;
import com.ta.pojo.Category;
import jakarta.persistence.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
    @Autowired
    private CategoryService cateService;
    
    @RequestMapping("/")
    @Transactional
    public String index(Model model){
      
        model.addAttribute("categories", this.cateService.getCates());
        
        return "index";
    }
}
