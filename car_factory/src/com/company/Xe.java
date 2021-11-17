package com.company;

public abstract class Xe {
    public abstract String getThongTin();
    public abstract String getCauHinh();
    public abstract String getNsx();
    public abstract String getTinhNang();
    @Override
    public String toString(){
        return "Thong Tin= "+this.getThongTin()+", Cau Hinh="+this.getCauHinh()+", Nha San Xuat="+this.getNsx()+", Tinh Nang= "+this.getTinhNang();
    }
}