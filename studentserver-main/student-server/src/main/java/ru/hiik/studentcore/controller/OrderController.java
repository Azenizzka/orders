package ru.hiik.studentcore.controller;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import ru.hiik.studentcore.Order;
import ru.hiik.studentcore.service.OrderService;

//   10.0.0.10:9797/students 
//   localhost:9797/students  

@Path("/students")
public class OrderController {
    private static final Logger log = Logger.getLogger(OrderController.class.getName());

    @Inject
    OrderService orderService;

    /**
     * Получение полного списка студентов
     *
     * @return
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)   // Преобразует список в JSON массив
    public List<Order> getAllStudent() {
        log.log(Level.INFO, "Поступил запрос на получение полного списка заказов");
        List<Order> orders = orderService.getAll();
        if (orders != null) {
            log.log(Level.INFO, "Получен список заказов [" + orders.size() + "] записей");
        }

        return orders;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Order create(Order order) {
        log.log(Level.INFO, "Поступил запрос на сохранение заказа в базе данных");
        Order savedOrder = orderService.save(order);
        if (savedOrder != null) {
            log.log(Level.INFO, "Заказ: [" + savedOrder + "] сохранен в базе данных");
        }

        return savedOrder;
    }

    /**
     * Метод уадаления студента из базы данных 
     *
     * @param
     * @return
     */
    @Path("/{id}")
    public long delete(@PathParam("id") long id) {
        log.log(Level.INFO, "Поступил запрос на удаление заказа из базы данных, идентификатор заказа: [" + id + "]");
        long isDeletedOrder = orderService.delete(id);
        log.log(Level.INFO, "Заказ c номером : [" + isDeletedOrder + "] удален из базы данных");
        return isDeletedOrder;
    }

}