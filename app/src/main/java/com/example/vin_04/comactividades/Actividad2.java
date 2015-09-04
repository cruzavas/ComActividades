package com.example.vin_04.comactividades;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Actividad2 extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad2);
        String msn=getIntent().getStringExtra("Mandamensaje");
        Log.d("segunda actividad", msn);
    }
}
