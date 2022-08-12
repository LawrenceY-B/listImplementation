package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Products {
    private String Category;
    private String ProductName;
    private String ProductBrand;
    private int Quantity;
    private int BuyingPrice;
    private int SellingPrice;

    public long CreateId(){
        if(ProductName == null || !ProductName.equals("")){
            return (long) (1000000 + (Math.random() * 100000000));
        }else{return 0 ;}
    }
    public void productCategory(String Category) {
        this.Category = Category;
    }
    public String getProductCategory() {
        return Category;
    }
    public void setProductName(String ProductName) {
        this.ProductName = ProductName;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductBrand(String ProductBrand) {
        this.ProductBrand = ProductBrand;
    }

    public String getProductBrand() {
        return ProductBrand;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setBuyingPrice(int BuyingPrice) {
        this.BuyingPrice = BuyingPrice;
    }

    public int getBuyingPrice() {
        return BuyingPrice;
    }

    public void setSellingPrice(int SellingPrice) {
        this.SellingPrice = SellingPrice;
    }

    public int getSellingPrice() {
        return SellingPrice;
    }

    public String Date() {
        String pattern = "EEEEE dd MMMMM yyyy HH:mm:ss";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, new Locale("en", "GH"));
        return simpleDateFormat.format(new Date());
    }
}
