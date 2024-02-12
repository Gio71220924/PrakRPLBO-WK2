package com.rplbo.app2;

public class Lampu {
    private String warna;

    public  void  gantiWarna(String warnabaru){
        warna = warnabaru;
    }

    public String warnasekarang(){
        return warna;
    }


    public void nyala(){
        System.out.println("Lampu Menyala");
    }

    public void mati(){
        System.out.println("Lampu mati");
    }
}

