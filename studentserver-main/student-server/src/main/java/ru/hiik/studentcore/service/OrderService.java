/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.hiik.studentcore.service;

import java.util.List;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import ru.hiik.studentcore.Order;


/**
 *  Класс, работающий с базой данных заказов
 * @author developer
 */
@ApplicationScoped
public class OrderService {

    @Inject
    EntityManager em;

    /**
     * Получение полного списка заказов
     * @return
     */
    @Transactional
    public List<Order> getAll(){
        List <Order> orders = (List <Order>) em.createQuery("Select t from " + Order.class.getSimpleName() + " t").getResultList();
        return orders;
    }

    /**
     * Сохранение заказа в базе данных
     *
     * @param order
     * @return
     */
    @Transactional
    public Order save(Order order){
        em.persist(order);
        return order;
    }

    @Transactional
    public long delete(long id){
        em.remove(id);
        return id;
    }

    @Transactional
    public Optional<Order> find(long id){
        Optional<Order> opt = Optional.empty();
        Order foundOrder = em.find(Order.class, id);

        if (foundOrder != null) {
            opt = Optional.of(foundOrder);
        }

        return opt;
    }



}
