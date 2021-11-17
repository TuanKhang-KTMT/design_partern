package com.company;
public class XeFactory {
    public static Xe getXe(String type, String thongTin, String
            cauHinh, String nsx,String tinhNang){
        if("HonDa".equalsIgnoreCase(type)){
            return new Honda(thongTin,cauHinh,nsx,tinhNang);
        }if("Nexus".equalsIgnoreCase(type)){
            return new Nexus(thongTin,cauHinh,nsx,tinhNang);
        }if("Toyota".equalsIgnoreCase(type)){
            return new Toyota(thongTin,cauHinh,nsx,tinhNang);
        }
        return null;
    }
}