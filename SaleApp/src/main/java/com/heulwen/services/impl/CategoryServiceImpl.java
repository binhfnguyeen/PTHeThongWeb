/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.heulwen.services.impl;

import com.heulwen.pojo.Category;
import com.heulwen.repositories.CategoryRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.heulwen.services.CategoryService;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryRepository cateRepo;

    @Override
    public List<Category> getCates() {
        return this.cateRepo.getCates();
    }
    
    
    
}
