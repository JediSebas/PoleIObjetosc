package com.jedisebas.poleiobjetosc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TrapezActivity extends AppCompatActivity implements View.OnClickListener {
    public Button obliczTra;
    public EditText podstawaaTrap;
    public EditText podstawabTrap;
    public EditText wysokoschTrap;
    public EditText wynikTrap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trapez);

        obliczTra = (Button) findViewById(R.id.obliczTra);
        obliczTra.setOnClickListener(this);
        podstawaaTrap = (EditText) findViewById(R.id.podstawaaTrap);
        podstawabTrap = (EditText) findViewById(R.id.podstawabTrap);
        wysokoschTrap = (EditText) findViewById(R.id.wysokoschTrap);
        wynikTrap = (EditText) findViewById(R.id.wynikTrap);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "P = 0,5 * (a + b) * h", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        String podstawaaTras = podstawaaTrap.getText().toString().trim();
        String podstawabTras = podstawabTrap.getText().toString().trim();
        String wysokoschTras = wysokoschTrap.getText().toString().trim();

        double podstawaaTrap = Double.parseDouble(podstawaaTras);
        double podstawabTrap = Double.parseDouble(podstawabTras);
        double wysokoschTrap = Double.parseDouble(wysokoschTras);

        double podst = podstawaaTrap + podstawabTrap;
        double poletrap = podst * wysokoschTrap / 2;
        String poletras = String.valueOf(poletrap);
        wynikTrap.setText(poletras);
    }
}
