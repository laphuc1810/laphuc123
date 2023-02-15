/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lits;

import javax.swing.ImageIcon;

/**
 *
 * @author hoang
 */
public class Students {
    private String maSV;
    private String hoTen;
    private String email;
    private String soDT;
    private String lop;
    private String gioiTinh;
    private String diaChi;
    private ImageIcon img;

    public Students() {
    }

    public Students(String maSV, String hoTen, String email, String soDT, String lop, String gioiTinh, String diaChi, ImageIcon img) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.email = email;
        this.soDT = soDT;
        this.lop = lop;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.img = img;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public ImageIcon getImg() {
        return img;
    }

    public void setImg(ImageIcon img) {
        this.img = img;
    }
    
    
    
}
