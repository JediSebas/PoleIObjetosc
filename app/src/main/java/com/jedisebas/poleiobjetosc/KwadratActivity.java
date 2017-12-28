package com.jedisebas.poleiobjetosc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KwadratActivity extends AppCompatActivity implements View.OnClickListener {
    public Button obliczK;
    public EditText dlugoscaKp;
    public EditText wynikK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kwadrat);

        obliczK = (Button) findViewById(R.id.obliczK);
        obliczK.setOnClickListener(this);
        dlugoscaKp = (EditText) findViewById(R.id.dlugoscaKp);
        wynikK = (EditText) findViewById(R.id.wynikK);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "P = a * a", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        String dlugoscaKs = dlugoscaKp.getText().toString().trim();
        double dlugoscKp = Double.parseDouble(dlugoscaKs);

        double polekwad = dlugoscKp * dlugoscKp;
        String polekwads = String.valueOf(polekwad);
        wynikK.setText(polekwads);
    }
}
