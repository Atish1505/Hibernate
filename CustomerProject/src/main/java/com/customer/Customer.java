package com.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_details")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	@Column(name="Customer_Name",length = 50)
	private String cname;
	@Column(name="Customer_City", length = 30)
	private String ccity;
	private Orders order;
	
	


	public Customer(int cid, String cname, String ccity, Orders order) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.ccity = ccity;
		this.order = order;
	}


	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", ccity=" + ccity + ", order=" + order + "]";
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public String getCcity() {
		return ccity;
	}


	public void setCcity(String ccity) {
		this.ccity = ccity;
	}


	public Orders getOrder() {
		return order;
	}


	public void setOrder(Orders order) {
		this.order = order;
	}
	
	

}
