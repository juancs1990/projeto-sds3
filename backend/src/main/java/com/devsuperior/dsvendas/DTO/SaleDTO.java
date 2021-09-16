package com.devsuperior.dsvendas.DTO;

import java.time.LocalDate;
 

import com.devsuperior.dsvendas.model.Seller;

public class SaleDTO {
	
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;
	private Seller seller;
	public Integer getVisited() {
		return visited;
	}
	public void setVisited(Integer visited) {
		this.visited = visited;
	}
	public Integer getDeals() {
		return deals;
	}
	public void setDeals(Integer deals) {
		this.deals = deals;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public SaleDTO(Integer visited, Integer deals, Double amount, LocalDate date, Seller seller) {
		this.visited = visited;
		this.deals = deals;
		this.amount = amount;
		this.date = date;
		this.seller = seller;
	}
	
	public SaleDTO() {}
	
	
	

}
