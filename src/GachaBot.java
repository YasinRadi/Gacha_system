import java.util.Scanner;

public class GachaBot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input your username: ");
        String username = sc.nextLine();
        System.out.println();
        User user = new User(username);
        System.out.println("Welcome " + user.getName() + "!, what do you want to do?");

        int op;
        do {
            menu(user);
            op = sc.nextInt();
            switch(op) {

                case 1:
                    user.wish(1, "Albedo");
                    break;

                case 2:
                    user.wish(10, "Albedo");
                    break;

                case 3:
                    user.showCharacters();
                    break;

                case 4:
                    user.showWeapons();
                    break;

                case 5:
                    System.out.print("How many primogems you want to add? ");
                    int primogems = sc.nextInt();
                    System.out.println();
                    user.addPrimogems(primogems);
                    break;

                default:
                    op = 6;
                    break;

            }
        } while (op != 6);
    }

    public static void menu(User user) {

        System.out.println("You have " + user.getPrimogems() + " primogems.");
        System.out.println("1.- Summon 1 wish.");
        System.out.println("2.- Summon 10 wishes.");
        System.out.println("3.- To see all your characters.");
        System.out.println("4.- To see all your weapons.");
        System.out.println("5.- To add more primogems.");
        System.out.println("6.- To exit.");
    }
}
// javac Main.java
// java Main 