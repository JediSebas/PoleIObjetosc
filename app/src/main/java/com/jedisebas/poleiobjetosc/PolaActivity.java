package com.jedisebas.poleiobjetosc;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PolaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pola);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }
    public void click(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.trojkatBtn:
                intent = new Intent(PolaActivity.this, TrojkatActivity.class);
                startActivity(intent);
                break;
            case R.id.kwadratBtn:
                intent = new Intent(PolaActivity.this, KwadratActivity.class);
                startActivity(intent);
                break;
            case R.id.prostokatBtn:
                intent = new Intent(PolaActivity.this, ProstokatActivity.class);
                startActivity(intent);
                break;
            case R.id.rombBtn:
                intent = new Intent(PolaActivity.this, RombActivity.class);
                startActivity(intent);
                break;
            case R.id.rownoleglobokBtn:
                intent = new Intent(PolaActivity.this, RownoleglobokActivity.class);
                startActivity(intent);
                break;
            case R.id.trapezBtn:
                intent = new Intent(PolaActivity.this, TrapezActivity.class);
                startActivity(intent);
                break;
        }
    }

}
