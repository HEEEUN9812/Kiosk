package Try_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {

    public ArrayList<String> showMenuName(){
        ArrayList<String> menuName = new ArrayList<>();
        menuName.add("Burger");
        menuName.add("Drink");
        menuName.add("Beer");

        return menuName;
    }
    public ArrayList<String> showMenuComment(){
        ArrayList<String> menuComment = new ArrayList<>();
        menuComment.add("맛있는 버거");
        menuComment.add("깔끔한 음료");
        menuComment.add("시원한 맥주");

        return menuComment;
    }

    public HashMap<String,String> showMainMenu(){
        HashMap<String, String> mainMenu = new HashMap<>();
        for (int i = 0; i < showMenuName().size(); i++){
            mainMenu.put(showMenuName().get(i),showMenuComment().get(i));
        }
        return mainMenu;
    }

}

