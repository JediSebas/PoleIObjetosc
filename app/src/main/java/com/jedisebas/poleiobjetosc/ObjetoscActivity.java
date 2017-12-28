package com.jedisebas.poleiobjetosc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ObjetoscActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_objetosc);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void click(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.szescianBtn:
                intent = new Intent(ObjetoscActivity.this, SzescianActivity.class);
                startActivity(intent);
                break;
            case R.id.prostopadloscianBtn:
                intent = new Intent(ObjetoscActivity.this, ProstopadloscianActivity.class);
                startActivity(intent);
                break;
            case R.id.graniastoslupBtn:
                intent = new Intent(ObjetoscActivity.this, GraniastoslupActivity.class);
                startActivity(intent);
                break;
        }
    }

}
