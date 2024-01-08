package Try_1;

import java.util.ArrayList;
import java.util.HashMap;

public class Product {


//    public HashMap
    public ArrayList<String> showBurger(){
        ArrayList<String> burgerMenu = new ArrayList<>();
        burgerMenu.add("CheeseBurger");
        burgerMenu.add("ShrimpBurger");
        burgerMenu.add("BulgogiBurger");

        return burgerMenu;
    }

    public ArrayList<Double> showBurgerPrice(){
        ArrayList<Double> burgerPrice = new ArrayList<>();
        burgerPrice.add(4.9);
        burgerPrice.add(5.9);
        burgerPrice.add(6.9);

        return burgerPrice;
    }

    public ArrayList<String> showBurgerComment(){
        ArrayList<String> burgerComment = new ArrayList<>();
        burgerComment.add("녹진한 치즈가 듬뿍");
        burgerComment.add("통통한 새우가 한가득");
        burgerComment.add("한국 전통의 맛!");

        return burgerComment;
    }



    public ArrayList<String> showDrink(){
        ArrayList<String> drinkMenu = new ArrayList<>();
        drinkMenu.add("CokaCola");
        drinkMenu.add("Sprite");
        drinkMenu.add("Water");

        return drinkMenu;
    }

    public ArrayList<Double> showDrinkPrice(){
        ArrayList<Double> drinkPrice = new ArrayList<Double>();
        drinkPrice.add(2.0);
        drinkPrice.add(2.0);
        drinkPrice.add(1.0);

        return drinkPrice;
    }

    public ArrayList<String> showDrinkComment(){
        ArrayList<String> drinkComment = new ArrayList<>();
        drinkComment.add("근본 코카 콜라");
        drinkComment.add("버거에 시원한 스프라이트");
        drinkComment.add("0Kcal의 물!");

        return drinkComment;
    }

    public ArrayList<String> showBeer(){
        ArrayList<String> beerMenu = new ArrayList<>();
        beerMenu.add("Cass");
        beerMenu.add("Terra");
        beerMenu.add("Kelly");

        return beerMenu;
    }

    public ArrayList<Double> showBeerPrice(){
        ArrayList<Double> beerPrice = new ArrayList<Double>();
        beerPrice.add(4.0);
        beerPrice.add(5.0);
        beerPrice.add(6.0);

        return beerPrice;
    }

    public ArrayList<String> showBeerComment(){
        ArrayList<String> beerComment = new ArrayList<>();
        beerComment.add("카-쓰");
        beerComment.add("테-라");
        beerComment.add("켈-리");

        return beerComment;
    }

}
