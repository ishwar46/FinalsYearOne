package UML;

import java.util.Date;

public class OrderSystem {
}

class Customer{
    private int CustomerID;
    private String CustomerName;
    private String Address;
    private int Phone;

    public String AddCustomer(){

        return null;
    }

    public String EditCustomer(){
        return null;
    }

    public String DeleteCustomer(){
        return null;
    }
}

class Order{
    private int OrderId;
    private int CustomerId;
    private String CustomerName;
    private int ProductId;
    private float Amount;
    private Date OrderDate;


    public void CreateOrder(){
        return;
    }
    public void EditOrder(){
        return;
    }
}

class Product{
    private int ProductId;
    private float ProductPrice;
    private String ProductType;

    public void AddProduct(){
        return;
    }

    public void ModifyProduct(){
        return;
    }

    public int SelectProduct(int ProductId){
        return 0;
    }

}

class Stock{
    private int ProductId;
    private int Quality;
    private int ShopNo;

    public void AddStock(){
        return;
    }

    public int ModifyStock(int ProductId){
        return 0;
    }

    public int SelectStockItem(int ProductId){
        return 0;
    }
}