/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lits;

/**
 *
 * @author hoang
 */
public class DiemSV {
    private String maSV;
    private String hoTen;
    private double diemLab;
    private double diemASM;
    private double diemQuiz;
    private double diemTB;

    public DiemSV() {
    }

    public DiemSV(String maSV, String hoTen, double diemLab, double diemASM, double diemQuiz, double diemTB) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diemLab = diemLab;
        this.diemASM = diemASM;
        this.diemQuiz = diemQuiz;
        this.diemTB = diemTB;
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

    public double getDiemLab() {
        return diemLab;
    }

    public void setDiemLab(double diemLab) {
        this.diemLab = diemLab;
    }

    public double getDiemASM() {
        return diemASM;
    }

    public void setDiemASM(double diemASM) {
        this.diemASM = diemASM;
    }

    public double getDiemQuiz() {
        return diemQuiz;
    }

    public void setDiemQuiz(double diemQuiz) {
        this.diemQuiz = diemQuiz;
    }

    public double getDiemTB() {
        return (diemLab + diemASM + diemQuiz)/3;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
    
    

}
