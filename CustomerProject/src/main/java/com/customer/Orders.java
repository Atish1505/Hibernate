package com.customer;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class Orders {
	
	private int order_id;
	private String order_type;
	private String order_name;

	public Orders() {
		
			super();
	}

	public Orders(int order_id, String order_type, String order_name) {
		super();
		this.order_id = order_id;
		this.order_type = order_type;
		this.order_name = order_name;
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrder_type() {
		return order_type;
	}

	public void setOrder_type(String order_type) {
		this.order_type = order_type;
	}

	public String getOrder_name() {
		return order_name;
	}

	public void setOrder_name(String order_name) {
		this.order_name = order_name;
	}

	@Override
	public String toString() {
		return "Orders [order_id=" + order_id + ", order_type=" + order_type + ", order_name=" + order_name + "]";
	}

	
}
