package com.niit.model;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

@Entity
public class Product 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int productId;
@NotNull
@Size(min=3,max=20,message="min 3 and max 20 should not leave blank")
private String productName;
@DecimalMin(value="0")
@DecimalMax(value="99999999")
@Digits(fraction=2,integer=5)
private float productPrice;
@NotNull(message="should not live blank")
@Size(min=0, max=1000,message="should not exceed 1000 and should greater than char")
private String productDespription;
@DecimalMin(value="0")
@DecimalMax(value="9999")
@NotNull(message="should not live blank")
private Integer quantity;

@Transient
private MultipartFile image;

private boolean status;

@ManyToOne(cascade=CascadeType.ALL)
private Category category;

public int getProductId() {
return productId;
}

public void setProductId(int productId) {
this.productId = productId;
}

public String getProductName() {
return productName;
}

public void setProductName(String productName) {
this.productName = productName;
}

public float getProductPrice() {
return productPrice;
}

public void setProductPrice(float productPrice) {
this.productPrice = productPrice;
}

public String getProductDespription() {
return productDespription;
}

public void setProductDespription(String productDespription) {
this.productDespription = productDespription;
}


public Integer getQuantity() {
return quantity;
}

public void setQuantity(Integer quantity) {
this.quantity = quantity;
}

public MultipartFile getImage() {
return image;
}

public void setImage(MultipartFile image) {
this.image = image;
}

public boolean isStatus() {
return status;
}

public void setStatus(boolean status) {
this.status = status;
}

public Category getCategory() {
return category;
}

public void setCategory(Category category) {
this.category = category;
}


}
