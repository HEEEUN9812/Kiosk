package Try_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MenuViewer menuViewer = new MenuViewer();
        Product product = new Product();
        Order order = new Order();
        Scanner sc = new Scanner(System.in);

        while (true) {
            // 메인 메뉴판
            menuViewer.mainMenu();
            int select = Integer.parseInt(sc.nextLine());
            if (select == 1) {
                // 버거 메뉴 선택
                menuViewer.burgersMenu();
                select = Integer.parseInt(sc.nextLine());
                // 버거 상품 선택
                menuViewer.selectBurgerMenu(select - 1);
                // 주문 확/취 선택
                select = Integer.parseInt(sc.nextLine());
                if (select == 1) {
                    // 확
                    System.out.println("장바구니에 추가되었습니다.");
                    order.saveList(product.getBurgersList().get(select-1));
                }

            } else if (select == 2) {
                // 음료 메뉴 선택
                menuViewer.drinksMenu();
                select = Integer.parseInt(sc.nextLine());
                // 음료 상품 선택
                menuViewer.selectDrinkMenu(select - 1);
                // 주문 확/취 선택
                select = Integer.parseInt(sc.nextLine());
                if (select == 1) {
                    //확
                    System.out.println("장바구니에 추가되었습니다.");
                    order.saveList(product.getDrinksList().get(select-1));
                }

            } else if (select == 3) {
                // 맥주 메뉴 선택
                menuViewer.beersMenu();
                select = Integer.parseInt(sc.nextLine());
                // 맥주 상품 선택
                menuViewer.selectBeerMenu(select - 1);
                // 주문 확/취 선택
                select = Integer.parseInt(sc.nextLine());
                if (select == 1) {
                    // 확
                    System.out.println("장바구니에 추가되었습니다.");
                    order.saveList(product.getBeersList().get(select-1));
                }

            } else if (select == 4) {
                // 주문 리스트
                menuViewer.orderMenu();
                for(Product savedMenu : order.getSavedList()){
                    System.out.println(savedMenu);
                }
                // 총 금액
                menuViewer.totalMenu();
                order.getSavedList();
                order.getTotalPrice();
                menuViewer.selectButton();
                // 주문 확/취
                select = Integer.parseInt(sc.nextLine());
                if (select == 1){
                    // 확
                    menuViewer.orderComplete();
                    order.clearList();
                    try {
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

            } else if (select == 5) {
                // 주문 취소
                menuViewer.cancelMenu();
                // 취소 확/취
                select = Integer.parseInt(sc.nextLine());
                if(select == 1){
                    // 확
                    order.clearList();
                    System.out.println("진행하던 주문이 취소되었습니다.");
                }

            } else {
                System.out.println("잘못입력하셨습니다");
            }

        }
    }
}
