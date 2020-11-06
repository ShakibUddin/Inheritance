package marvel.phase3;

import java.util.ArrayList;

public class TonyStark {
    private ArrayList<String> regularSuits = new ArrayList<String>();
    private ArrayList<String> specialSuits = new ArrayList<String>();
    private String giftForSpiderMan;

    protected ArrayList<String> getRegularSuits() {
        return regularSuits;
    }

    protected ArrayList<String> getSpecialSuits() {
        return specialSuits;
    }

    protected String getGiftForSpiderMan() {
        return giftForSpiderMan;
    }

    public TonyStark() {
        regularSuits.add("Mark 1");
        regularSuits.add("Mark 2");

        specialSuits.add("Hulk Buster");
        specialSuits.add("Thor Buster");
    }

    public TonyStark(String code) {
        if (code.equals("Peter Parker")) {
            giftForSpiderMan = "EDITH";
            System.out.println("Hello Peter");
        } else {
            giftForSpiderMan = "";
            System.out.println("Unknown user ! Nick Fury wants to know your location !!!");
        }
    }
}
