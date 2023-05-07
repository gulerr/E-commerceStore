package entity;

import jakarta.persistence.*;

import java.io.Serializable;

public class OrderProduct implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
@ManyToOne
@JoinColumn(name = "product_id")
private Product product;

@ManyToOne
@JoinColumn(name = "order_id")
private Customer customer;



}
