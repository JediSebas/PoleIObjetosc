package com.jedisebas.poleiobjetosc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SzescianActivity extends AppCompatActivity implements View.OnClickListener {
    public Button obliczSz;
    public EditText dlugoscaSzp;
    public EditText wynikSzp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_szescian);

        obliczSz = (Button) findViewById(R.id.obliczSz);
        obliczSz.setOnClickListener(this);
        dlugoscaSzp = (EditText) findViewById(R.id.dlugoscaSzp);
        wynikSzp = (EditText) findViewById(R.id.wynikSzp);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "V = a * a * a", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        String dlugoscaSzs = dlugoscaSzp.getText().toString().trim();
        double dlugoscaSzp = Double.parseDouble(dlugoscaSzs);

        double objetsz = dlugoscaSzp * dlugoscaSzp * dlugoscaSzp;
        String objetszs = String.valueOf(objetsz);

        wynikSzp.setText(objetszs);
    }
}
