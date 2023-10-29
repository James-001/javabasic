package com.java.tips.sheJiMoShi.GC;

/**
 * Created by yto on 2020/12/9.
 */
public class SimpleNoodlesFactory {
    public static final int TYPE_LZ = 1;//兰州拉面
    public static final int TYPE_PM = 2;//泡面
    public static final int TYPE_GK = 3;//干扣面

    int anInta;

    public static INoodles createNoodles(int type) {
        int asdasdas=11111;
        System.out.println(asdasdas);
        switch (type) {
            case TYPE_LZ:
                return new LzNoodles();
            case TYPE_PM:
                return new PaoMiaoNoodles();
            case TYPE_GK:
            default:
                return new LzNoodles();
        }

    }

    public static void main(String[] args) {
        INoodles noodles = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_PM);
        noodles.desc();
        SimpleNoodlesFactory simpleNoodlesFactory = new SimpleNoodlesFactory();
        System.out.println(simpleNoodlesFactory.anInta);
    }
}
