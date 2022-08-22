package com.aurionpro.model;

import java.util.*;

public class CustomerOrder  {
	private int orderId;
	private double orderAmount;
	private String customerName;

	public CustomerOrder(int orderId, double orderAmount, String customerName) {
		this.orderId = orderId;
		this.orderAmount = orderAmount;
		this.customerName = customerName;
	}

/*	@Override
	public int compareTo(CustomerOrder o) {
		if (o.orderId > this.orderId) {
			return 1;
		} else {
			return -1;
		}

	}*/

	@Override
	public String toString() {
		return "CustomerOrder{" + "orderId=" + orderId + ", orderAmount=" + orderAmount + ", customerName='"
				+ customerName + '\'' + '}';
	}

	public double getOrderAmount() {
		return orderAmount;
	}
}