/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ru.hiik.studentcore;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author developer
 */
@Entity
@Table(name="students")
public class Order implements Serializable  {

    // Общие параметры заказа, не относящиеся к какому-либо человеку
    private int orderWeight;                // Вес заказа
    private String orderInside;             // То, что внутри заказа
    private LocalDate orderDate;            // Дата заказа

    @Id
    @SequenceGenerator(name = "studentSeq", sequenceName = "student_id_seq", allocationSize = 1, initialValue = 1)
    @GeneratedValue(generator = "studentSeq")
    private Long id;                        // ID заказа, т.е его номер

    // Отправитель:
    private String senderAdress;            // Адресс
    private String senderName;              // Имя
    private String senderSurename;          // Фамилия
    private String senderPatronymic;        // Отчество

    // Отправитель:
    private String recipientAdress;         // Адресс
    private String recipientName;           // Имя
    private String recipientSurename;       // Фамилия
    private String recipientPatronymic;     // Отчество

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "ID Заказа: " + id + "\n" +
                "Вес заказа: " + orderWeight + "\n" +
                "Внутри заказа: " + orderInside + "\n"
                +
                "Адресс отправителя: " + senderAdress + "\n" +
                "ФИО отправителя: " + senderSurename + " " + senderName + " " + senderPatronymic + "\n"
                +
                "Адресс получателя: " + recipientAdress + "\n" +
                "ФИО получателя: " + recipientSurename + " " + recipientName + " " + recipientPatronymic;

    }

    public int getOrderWeight() {
        return orderWeight;
    }

    public void setOrderWeight(int orderWeight) {
        this.orderWeight = orderWeight;
    }

    public String getOrderInside() {
        return orderInside;
    }

    public void setOrderInside(String orderInside) {
        this.orderInside = orderInside;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public String getSenderAdress() {
        return senderAdress;
    }

    public void setSenderAdress(String senderAdress) {
        this.senderAdress = senderAdress;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSenderSurename() {
        return senderSurename;
    }

    public void setSenderSurename(String senderSurename) {
        this.senderSurename = senderSurename;
    }

    public String getSenderPatronymic() {
        return senderPatronymic;
    }

    public void setSenderPatronymic(String senderPatronymic) {
        this.senderPatronymic = senderPatronymic;
    }

    public String getRecipientAdress() {
        return recipientAdress;
    }

    public void setRecipientAdress(String recipientAdress) {
        this.recipientAdress = recipientAdress;
    }

    public String getRecipientName() {
        return recipientName;
    }

    public void setRecipientName(String recipientName) {
        this.recipientName = recipientName;
    }

    public String getRecipientSurename() {
        return recipientSurename;
    }

    public void setRecipientSurename(String recipientSurename) {
        this.recipientSurename = recipientSurename;
    }

    public String getRecipientPatronymic() {
        return recipientPatronymic;
    }

    public void setRecipientPatronymic(String recipientPatronymic) {
        this.recipientPatronymic = recipientPatronymic;
    }
}
