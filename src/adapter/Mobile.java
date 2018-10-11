package adapter;

public class Mobile {

    public void inputPower(V5Power power){

        int provideV5power = power.provideV5Power();
        System.out.println("手机(客户端)：我需要5v电压充电，现在是--->" + provideV5power + "V");
    }

}
