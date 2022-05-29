package ecommerce.DTO;

import org.springframework.beans.BeanUtils;

import ecommerce.entities.OrderDetails;
import ecommerce.entities.Product;

public class OrderDetailsDTO {

	private int id;
	private Product product;
	private int qty;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public static OrderDetailsDTO fromEntity(OrderDetails entity) {
		OrderDetailsDTO dto = new OrderDetailsDTO();
		BeanUtils.copyProperties(entity, dto); // Copy the property values of the given source bean into the target bean
		return dto;
	}
}
