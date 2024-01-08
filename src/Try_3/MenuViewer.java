package Try_3;

import java.util.List;

public class MenuViewer {

    /*
     * 1. 메인 메뉴 화면
     * 2. 상세 메뉴 화면
     * 3. 확인 화면
     * 4. 주문 화면
     * 5. 완료 화면*/

    private Menu menu;
    private Product product;
    private List<Product> burgersList;
    private List<Product> drinksList;
    private List<Product> beersList;

    public MenuViewer() {
        this.menu = new Menu();
        this.product = new Product();
        this.burgersList = product.getBurgersList();
        this.drinksList = product.getDrinksList();
        this.beersList = product.getBeersList();
    }




    public void mainMenu() {
        // 메인 메뉴판
        System.out.println("");
        System.out.println("");
        System.out.println("SHAKEAHCK BURGER에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요");
        System.out.println("");
        System.out.println("");
        System.out.println("[ SHAKESHACK MENU ]");

        List<Menu> menuList = menu.getMenu();
        int i = 1;
        for (Menu menu : menuList) {
            System.out.println(i++ + ". "+ menu.toString());
        }

        System.out.println("");
        System.out.println("[ ORDER MENU ]");
        List<Menu> orderMenuList = menu.getOrderMenu();
        for (Menu menu1 : orderMenuList){
            System.out.println(i++ + ". " + menu1.toString());
        }
//        for (int i = 0; i < menuList.size(); i++){
//            System.out.println(menuList.get(i).toString());

    }

    public void burgersMenu(){
        // 버거 메뉴판
        System.out.println("");
        System.out.println("");
        System.out.println("SHAKEAHCK BURGER에 오신걸 환영합니다.");
        System.out.println("아래 상품 메뉴판을 보시고 메뉴를 골라 입력해주세요");
        System.out.println("");
        System.out.println("");
        System.out.println("[ Burgers MENU ]");

        for (Product burger : burgersList){
            System.out.println(burger.toString());
        }
    }

    public void drinksMenu(){
        // 음료 메뉴판
        System.out.println("");
        System.out.println("");
        System.out.println("SHAKEAHCK BURGER에 오신걸 환영합니다.");
        System.out.println("아래 상품 메뉴판을 보시고 메뉴를 골라 입력해주세요");
        System.out.println("");
        System.out.println("");
        System.out.println("[ Drinks MENU ]");

        List<Product> drinksMenu = product.getDrinksList();
        for (Product drink : drinksMenu){
            System.out.println(drink.toString());
        }
    }

    public void beersMenu(){
        // 맥주 메뉴판
        System.out.println("");
        System.out.println("");
        System.out.println("SHAKEAHCK BURGER에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요");
        System.out.println("");
        System.out.println("");
        System.out.println("[ Beers MENU ]");

        List<Product> beersList = product.getBeersList();
        for (Product beer : beersList){
            System.out.println(beer.toString());
        }
    }

    public void selectBurgerMenu(int select){
        // 버거 선택 화면
        System.out.println("");
        System.out.println("");
        System.out.println(burgersList.get(select));
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.print("1. 확인");
        System.out.print("\t");
        System.out.print("\t");
        System.out.println("2. 취소");
//        order.saveList(burgersList.get(select));
    }

    public void selectDrinkMenu(int select){
        // 음료 선택 화면
        System.out.println("");
        System.out.println("");
        System.out.println(drinksList.get(select));
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.print("1. 확인");
        System.out.print("\t");
        System.out.print("\t");
        System.out.println("2. 취소");
    }

    public void selectBeerMenu(int select){
        // 맥주 선택 화면
        System.out.println("");
        System.out.println("");
        System.out.println(beersList.get(select));
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.print("1. 확인");
        System.out.print("\t");
        System.out.print("\t");
        System.out.println("2. 취소");
    }

        public void orderMenu() {
        // 주문 내역 출력
            System.out.println("");
            System.out.println("");
            System.out.println("[ Order ]");
        }

        public void totalMenu(){
        // 주문 총 금액 출력
            System.out.println("");
            System.out.println("[ Total ]");
        }

        public void selectButton(){
        // 주문 선택 버튼
            System.out.println("");
            System.out.print("1. 주문");
            System.out.print("\t");
            System.out.print("\t");
            System.out.println("2. 메뉴판");
        }


        int wait = 1;
    public void orderComplete (){
        // 주문 완료 화면
        System.out.println("");
        System.out.println("");
        System.out.println("주문이 완료되었습니다!");
        System.out.println("");
        System.out.println("대기번호는 [ "+ wait++ + " ] 번 입니다.");
        System.out.println("3초후 메뉴판으로 돌아갑니다.");
    }

    public void cancelMenu (){
        // 주문 취소 화면
        System.out.println("");
        System.out.println("");
        System.out.println("진행하던 주물을 취소하시겠습니까?");
        System.out.print("1. 확인");
        System.out.print("\t");
        System.out.print("\t");
        System.out.println("2. 취소");
    }

}

