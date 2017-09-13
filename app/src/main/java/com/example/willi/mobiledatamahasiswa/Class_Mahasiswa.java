package com.example.willi.mobiledatamahasiswa;

import java.io.Serializable;

/**
 * Created by willi on 13/09/2017.
 */

public class Class_Mahasiswa implements Serializable{
    private String Nama;
    private String NRP;
    private String UNIV;
    private String Semester;
    private String TTL;
    private String JK;
    private String Hobi;

    public String GetNama() { return Nama;}
    public void SetNama(String Nama) { this.Nama = Nama;}

    public String GetNRP() { return NRP;}
    public void SetNRP(String NRP) { this.NRP = NRP;}

    public String GetUNIV() { return UNIV;}
    public void SetUNIV(String UNIV) { this.UNIV = UNIV;}

    public String GetSemester() { return Semester;}
    public void SetSemester(String Semester) { this.Semester = Semester;}

    public String GetTTL() { return TTL;}
    public void SetTTL(String TTL) { this.TTL = TTL;}

    public String GetJK() { return JK;}
    public void SetJK(String JK) { this.JK = JK;}

    public String GetHobi() { return Hobi;}
    public void SetHobi(String Hobi) { this.Hobi = Hobi;}
}
