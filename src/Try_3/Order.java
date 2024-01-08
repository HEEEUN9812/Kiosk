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
        // 주문 리스트 저장
        savedList.add(product);
    }

    public void deleteList (){
        // 주문 리스트 취소
        savedList.remove(savedList.size()-1);
    }

    public void clearList(){
        // 주문 리스트 초기화
        savedList.clear();
    }

    public List<Product> getSavedList() {
        return savedList;
    }

    public void getTotalPrice(){
        // 주문 리스트 총 금액
        Double totalPrice = getSavedList().stream().mapToDouble(Product::getProductPrice).sum();
        System.out.println("W " + totalPrice);
    }
}
