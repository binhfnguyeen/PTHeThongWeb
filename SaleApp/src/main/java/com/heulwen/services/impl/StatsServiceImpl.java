/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.heulwen.services.impl;

import com.heulwen.repositories.StatsRepository;
import com.heulwen.services.StatsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Dell
 */
@Service
public class StatsServiceImpl implements StatsService {
    @Autowired
    private StatsRepository statsRepo;

    @Override
    public List<Object[]> statsRevenueByProduct() {
        return this.statsRepo.statsRevenueByProduct();
    }

    @Override
    public List<Object[]> statsRevenueByTime(String time, int year) {
        return this.statsRepo.statsRevenueByTime(time, year);
    }
}
