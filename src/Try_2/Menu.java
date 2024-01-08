package Try_2;

import java.util.HashMap;

public class Menu {

    String menuName;
    String menuComment;

    HashMap<String, String> menuList = new HashMap<>();


    public HashMap<String, String> makeMenuList(String menuName, String menuComment) {
        this.menuName = menuName;
        this.menuComment = menuComment;
        menuList.put(menuName, menuComment);

        return menuList;
    }
}

//        menuList.put("1. Burger", "맛있는 버거");
//        menuList.put("2. Drink", "어울리는 음료");
//        menuList.put("3. Beer", "시원한 맥주");