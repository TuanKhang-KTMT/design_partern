package com.company;

public class Honda extends Xe {
    private  String thongTin;
    private  String cauHinh;
    private  String nsx;
    private  String tinhNang;

    public Honda(String thongTin, String cauHinh, String nsx, String tinhNang) {
        this.thongTin = thongTin;
        this.cauHinh = cauHinh;
        this.nsx = nsx;
        this.tinhNang = tinhNang;
    }

    @Override
    public String getThongTin() {
        return thongTin;
    }

    @Override
    public String getCauHinh() {
        return cauHinh;
    }

    @Override
    public String getNsx() {
        return nsx;
    }

    @Override
    public String getTinhNang() {
        return tinhNang;
    }
}