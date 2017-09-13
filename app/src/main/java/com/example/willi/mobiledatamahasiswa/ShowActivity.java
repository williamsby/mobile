package com.example.willi.mobiledatamahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;

public class ShowActivity extends AppCompatActivity {

    @BindView(R.id.TVShow)
    TextView TVShow;
    private MainActivity MainActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
    }
}
