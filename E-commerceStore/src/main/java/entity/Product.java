package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="product", schema="e-commercestore")
public class Product implements Serializable {
@Id
Long id;
@Column
String name;
@Column
double price;
@ManyToMany(mappedBy="products")
private List<Customer> customers;

}
