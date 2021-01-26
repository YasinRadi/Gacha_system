import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class User {

    private String name;
    private int primogems;
    private int pitty;
    private Set<Character> characters;
    private List<Weapon> weapons;
    private List<Accessory> accessories;

    public User() {
        new User("Player1");
    }

    public User(String name) {
        this.setName(name);
        this.primogems = 1600;
        this.pitty = 0;
        this.characters = new HashSet<>();
        this.weapons = new ArrayList<>();
        this.accessories = new ArrayList<>();
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

    public void setPrimogems(int primogems) {
        if (primogems >= 0) {
            this.primogems = primogems;
        }
    }

    public Set<Character> getCharacters() {
        return this.characters;
    }

    public void setCharacters(Set<Character> characters) {
        this.characters = characters;
    }

    public List<Weapon> getWeapons() {
        return this.weapons;
    }

    public void setWeapons(List<Weapon> weapons) {
        this.weapons = weapons;
    }

    public List<Accessory> getAccessories() {
        return this.accessories;
    }

    public void setAccessories(List<Accessory> accessories) {
        this.accessories = accessories;
    }

    public void showCharacters() {       
        String charString = this.characters
            .stream()
            .map(Character::toString)
            .collect(Collectors.joining("\n"));
        
        System.out.println(charString);
    }

    public void showWeapons() {
        String weaponString = this.weapons
            .stream()
            .map(Weapon::toString)
            .collect(Collectors.joining("\n"));
        
        System.out.println(weaponString);
    }

    public void showAccessories() {
        String accessoryString = this.accessories
            .stream()
            .map(Accessory::toString)
            .collect(Collectors.joining("\n"));
        
        System.out.println(accessoryString);
    }

    // private ArrayList<Item> wishes(int num_wishes, String version) {
    //     this.primogems -= 160 * num_wishes;
    //     ArrayList<Item> items = new ArrayList<>();
    //     HashMap<Item, Float> banner = Banner.getItemsBanner(version);
    //     ArrayList<Item> items_banner = new ArrayList<>();
    //     items_banner.addAll(banner.keySet());
    //     boolean picked = false;
    //     Random rnd = new Random();
    //     boolean five_stars;
    //     for (int i = 0; i < num_wishes; i++) {
    //         do {
    //             pitty++;
    //             Item item = null;
    //             do {
    //                 if (item == null) {
    //                     float prob_five = 0.4f + pitty/150.0f;
    //                     double prob = Math.random() - prob_five;
    //                     int random_item = rnd.nextInt(items_banner.size());
    //                     item = items_banner.get(random_item);
    //                     if (prob <= 0 && item.getNumStars() != 5) {
    //                         five_stars = true;
    //                     } else {
    //                         five_stars = false;
    //                     }
    //                 } else {
    //                     item = items_banner.get(random_item);
    //                 }


    //             } while (!five_stars);
    //             float prob_item = banner.get(item);
    //             double prob_having_it = 1.0 - Math.pow(1.0 - prob_item, pitty);
    //             if (item instanceof Character && item.stars.equals(Stars.FIVE)) {
    //                 prob_having_it += pitty/150.0;
    //                 five_stars = true;
    //             } else {
    //                 five_stars = false;
    //                 prob_having_it -= pitty/150.0;
    //             }
    //             double pick = prob_having_it - prob_item;
    //             if (pick <= 0) {
    //                 if (five_stars) {
    //                     this.pitty = 0;
    //                 }
    //                 picked = true;
    //                 items.add(item);
    //             }
    //         } while (!picked);
    //         picked = false;
    //     }
    //     return items;
    // }
}
