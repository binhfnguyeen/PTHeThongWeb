/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.heulwen.services;

import java.util.List;
import com.heulwen.pojo.Product;
import java.util.Map;

/**
 *
 * @author admin
 */
public interface ProductService {

    public List<Product> getProducts(Map<String, String> params);
}
