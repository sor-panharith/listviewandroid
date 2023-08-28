package com.panharithcoding.worldcup;

public class CountryModel {
    private String country_name, worldCup_win;
    private int flag_img;

    public CountryModel(String country_name, String worldCup_win, int flag_img) {
        this.country_name = country_name;
        this.worldCup_win = worldCup_win;
        this.flag_img = flag_img;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getWorldCup_win() {
        return worldCup_win;
    }

    public void setWorldCup_win(String worldCup_win) {
        this.worldCup_win = worldCup_win;
    }

    public int getFlag_img() {
        return flag_img;
    }

    public void setFlag_img(int flag_img) {
        this.flag_img = flag_img;
    }
}
