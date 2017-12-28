package com.jedisebas.poleiobjetosc;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GraniastoslupActivity extends AppCompatActivity implements View.OnClickListener {
    public Button obliczGran;
    public EditText polepodstawyGranp;
    public EditText wysokoscHGranp;
    public EditText wynikGranp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graniastoslup);

        obliczGran = (Button) findViewById(R.id.obliczGran);
        obliczGran.setOnClickListener(this);
        polepodstawyGranp = (EditText) findViewById(R.id.polepodstawyGranp);
        wysokoscHGranp = (EditText) findViewById(R.id.wysokoscHGranp);
        wynikGranp = (EditText) findViewById(R.id.wynikGranp);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "V = Pp * H", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public void onClick(View v) {
        String polepodstawyGrans = polepodstawyGranp.getText().toString().trim();
        String wysokoscHGrans = wysokoscHGranp.getText().toString().trim();
        double polepodstawyGranp = Double.parseDouble(polepodstawyGrans);
        double wysokoscHGranp = Double.parseDouble(wysokoscHGrans);

        double objegran = polepodstawyGranp * wysokoscHGranp;
        String objegrans = String.valueOf(objegran);

        wynikGranp.setText(objegrans);
    }
}
