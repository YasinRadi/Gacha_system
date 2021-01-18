import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class User {

    private String name;
    private int primogems;
    private int pitty;
    private ArrayList<Character> characters;
    private ArrayList<Weapon> weapons;

    public User() {
        this.setName("Player1");
        this.primogems = 1600;
        this.pitty = 0;
        this.characters = new ArrayList<Character>();
        this.weapons = new ArrayList<Weapon>();
    }

    public User(String name) {
        this.setName(name);
        this.primogems = 1600;
        this.pitty = 0;
        this.characters = new ArrayList<Character>();
        this.weapons = new ArrayList<Weapon>();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrimogems() {
        return this.primogems;
    }

    public void addPrimogems(int primogems) {
        this.primogems += primogems;
    }

    public void showCharacters() {
        int size = characters.size();
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(characters.get(i));
        }
        System.out.println();
    }

    public void showWeapons() {
        int size = weapons.size();
        System.out.println();
        for (int i = 0; i < size; i++) {
            System.out.println(weapons.get(i));
        }
        System.out.println();
    }

    public void wish(int num_wishes, String banner) {
        if (this.primogems < 160) {
            System.out.println("You don't have primogems!");
        } else if (1 < num_wishes && this.primogems < 1600) {
            System.out.println("You don't have enough primogems!");
            System.out.println("You can only single pull!");
        } else {
            ArrayList<Item> wishes = wishes(num_wishes, banner);
            addCharactersAndWeapons(wishes);
        }
    }

    public void addCharactersAndWeapons(ArrayList<Item> items) {
        int size = items.size();
        System.out.println();
        for (int i = 0; i < size; i++) {
            Item item = items.get(i);
            if (item instanceof  Character) {
                this.characters.add((Character) item);
            } else {
                this.weapons.add((Weapon) item);
            }
            System.out.println(items.get(i));
        }
        System.out.println();
    }

    private ArrayList<Item> wishes(int num_wishes, String version) {
        this.primogems -= 160 * num_wishes;
        ArrayList<Item> items = new ArrayList<>();
        HashMap<Item, Float> banner = Banner.getItemsBanner(version);
        ArrayList<Item> items_banner = new ArrayList<>();
        items_banner.addAll(banner.keySet());
        boolean picked = false;
        Random rnd = new Random();
        boolean five_stars;
        for (int i = 0; i < num_wishes; i++) {
            do {
                pitty++;
                Item item = null;
                do {
                    if (item == null) {
                        float prob_five = 0.4f + pitty/150.0f;
                        double prob = Math.random() - prob_five;
                        int random_item = rnd.nextInt(items_banner.size());
                        item = items_banner.get(random_item);
                        if (prob <= 0 && item.getNumStars() != 5) {
                            five_stars = true;
                        } else {
                            five_stars = false;
                        }
                    } else {
                        item = items_banner.get(random_item);
                    }


                } while (!five_stars);
                float prob_item = banner.get(item);
                double prob_having_it = 1.0 - Math.pow(1.0 - prob_item, pitty);
                if (item instanceof Character && item.stars.equals(Stars.FIVE)) {
                    prob_having_it += pitty/150.0;
                    five_stars = true;
                } else {
                    five_stars = false;
                    prob_having_it -= pitty/150.0;
                }
                double pick = prob_having_it - prob_item;
                if (pick <= 0) {
                    if (five_stars) {
                        this.pitty = 0;
                    }
                    picked = true;
                    items.add(item);
                }
            } while (!picked);
            picked = false;
        }
        return items;
    }
}
