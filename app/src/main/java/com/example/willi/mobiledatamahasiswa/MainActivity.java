package com.example.willi.mobiledatamahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import java.util.ArrayList;

import butterknife.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.ETNama)
    EditText ETNama;
    @BindView(R.id.ETNRP)
    EditText ETNRP;
    @BindView(R.id.ETUNIV)
    EditText ETUNIV;
    @BindView(R.id.SPSemester)
    Spinner SPSemester;
    @BindView(R.id.SPTanggal)
    Spinner SPTanggal;
    @BindView(R.id.SPBulan)
    Spinner SPBulan;
    @BindView(R.id.SPTahun)
    Spinner SPTahun;
    @BindView(R.id.RBPria)
    RadioButton RBPria;
    @BindView(R.id.RBWanita)
    RadioButton RBWanita;
    @BindView(R.id.CBMainGame)
    CheckBox CBMainGame;
    @BindView(R.id.CBBelajar)
    CheckBox CBBelajar;
    @BindView(R.id.CBNgoding)
    CheckBox CBNgoding;
    @BindView(R.id.CBOlahraga)
    CheckBox CBOlahraga;
    @BindView(R.id.CBTidur)
    CheckBox CBTidur;
    @BindView(R.id.CBMemasak)
    CheckBox CBMemasak;
    @BindView(R.id.CBFotografi)
    CheckBox CBFotografi;
    @BindView(R.id.CBMemancing)
    CheckBox CBMemancing;
    @BindView(R.id.CBLain)
    CheckBox CBLain;

    MainActivity mainActivity;
    ArrayAdapter<String> adapterTanggal;
    ArrayAdapter<String> adapterBulan;
    ArrayAdapter<String> adapterTahun;//adapter spinner
    String JK = "";
    String Hobi = ""; //deklarasi variable global
    Class_Mahasiswa Mahasiswa = new Class_Mahasiswa();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
