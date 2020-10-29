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
    private BigDecimal balance ;
    @Column(name="name")
    private String name ;
    @Column(name="last_Name")
    private String lastName ;

    public Sube(int id, BigDecimal balance, String lastName, String name) {
        this.id = id;
        this.balance = balance;
        this.lastName = lastName;
        this.name = name ;
    }

    public Sube() {

    }

    public void addFounds(BigDecimal newBalance) {
        balance= balance.add(newBalance);
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
    public BigDecimal getBalance() {
        return balance;
    }
}
