package com.proyecto.entity;
import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "sube")
public class Sube {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;
    @Column(name="balance")
    private double balance ;
    @Column(name="name")
    private String name ;
    @Column(name="last_Name")
    private String lastName ;

    public Sube(int id, double balance, String lastName, String name) {
        this.id = id;
        this.balance = balance;
        this.lastName = lastName;
        this.name = name ;
    }

    public Sube() {

    }

    public void addFounds(double newBalance) {
        balance =+ newBalance;
    }
    public String getName(){
        return  name;
    }
    public String getLastName(){
        return  lastName;
    }
    public int getId(){
        return id;
    }
    public double getBalance() {
        return balance;
    }
}
