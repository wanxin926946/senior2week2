package com.wanxin.senior2.week2.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author 926474
 *	编写goods类
 */
public class Goods implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6665467740238544873L;

	private Integer id;   // ID
	private String name;  // 商品名称
	private BigDecimal price;  // 商品价格
	private Double sell;  // 已售百分比
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Double getSell() {
		return sell;
	}
	public void setSell(Double sell) {
		this.sell = sell;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", price=" + price + ", sell=" + sell + "]";
	}
	public Goods(Integer id, String name, BigDecimal price, Double sell) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.sell = sell;
	}
	public Goods() {
		super();
	}
	public Goods(String name, BigDecimal price, Double sell) {
		super();
		this.name = name;
		this.price = price;
		this.sell = sell;
	}
	
	
	
}
