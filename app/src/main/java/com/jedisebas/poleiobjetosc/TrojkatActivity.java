package com.jedisebas.poleiobjetosc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TrojkatActivity extends AppCompatActivity implements View.OnClickListener {

    public Button obliczT;
    protected EditText podstawaaTp;
    public EditText wysokoschTp;
    public EditText wynikT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trojkat);

        obliczT = (Button) findViewById(R.id.obliczT);
        obliczT.setOnClickListener(this);
        podstawaaTp = (EditText) findViewById(R.id.podstawaaTp);
        wysokoschTp = (EditText) findViewById(R.id.wysokoschTp);
        wynikT = (EditText) findViewById(R.id.wynikT);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "P = 0,5 * a * h", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


    @Override
    public void onClick(View v) {
        String podstawaaTs = podstawaaTp.getText().toString().trim();
        String wysokoschTs = wysokoschTp.getText().toString().trim();

        double podstawaTp = Double.parseDouble(podstawaaTs);
        double wysokoschTp = Double.parseDouble(wysokoschTs);

        double poletroj = podstawaTp * wysokoschTp / 2;
        String poletrojs = String.valueOf(poletroj);

        wynikT.setText(poletrojs);
    }
}
