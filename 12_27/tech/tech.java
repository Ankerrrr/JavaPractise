class device{
    String brand;
    int size;
    int price;

    void powerOn(){
        System.out.println("DEVICE PowerOn");
    }
    void powerOff(){
        System.out.println("DEVICE PowerOff");
    }
}

class laptop extends device{
    boolean touchScreen;
    int refreshRate;

    laptop(String b, int s, int p, boolean ts, int rr){
        brand = b;
        size = s;
        p = price;
        touchScreen = ts;
        refreshRate = rr;
    }
}

class smartPhone extends device{
    int baterySize;
    boolean fiveG;

    smartPhone(String b, int s, int p, int bs, boolean fg){
        brand = b;
        size = s;
        p = price;
        baterySize = bs;
        fiveG = fg;
    }
}

class tech{
    public static void main(String argc[]){
        laptop lp1 = new laptop("Asus", 512, 24000, false, 144);
        laptop lp2 = new laptop("apple", 1024, 40000, true, 60);
        lp1.powerOn();
        lp2.powerOn();

        smartPhone ph1 = new smartPhone("Samsung", 128, 20000, 4800, true);
        smartPhone ph2 = new smartPhone("xaomi", 64, 5000, 2400, false);
        ph1.powerOn();
        ph2.powerOn();

        lp1.powerOff();
        lp2.powerOff();
        ph1.powerOff();
        ph2.powerOff();
    }
}