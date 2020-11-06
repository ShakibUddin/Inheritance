package marvel.phase4;

import marvel.phase3.TonyStark;

import java.util.ArrayList;

public class MorganStark extends TonyStark {
    public static void main(String[] args) {
        ArrayList<String> inheritedSuits = new ArrayList<String>();

        MorganStark morganStark = new MorganStark();

        inheritedSuits.addAll(morganStark.getRegularSuits());
        inheritedSuits.addAll(morganStark.getSpecialSuits());

        System.out.println("Morgan Stark's inherited suits are: " + inheritedSuits);
    }
}
