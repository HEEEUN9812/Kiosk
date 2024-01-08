package Try_3;

import java.util.*;

public class Product extends Menu {
    /*
    * 상품 이름
    * 상품 설명
    * 상품 가격*/

    private String productName;
    private String productDescription;
    private Double productPrice;

    public Product() {
        super();
    }
    public Product (String menuName, String menuDescription, String productName, String productDescription, Double productPrice){
        super(menuName, menuDescription);
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;

    }
    public Product(String productName, String productDescription, Double productPrice){
        this.productName = productName;
        this.productDescription = productDescription;
        this.productPrice = productPrice;
    }

    public String getMenuName() {
        return super.name;
    }

    public String getDescription() {
        return super.description;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(this.productName);
        builder.append("\t");
        builder.append("|");
        builder.append("\t");
        builder.append("W " + this.productPrice);
        builder.append("\t");
        builder.append("|");
        builder.append("\t");
        builder.append(this.productDescription);
        return builder.toString();
    }

    public List<Product> getBurgersList(){
        return Arrays.asList(
                new Product("ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9),
                new Product("SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9),
                new Product("Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4),
                new Product("Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9),
                new Product("Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4)
        );
    }




    public List<Product> getDrinksList() {
        return Arrays.asList(
                new Product("CocaCola", "근본 코카 콜라", 2.0),
                new Product("Sprite", "버거에는 시원한 스프라이트", 2.0),
                new Product("Water", "0Kcal의 물!", 1.0)
        );
    }

    public List<Product> getBeersList() {
        return Arrays.asList(
                new Product("Cass", "카-스", 4.0),
                new Product("Terra", "테-라", 5.0),
                new Product("Kelly", "캘-리", 6.0)
        );
    }


}

//    public Map<String, List<Product>> getBurgersMap() {
//        List<Product> burgers = Arrays.asList(
//                new Product("Burger", "앵거스 비프 통살을 다져만든 버거", "ShackBurger", "토마토, 양상추, 쉑소스가 토핑된 치즈버거", 6.9),
//                new Product("Burger", "앵거스 비프 통살을 다져만든 버거", "SmokeShack", "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거", 8.9),
//                new Product("Burger", "앵거스 비프 통살을 다져만든 버거", "Shroom Burger", "몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거", 9.4),
//                new Product("Burger", "앵거스 비프 통살을 다져만든 버거", "Cheeseburger", "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거", 6.9),
//                new Product("Burger", "앵거스 비프 통살을 다져만든 버거", "Hamburger", "비프패티를 기반으로 야채가 들어간 기본버거", 5.4)
//        );
//
//        Map<String, List<Product>> burgersMap = new HashMap<>();
//        burgersMap.put(getMenuName(), burgers);
//        for(Product burger : burgers){
//                List<Product> added = burgersMap.get(burger.getMenuName());
//                added.add(burger);
//                burgersMap.put(getMenuName(), added);
//            }
//        return burgersMap;
//    }
