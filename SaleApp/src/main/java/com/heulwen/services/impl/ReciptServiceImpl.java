/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.heulwen.services.impl;

import com.heulwen.pojo.Cart;
import com.heulwen.repositories.ReciptRepository;
import com.heulwen.services.ReciptService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ReciptServiceImpl implements ReciptService{

    @Autowired
    private ReciptRepository reciptRepo;

    @Override
    public void addRecipt(List<Cart> carts) {
        this.reciptRepo.addRecipt(carts);
    }
    
}
