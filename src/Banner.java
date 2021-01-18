import java.util.ArrayList;
import java.util.HashMap;

public class Banner {

    private static HashMap<Item, Float> items_albedo_banner = new HashMap<>();

    static {
        // Characters Albedo banner:
        // 5*
        Banner.items_albedo_banner.put(new Character(Stars.FIVE, "Albedo", Element.GEO), 0.06f);
        Banner.items_albedo_banner.put(new Character(Stars.FIVE, "Keching", Element.ELECTRO), 0.006f);
        Banner.items_albedo_banner.put(new Character(Stars.FIVE, "Mona", Element.HYDRO), 0.006f);
        Banner.items_albedo_banner.put(new Character(Stars.FIVE, "Qiqi", Element.CRYO), 0.006f);
        Banner.items_albedo_banner.put(new Character(Stars.FIVE, "Diluc", Element.PYRO), 0.006f);
        Banner.items_albedo_banner.put(new Character(Stars.FIVE, "Jean", Element.ANEMO), 0.006f);
        // 4*
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Sucrose", Element.ANEMO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Bennett", Element.PYRO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Fischl", Element.ELECTRO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Diona", Element.CRYO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Chongyung", Element.CRYO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Noelle", Element.GEO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Ninguang", Element.GEO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Xingchiu", Element.HYDRO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Beidou", Element.ELECTRO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Xiangling", Element.PYRO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Razor", Element.ELECTRO), 0.051f);
        Banner.items_albedo_banner.put(new Character(Stars.FOUR, "Barbara", Element.HYDRO), 0.051f);
        // Weapons Albedo banner:
        // 4*
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Rust", WeaponType.BOWS), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Sacrificial Bow", WeaponType.BOWS), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Stringless", WeaponType.BOWS), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Favonius Bow", WeaponType.BOWS), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Ojo de la Perspicacia", WeaponType.CATALYST), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Sacrificial Memories", WeaponType.CATALYST), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Sinfonia de los Merodeadores", WeaponType.CATALYST), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Codice de Favonius", WeaponType.CATALYST), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Favonius Lance", WeaponType.POLEARM), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Perdicion del Dragon", WeaponType.POLEARM), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Segadora de la lluvia", WeaponType.CLAYMORE), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Gran Espada de Sacrificio", WeaponType.SWORD), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Espada del tiempo", WeaponType.CLAYMORE), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Gran Espada de Favonius", WeaponType.SWORD), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Rugido de Leon", WeaponType.SWORD), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Sacrificial Sword", WeaponType.SWORD), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Flute", WeaponType.SWORD), 0.051f);
        Banner.items_albedo_banner.put(new Weapon(Stars.FOUR, "Favonius Sword", WeaponType.SWORD), 0.051f);
        // 3*
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Tirachinas", WeaponType.BOWS), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Juramento del Arquero", WeaponType.BOWS), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Arco de Cuervo", WeaponType.BOWS), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Orbe Esmeralda", WeaponType.CATALYST), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Cuentos de Cazadores de Dragones", WeaponType.CATALYST), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Guia Magica", WeaponType.CATALYST), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Borla Negra", WeaponType.CATALYST), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Garrote del Debate", WeaponType.CLAYMORE), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Gran Espada Sangrienta", WeaponType.SWORD), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Sombra Ferrea", WeaponType.CLAYMORE), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Espada Surcacielos", WeaponType.SWORD), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Espada del Alba", WeaponType.SWORD), 0.943f);
        Banner.items_albedo_banner.put(new Weapon(Stars.THREE, "Hoja Fria", WeaponType.SWORD), 0.943f);
    }


    public static HashMap<Item, Float> getItemsBanner(String banner) {
        switch (banner) {
            case "Albedo":
                return Banner.items_albedo_banner;

            default:
                return null;
        }
    }
}
