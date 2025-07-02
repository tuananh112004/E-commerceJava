/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ta.Services.impl;

import com.ta.Services.ProductService;
import com.ta.pojo.Product;
import com.ta.repositories.ProductRepository;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository prorepo;
    @Override
    public List<Product> getProducts(Map<String, String> params) {
        return this.prorepo.getProducts(params);
    }
    
}
