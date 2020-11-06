package marvel.phase4;

import marvel.phase3.TonyStark;

class PeterParker extends TonyStark {
    private PeterParker() {
        super("Peter Parker");
    }

    public static void main(String[] args) {
        PeterParker peterParker = new PeterParker();

        String giftFromTonyStark = peterParker.getGiftForSpiderMan();

        if (!giftFromTonyStark.equals("")) {
            System.out.println("Peter Parker inherited: " + giftFromTonyStark);
        }
    }
}
