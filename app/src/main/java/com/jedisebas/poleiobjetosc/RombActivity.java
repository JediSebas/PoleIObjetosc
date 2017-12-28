package com.jedisebas.poleiobjetosc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RombActivity extends AppCompatActivity implements View.OnClickListener {
    public Button obliczR;
    public EditText przekatnad1Rp;
    public EditText przekatnad2Rp;
    public EditText wynikRp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_romb);

        obliczR = (Button) findViewById(R.id.obliczR);
        obliczR.setOnClickListener(this);
        przekatnad1Rp = (EditText) findViewById(R.id.przekatnad1Rp);
        przekatnad2Rp = (EditText) findViewById(R.id.przekatnad2Rp);
        wynikRp = (EditText)  findViewById(R.id.wynikRp);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "P = 0,5 * d1 * d2", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        String przekatnad1Rs = przekatnad1Rp.getText().toString().trim();
        String przekatnad2Rs = przekatnad2Rp.getText().toString().trim();

        double przekatnad1Rp = Double.parseDouble(przekatnad1Rs);
        double przekatnad2Rp = Double.parseDouble(przekatnad2Rs);

        double poleromb = przekatnad1Rp * przekatnad2Rp / 2;
        String polerombs = String.valueOf(poleromb);

        wynikRp.setText(polerombs);
    }
}
