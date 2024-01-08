package Try_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MenuViewer menuViewer = new MenuViewer();
        Product product = new Product();
        Order order = new Order();
        Scanner sc = new Scanner(System.in);

        while (true) {
            menuViewer.mainMenu();
            int select = Integer.parseInt(sc.nextLine());
            if (select == 1) {
                menuViewer.burgersMenu();
                select = Integer.parseInt(sc.nextLine());
                menuViewer.selectBurgerMenu(select - 1);
                order.saveList(product.getBurgersList().get(select-1));
                select = Integer.parseInt(sc.nextLine());
                if (select == 2) {
                    order.deleteList();
                } else if (select == 1) {
                    System.out.println("장바구니에 추가되었습니다.");
                }

            } else if (select == 2) {
                menuViewer.drinksMenu();
                select = Integer.parseInt(sc.nextLine());
                menuViewer.selectDrinkMenu(select - 1);
                order.saveList(product.getDrinksList().get(select-1));
                select = Integer.parseInt(sc.nextLine());
                if (select == 2) {
                    order.deleteList();
                } else if (select == 1) {
                    System.out.println("장바구니에 추가되었습니다.");
                }

            } else if (select == 3) {
                menuViewer.beersMenu();
                select = Integer.parseInt(sc.nextLine());
                menuViewer.selectBeerMenu(select - 1);
                order.saveList(product.getBeersList().get(select-1));
                select = Integer.parseInt(sc.nextLine());
                if (select == 2) {
                    order.deleteList();
                } else if (select == 1) {
                    System.out.println("장바구니에 추가되었습니다.");
                }

            } else if (select == 4) {
                menuViewer.orderMenu();
                for(Product savedMenu : order.getSavedList()){
                    System.out.println(savedMenu);
                }
                menuViewer.totalMenu();
                order.getSavedList();
                order.getTotalPrice();
                menuViewer.selectButton();
                select = Integer.parseInt(sc.nextLine());
                if (select == 1){
                    menuViewer.orderComplete();
                    order.clearList();
                    try {
                        Thread.sleep(3000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }

            } else if (select == 5) {
                menuViewer.cancelMenu();
                select = Integer.parseInt(sc.nextLine());
                if(select == 1){
                    order.clearList();
                    System.out.println("진행하던 주문이 취소되었습니다.");
                }

            } else {
                System.out.println("잘못입력하셨습니다");
            }

        }
    }
}
