/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.heulwen.services;

import com.heulwen.pojo.Category;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author admin
 */

public interface CategoryService {
    List<Category> getCates();
}
