/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.heulwen.repositories;

import com.heulwen.pojo.Category;
import jakarta.data.repository.Repository;
import java.util.List;

/**
 *
 * @author admin
 */
@Repository
public interface CategoryRepository {
    List<Category> getCates();
}
