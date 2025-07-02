/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ta.Services;

import com.ta.pojo.Product;
import java.util.List;
import java.util.Map;

/**
 *
 * @author admin
 */

public interface ProductService {
      List<Product> getProducts(Map<String, String> params);
}
