package Try_3;

import java.util.Arrays;
import java.util.List;

public class Menu {
    /*
    * 음식 이름
    * 음식 설명*/

    String name;
    String description;

    public Menu() {

    }
    public Menu(String menuName, String menuDescription){
        this.name = menuName;
        this.description = menuDescription;
    }

    // 모든 클래스는 toString 이라는 메소드를 기본탑재 되어있는데, 오버라이드 해서 사용하지 않으면 아래 콘솔 처럼 주소값이 나오는 대참사 발생
    // 그래서 기존의 주소값을 나오게 하는 toString 메소드를 재정의 함으로써 올바르게 사용하도록 재정의 함
    @Override
    public String toString() {
        // "" + "" 이런식으로 문자열을 더하면 지저분해서 스트링 빌더 클래서 활용
        StringBuilder builder = new StringBuilder();
        builder.append(this.name);
        builder.append("\t");
        builder.append("|");
        builder.append("\t");
        builder.append(this.description);
        return builder.toString();
    }

    public List<Menu> getMenu() {
        return Arrays.asList(
                new Menu("Burgers", "앵거스 비프 통살을 다져만든 버거"),
                new Menu("Drinks", "매장에서 직접 만드는 음료"),
                new Menu("Beer", "뉴욕 브루클린 브루어리에서 양조한 맥주")

        );
    }

    public List<Menu> getOrderMenu(){
        return Arrays.asList(
                new Menu("Order", "장바구니를 확인 후 주문합니다."),
                new Menu("Cancel", "진행중인 주문을 취소합니다.")
        );
    }

}
