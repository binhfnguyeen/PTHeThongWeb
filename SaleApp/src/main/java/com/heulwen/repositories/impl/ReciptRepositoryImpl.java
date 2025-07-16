/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.heulwen.repositories.impl;

import com.heulwen.pojo.Cart;
import com.heulwen.pojo.OrderDetail;
import com.heulwen.pojo.SaleOrder;
import com.heulwen.repositories.ReciptRepository;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Dell
 */
@Repository
@Transactional
public class ReciptRepositoryImpl implements ReciptRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    public void addRecipt(List<Cart> carts) {

        if (carts != null) {
            Session s = this.factory.getObject().getCurrentSession();
            SaleOrder order = new SaleOrder();
            order.setUserId(new UserRepositoryImpl().getUserByUsername("dhthanh"));
            order.setCreatedDate(new Date());
            s.persist(order); // Insert bảng ghi mới vào SaleOrder

            for (var x : carts) {
                OrderDetail d = new OrderDetail();
                d.setQuantity(x.getQuantity());
                d.setUnitPrice(x.getPrice());
                d.setProductId(new ProductRepositoryImpl().getProductById(x.getId()));
                d.setOrderId(order);

                s.persist(d); // INSERT bảng ghi mới vào OrderDetail
            }

        }
    }
}
