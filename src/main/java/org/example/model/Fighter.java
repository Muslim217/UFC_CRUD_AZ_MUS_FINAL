package org.example.model;

public class Fighter {
    private int id;
    private String name;
    private String nickname;
    private int age;
    private int weight;
    private int height;
    private int rating;
    private int boxing_attack;
    private int wrestling_attack;
    private int boxing_protection;
    private int wrestling_protection;


    public Fighter(int id,String name, String nickname, int age, int weight, int height, int rating, int boxing_attack,
                   int wrestling_attack, int boxing_protection, int wrestling_protection) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.rating = rating;
        this.boxing_attack = boxing_attack;
        this.wrestling_attack = wrestling_attack;
        this.boxing_protection = boxing_protection;
        this.wrestling_protection = wrestling_protection;
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", rating=" + rating +
                ", boxing_attack=" + boxing_attack +
                ", wrestling_attack=" + wrestling_attack +
                ", boxing_protection=" + boxing_protection +
                ", wrestling_protection=" + wrestling_protection +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getBoxing_attack() {
        return boxing_attack;
    }

    public void setBoxing_attack(int boxing_attack) {
        this.boxing_attack = boxing_attack;
    }

    public int getWrestling_attack() {
        return wrestling_attack;
    }

    public void setWrestling_attack(int wrestling_attack) {
        this.wrestling_attack = wrestling_attack;
    }

    public int getBoxing_protection() {
        return boxing_protection;
    }

    public void setBoxing_protection(int boxing_protection) {
        this.boxing_protection = boxing_protection;
    }

    public int getWrestling_protection() {
        return wrestling_protection;
    }

    public void setWrestling_protection(int wrestling_protection) {
        this.wrestling_protection = wrestling_protection;
    }

}

