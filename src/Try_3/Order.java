package Try_3;

import java.util.ArrayList;
import java.util.List;

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
}
