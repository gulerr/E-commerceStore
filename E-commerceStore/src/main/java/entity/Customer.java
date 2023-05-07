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
public class Customer implements Serializable {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
Long id;
@Column
String customername;
@Column
String customersurname;
@Column
int customerage;
@Column
String customeremail;
@Column
String customeraddress;
@ManyToMany(cascade = CascadeType.ALL)
@JoinTable(name="customer",
joinColumns = @JoinColumn(name="order_id"),
inverseJoinColumns = @JoinColumn(name="product_id"))
private List<Product> products;

}
