package org.tcs.hackathon.prd.model;

import java.util.List;

import io.quarkus.mongodb.panache.MongoEntity;
import io.quarkus.mongodb.panache.PanacheMongoEntity;

@MongoEntity(collection = "Product")
public class Product extends PanacheMongoEntity {
	//public long id;
	/*public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}*/
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<String> getAvailableSize() {
		return availableSize;
	}
	public void setAvailableSize(List<String> availableSize) {
		this.availableSize = availableSize;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getInstallments() {
		return installments;
	}
	public void setInstallments(int installments) {
		this.installments = installments;
	}
	public String getCurrencyId() {
		return currencyId;
	}
	public void setCurrencyId(String currencyId) {
		this.currencyId = currencyId;
	}
	public String getCurrencyFormat() {
		return currencyFormat;
	}
	public void setCurrencyFormat(String currencyFormat) {
		this.currencyFormat = currencyFormat;
	}
	public boolean isFreeShipping() {
		return isFreeShipping;
	}
	public void setFreeShipping(boolean isFreeShipping) {
		this.isFreeShipping = isFreeShipping;
	}
	public String sku;
	public String title;
	public String description;
	public List<String> availableSize;
	public String style;
	public double price;
	public int installments;
	public String currencyId;
	public String currencyFormat;
	public boolean isFreeShipping;
	
	public static Product findByTitle(String title) {
        return find("title", title).firstResult();
    }

	/*public static Product findById(String id) {
        return find("id", id).firstResult();
    }*/
	
	
	
	
}
