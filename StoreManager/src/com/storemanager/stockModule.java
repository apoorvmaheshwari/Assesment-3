package com.storemanager;

public class stockModule {
	private int stockCode;
	private String prodName;
	private float cost;
	private int quant;
	public stockModule(int stockCode, String prodName, float cost, int quant) {
		super();
		this.stockCode = stockCode;
		this.prodName = prodName;
		this.cost = cost;
		this.quant = quant;
	}
	public int getStockCode() {
		return stockCode;
	}
	public void setStockCode(int stockCode) {
		this.stockCode = stockCode;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public int getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
	}
	@Override
	public String toString() {
		return "stockModule [stockCode=" + stockCode + ", prodName=" + prodName + ", cost=" + cost + ", quant=" + quant
				+ "]";
	}
	

}
