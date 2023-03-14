package eus.ehu.customcell.domain;

public class Pokemon {
    String name;
    String ability;
    String picture;

    public Pokemon(String name, String ability, String picture) {
        this.name = name;
        this.ability = ability;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public String getAbility() {
        return ability;
    }

    public String getPicture() {
        return picture;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", ability='" + ability + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }
}
