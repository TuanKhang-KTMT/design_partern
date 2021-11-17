package com.company;

public class Main {
    public static void main(String[] args) {
        Xe Toyota = XeFactory.getXe("toyota","Abc","Toyota","ToyoTa","Tu dong lay");
        Xe nexus = XeFactory.getXe("nexus","Abc","Nexus","Nexus","Bay");
        Xe honda = XeFactory.getXe("honda","NB","Honda","Honda","400km");
        System.out.println("Toyota::"+Toyota);
        System.out.println("Nexus::"+nexus);
        System.out.println("Honda::"+honda);
    }
}
