package com.jedisebas.poleiobjetosc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProstokatActivity extends AppCompatActivity implements View.OnClickListener {

    public Button obliczP;
    public EditText dlugoscaPp;
    public EditText szerokoscbPp;
    public EditText wynikP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prostokat);

        obliczP = (Button) findViewById(R.id.obliczP);
        obliczP.setOnClickListener(this);
        dlugoscaPp = (EditText) findViewById(R.id.dlugoscaPp);
        szerokoscbPp = (EditText) findViewById(R.id.szerokoscbPp);
        wynikP = (EditText) findViewById(R.id.wynikP);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "P = a * b", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        String dlugoscaPps = dlugoscaPp.getText().toString().trim();
        String szerokoscPps = szerokoscbPp.getText().toString().trim();
        double dlugoscPp = Double.parseDouble(dlugoscaPps);
        double szerokoscPp = Double.parseDouble(szerokoscPps);

        double poleprostokat = dlugoscPp * szerokoscPp;
        String poleprostokats = String.valueOf(poleprostokat);
        wynikP.setText(poleprostokats);
    }
}
