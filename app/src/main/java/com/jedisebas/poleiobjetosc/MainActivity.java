package com.jedisebas.poleiobjetosc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click(View view) {
        Intent intent;
        switch (view.getId())
        {
            case R.id.polaBtn:
                intent = new Intent(MainActivity.this, PolaActivity.class);
                startActivity(intent);
            break;
            case R.id.objetoscBtn:
                intent = new Intent(MainActivity.this, ObjetoscActivity.class);
                startActivity(intent);
                break;
            //case R.id.fizykaBtn:
                //intent = new Intent(MainActivity.this, )
        }
    }
}
