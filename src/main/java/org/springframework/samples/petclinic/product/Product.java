package org.springframework.samples.petclinic.product;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

@Getter
@Setter
@Entity
@Table(name = "Products")
public class Product {
    @Id
    Integer id;

	@NotEmpty
    @Size(min=3, max=50)
    String name;

	@NotEmpty
    @Min(value = 0)
    double price;
    
    @ManyToOne(targetEntity=ProductType.class, fetch=FetchType.LAZY)
	@JoinColumn(name="productType_id")
    ProductType productType;
}