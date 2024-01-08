package Try_1;

public class Main {
    public static void main(String[] args) {

        // Try_1.Menu
        Menu menu = new Menu();

        for (int i = 0; i < menu.showMainMenu().size(); i++) {
            System.out.println(i + 1 + ". " + menu.showMenuName().get(i) + ": " + menu.showMenuComment().get(i));
        }


    }
}

