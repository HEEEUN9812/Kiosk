package Try_2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            // 메인 메뉴 생성
            Menu menu = new Menu();
            System.out.println("HEE-EUN BURGER에 오신걸 환영합니다.");
            System.out.println("아래 메뉴판을 보시고 메뉴를  골라 입력해주세요");
            System.out.println("");
            System.out.println("[ HEE-EUN MENU ]");

            menu.makeMenuList("Burger", "맛있는 버거");
            menu.makeMenuList("Drink", "어울리는 음료");
            menu.makeMenuList("Beer", "시원한 맥주");

            int i = 1;
            for (String key : menu.makeMenuList(menu.menuName, menu.menuComment).keySet()) {
                String value = menu.makeMenuList(menu.menuName, menu.menuComment).get(key);
                System.out.println(i++ + ". " + key + "| " + value);
            }


            Product product = new Product();

            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();
            sc.nextLine();

            switch (select) {
                case 1:
                    //햄버거 리스트
                    System.out.println("HEE-EUN BURGER에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를  골라 입력해주세요");
                    System.out.println("");

                    System.out.println("[ Burgers Menu ]");
                    product.makeProductList("CheeseBurger", "녹진한 치즈버거", 4.9);
                    product.makeProductList("ShrimpBurger", "통통한 새우가 한가득", 5.9);
                    product.makeProductList("BulgogiBurger", "한국 전통의 맛!", 6.9);

                    // 햄버거 리스트 출력
                    i = 1;
                    for (String key : product.makeProductList(product.productName, product.productComment, product.productPrice).keySet()) {
                        ArrayList value = product.makeProductList(product.productName, product.productComment, product.productPrice).get(key);
                        System.out.println(i++ + ". " + key + "| " + value);
                    }
                    // 햄버거 선택
                    select = sc.nextInt();
                    sc.nextLine();
                    switch (select){
                        case 1:
                            System.out.println("CheeseBurger" + product.productList.get("CheeseBurger"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인     2. 취소");
                            select = sc.nextInt();
                            sc.nextLine();
                            break;

                        case 2:
                            System.out.println("ShrimpBurger" + product.productList.get("ShrimpBurger"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인     2. 취소");
                            select = sc.nextInt();
                            sc.nextLine();
                            break;

                        case 3:
                            System.out.println("BulgogiBurger" + product.productList.get("BulgogiBurger"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인     2. 취소");
                            select = sc.nextInt();
                            sc.nextLine();
                            break;

                        default:
                            System.out.println("잘못 입력하셨습니다.");
                            break;

                    }
                    break;

                case 2:
                    // 음료수 리스트
                    System.out.println("HEE-EUN BURGER에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를  골라 입력해주세요");
                    System.out.println("");

                    System.out.println("[ Drink Menu ]");
                    product.makeProductList("CocaCola", "근본 코카 콜라", 2.0);
                    product.makeProductList("Sprite", "버거에는 시원한 스프라이트", 2.0);
                    product.makeProductList("Water", "0kcal의 물!", 1.0);

                    // 음료수 리스트 출력
                    i = 1;
                    for (String key : product.makeProductList(product.productName, product.productComment, product.productPrice).keySet()) {
                        ArrayList value = product.makeProductList(product.productName, product.productComment, product.productPrice).get(key);
                        System.out.println(i++ + ". " + key + "| " + value);
                    }
                    // 음료 선택
                    select = sc.nextInt();
                    sc.nextLine();
                    switch (select){
                        case 1:
                            System.out.println("CocaCola" + product.productList.get("CocaCola"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인     2. 취소");
                            select = sc.nextInt();
                            sc.nextLine();
                            break;

                        case 2:
                            System.out.println("Sprite" + product.productList.get("Sprite"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인     2. 취소");
                            select = sc.nextInt();
                            sc.nextLine();
                            break;

                        case 3:
                            System.out.println("Water" + product.productList.get("Water"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인     2. 취소");
                            select = sc.nextInt();
                            sc.nextLine();
                            break;

                        default:
                            System.out.println("잘못 입력하셨습니다.");
                            break;

                    }
                    break;


                case 3:
                    //맥주 리스트
                    System.out.println("HEE-EUN BURGER에 오신걸 환영합니다.");
                    System.out.println("아래 상품메뉴판을 보시고 메뉴를  골라 입력해주세요");
                    System.out.println("");

                    System.out.println("[ Beer Menu ]");
                    product.makeProductList("Cass", "카-스", 4.0);
                    product.makeProductList("Terra", "테-라", 5.0);
                    product.makeProductList("Kelly", "캘-리", 6.0);

                    // 맥주 리스트 출력
                    i = 1;
                    for (String key : product.makeProductList(product.productName, product.productComment, product.productPrice).keySet()) {
                        ArrayList value = product.makeProductList(product.productName, product.productComment, product.productPrice).get(key);
                        System.out.println(i++ + ". " + key + "| " + value);
                    }
                    // 맥주 선택
                    select = sc.nextInt();
                    sc.nextLine();
                    switch (select){
                        case 1:
                            System.out.println("Cass" + product.productList.get("Cass"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인     2. 취소");
                            select = sc.nextInt();
                            sc.nextLine();
                            break;

                        case 2:
                            System.out.println("Terra" + product.productList.get("Terra"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인     2. 취소");
                            select = sc.nextInt();
                            sc.nextLine();
                            break;

                        case 3:
                            System.out.println("Kelly" + product.productList.get("Kelly"));
                            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                            System.out.println("1. 확인     2. 취소");
                            select = sc.nextInt();
                            sc.nextLine();
                            break;

                        default:
                            System.out.println("잘못 입력하셨습니다.");
                            break;

                    }
                    break;


                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;
            }


        }

    }
}
