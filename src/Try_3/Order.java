package Try_3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Order {
    /*
    * 선택 상품 저장
    * 선택 상품 출력*/

    List<Product> savedList = new ArrayList<>();

    public void saveList (Product product){
        savedList.add(product);
    }

    public void deleteList (){
        savedList.remove(savedList.size()-1);
    }

    public void clearList(){
        savedList.clear();
    }

    public List<Product> getSavedList() {
        return savedList;
    }

    public void getTotalPrice(){
        Double totalPrice = getSavedList().stream().mapToDouble(Product::getProductPrice).sum();
        System.out.println("W " + totalPrice);
    }
}
