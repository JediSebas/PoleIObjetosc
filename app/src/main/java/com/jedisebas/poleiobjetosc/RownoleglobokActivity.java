package com.jedisebas.poleiobjetosc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RownoleglobokActivity extends AppCompatActivity implements View.OnClickListener {
    public Button obliczRow;
    public EditText podstawaaRowp;
    public EditText wysokoschRowp;
    public EditText wynikRowp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rownoleglobok);

        obliczRow = (Button) findViewById(R.id.obliczRow);
        obliczRow.setOnClickListener(this);
        podstawaaRowp = (EditText) findViewById(R.id.podstawaaRowp);
        wysokoschRowp = (EditText) findViewById(R.id.wysokoschRowp);
        wynikRowp = (EditText) findViewById(R.id.wynikRowp);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "P = a * h", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        String podstawaaRows = podstawaaRowp.getText().toString().trim();
        String wysokoschRows = wysokoschRowp.getText().toString().trim();

        double podstawaaRowp = Double.parseDouble(podstawaaRows);
        double wysokoschRowp = Double.parseDouble(wysokoschRows);
        double polerown = podstawaaRowp * wysokoschRowp;
        String polerowns = String.valueOf(polerown);
        wynikRowp.setText(polerowns);
    }
}
