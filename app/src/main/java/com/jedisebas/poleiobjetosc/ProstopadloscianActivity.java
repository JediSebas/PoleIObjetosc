package com.jedisebas.poleiobjetosc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProstopadloscianActivity extends AppCompatActivity implements View.OnClickListener {
    public Button obliczPros;
    public EditText dlugoscaProsp;
    public EditText szerokoscbProsp;
    public EditText wysokosccProsp;
    public EditText wynikProsp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prostopadloscian);

        obliczPros = (Button) findViewById(R.id.obliczPros);
        obliczPros.setOnClickListener(this);
        dlugoscaProsp = (EditText) findViewById(R.id.dlugoscaProsp);
        szerokoscbProsp = (EditText) findViewById(R.id.szerokoscbProsp);
        wysokosccProsp = (EditText) findViewById(R.id.wysokosccProsp);
        wynikProsp = (EditText) findViewById(R.id.wynikProsp);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "V = a * b * c", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        String dlugoscaPross = dlugoscaProsp.getText().toString().trim();
        String szerokoscbPross = szerokoscbProsp.getText().toString().trim();
        String wysokosccPross = wysokosccProsp.getText().toString().trim();
        double wysokosccProsp = Double.parseDouble(wysokosccPross);
        double szerokoscbProsp = Double.parseDouble(szerokoscbPross);
        double dlugoscaProsp = Double.parseDouble(dlugoscaPross);

        double objeprost = dlugoscaProsp * szerokoscbProsp * wysokosccProsp;
        String objeprosts = String.valueOf(objeprost);
        wynikProsp.setText(objeprosts);
    }
}
