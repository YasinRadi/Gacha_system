import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Banner {

    private static final HashMap<Integer, Set<SummonableEntity>> BANNER_ITEMS = new HashMap<>();

    static {
        for (int i = 3; i <= 5; i++) {
            BANNER_ITEMS.put(i, new HashSet<>());
        }

        // Characters Albedo banner:
        // 5*
        BANNER_ITEMS.get(5).add(new Character("Albedo", StarCategory.FIVE, Element.GEO));
        BANNER_ITEMS.get(5).add(new Character("Keching", StarCategory.FIVE, Element.ELECTRO));
        BANNER_ITEMS.get(5).add(new Character("Mona", StarCategory.FIVE, Element.HYDRO));
        BANNER_ITEMS.get(5).add(new Character("Qiqi", StarCategory.FIVE, Element.CRYO));
        BANNER_ITEMS.get(5).add(new Character("Diluc", StarCategory.FIVE, Element.PYRO));
        BANNER_ITEMS.get(5).add(new Character("Jean", StarCategory.FIVE, Element.ANEMO));
        // 4*
        BANNER_ITEMS.get(4).add(new Character("Sucrose", StarCategory.FOUR, Element.ANEMO));
        BANNER_ITEMS.get(4).add(new Character("Bennett", StarCategory.FOUR, Element.PYRO));
        BANNER_ITEMS.get(4).add(new Character("Fischl", StarCategory.FOUR, Element.ELECTRO));
        BANNER_ITEMS.get(4).add(new Character("Diona", StarCategory.FOUR, Element.CRYO));
        BANNER_ITEMS.get(4).add(new Character("Chongyung", StarCategory.FOUR, Element.CRYO));
        BANNER_ITEMS.get(4).add(new Character("Noelle", StarCategory.FOUR, Element.GEO));
        BANNER_ITEMS.get(4).add(new Character("Ninguang", StarCategory.FOUR, Element.GEO));
        BANNER_ITEMS.get(4).add(new Character("Xingchiu", StarCategory.FOUR, Element.HYDRO));
        BANNER_ITEMS.get(4).add(new Character("Beidou", StarCategory.FOUR, Element.ELECTRO));
        BANNER_ITEMS.get(4).add(new Character("Xiangling", StarCategory.FOUR, Element.PYRO));
        BANNER_ITEMS.get(4).add(new Character("Razor", StarCategory.FOUR, Element.ELECTRO));
        BANNER_ITEMS.get(4).add(new Character("Barbara", StarCategory.FOUR, Element.HYDRO));
        // Weapons Albedo banner:
        // 4*
        BANNER_ITEMS.get(4).add(new Weapon("Rust", StarCategory.FOUR, WeaponType.BOW));
        BANNER_ITEMS.get(4).add(new Weapon("Sacrificial Bow", StarCategory.FOUR, WeaponType.BOW));
        BANNER_ITEMS.get(4).add(new Weapon("Stringless", StarCategory.FOUR, WeaponType.BOW));
        BANNER_ITEMS.get(4).add(new Weapon("Favonius Bow", StarCategory.FOUR, WeaponType.BOW));
        BANNER_ITEMS.get(4).add(new Weapon("Ojo de la Perspicacia", StarCategory.FOUR, WeaponType.CATALYST));
        BANNER_ITEMS.get(4).add(new Weapon("Sacrificial Memories", StarCategory.FOUR, WeaponType.CATALYST));
        BANNER_ITEMS.get(4).add(new Weapon("Sinfonia de los Merodeadores", StarCategory.FOUR, WeaponType.CATALYST));
        BANNER_ITEMS.get(4).add(new Weapon("Codice de Favonius", StarCategory.FOUR, WeaponType.CATALYST));
        BANNER_ITEMS.get(4).add(new Weapon("Favonius Lance", StarCategory.FOUR, WeaponType.POLEARM));
        BANNER_ITEMS.get(4).add(new Weapon("Perdicion del Dragon", StarCategory.FOUR, WeaponType.POLEARM));
        BANNER_ITEMS.get(4).add(new Weapon("Segadora de la lluvia", StarCategory.FOUR, WeaponType.CLAYMORE));
        BANNER_ITEMS.get(4).add(new Weapon("Gran Espada de Sacrificio", StarCategory.FOUR, WeaponType.SWORD));
        BANNER_ITEMS.get(4).add(new Weapon("Espada del tiempo", StarCategory.FOUR, WeaponType.CLAYMORE));
        BANNER_ITEMS.get(4).add(new Weapon("Gran Espada de Favonius", StarCategory.FOUR, WeaponType.SWORD));
        BANNER_ITEMS.get(4).add(new Weapon("Rugido de Leon", StarCategory.FOUR, WeaponType.SWORD));
        BANNER_ITEMS.get(4).add(new Weapon("Sacrificial Sword", StarCategory.FOUR, WeaponType.SWORD));
        BANNER_ITEMS.get(4).add(new Weapon("Flute", StarCategory.FOUR, WeaponType.SWORD));
        BANNER_ITEMS.get(4).add(new Weapon("Favonius Sword", StarCategory.FOUR, WeaponType.SWORD));
        // 3*
        BANNER_ITEMS.get(3).add(new Weapon("Tirachinas", StarCategory.THREE, WeaponType.BOW));
        BANNER_ITEMS.get(3).add(new Weapon("Juramento del Arquero", StarCategory.THREE, WeaponType.BOW));
        BANNER_ITEMS.get(3).add(new Weapon("Arco de Cuervo", StarCategory.THREE, WeaponType.BOW));
        BANNER_ITEMS.get(3).add(new Weapon("Orbe Esmeralda", StarCategory.THREE, WeaponType.CATALYST));
        BANNER_ITEMS.get(3).add(new Weapon("Cuentos de Cazadores de Dragones", StarCategory.THREE, WeaponType.CATALYST));
        BANNER_ITEMS.get(3).add(new Weapon("Guia Magica", StarCategory.THREE, WeaponType.CATALYST));
        BANNER_ITEMS.get(3).add(new Weapon("Borla Negra", StarCategory.THREE, WeaponType.CATALYST));
        BANNER_ITEMS.get(3).add(new Weapon("Garrote del Debate", StarCategory.THREE, WeaponType.CLAYMORE));
        BANNER_ITEMS.get(3).add(new Weapon("Gran Espada Sangrienta", StarCategory.THREE, WeaponType.SWORD));
        BANNER_ITEMS.get(3).add(new Weapon("Sombra Ferrea", StarCategory.THREE, WeaponType.CLAYMORE));
        BANNER_ITEMS.get(3).add(new Weapon("Espada Surcacielos", StarCategory.THREE, WeaponType.SWORD));
        BANNER_ITEMS.get(3).add(new Weapon("Espada del Alba", StarCategory.THREE, WeaponType.SWORD));
        BANNER_ITEMS.get(3).add(new Weapon("Hoja Fria", StarCategory.THREE, WeaponType.SWORD));
    }


    public HashMap<Integer, Set<SummonableEntity>> getItemsBanner(String banner) {
        switch (banner) {
            case "Albedo":
                return BANNER_ITEMS;

            default:
                return null;
        }
    }

    public SummonableEntity wish(User wishingUser) {
        // TODO
        return null;
    }
}
