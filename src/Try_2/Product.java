package Try_2;

import java.util.ArrayList;
import java.util.HashMap;

public class Product extends Menu {

    String productName;
    String productComment;
    Double productPrice;

    // 햄버거
    HashMap<String, ArrayList<String>> productList = new HashMap<>();

    public HashMap<String, ArrayList<String>> makeProductList(String productName, String productComment, Double productPrice) {
        ArrayList<String> value = new ArrayList<>();
        this.productName = productName;
        this.productComment = productComment;
        this.productPrice = productPrice;
        value.add(productComment);
        value.add("W "+productPrice.toString());
        productList.put(productName, value);
        return productList;
    }


    // 음료수
    // 맥주


    //    String productName;
//    String productComment;
//    Double productPrice;
//
//
//
//    public Product(String menuName, String productName, String productComment, Double productPrice) {
//        super(menuName);
//        this.productName = productName;
//        this.productComment = productComment;
//        this.productPrice = productPrice;
//    }
//
//    public String getProductName() {
//        return productName;
//    }
//
//    public String getProductComment() {
//        return productComment;
//    }
//
//    public Double getProductPrice() {
//        return productPrice;
//    }
}

