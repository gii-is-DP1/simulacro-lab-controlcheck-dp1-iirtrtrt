package org.springframework.samples.petclinic.product;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;
import java.util.List;
import java.util.ArrayList;

@Getter
@Setter
@Entity
@Table(name = "ProductTypes")
public class ProductType {
    @Id
    Integer id;

    @NotEmpty
    @Size(min=3, max=50)
    @Column(unique = true)
    String name;

    @OneToMany(mappedBy = "products") 
    private List<Product> products = new ArrayList<>();
}