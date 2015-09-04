package com.example.vin_04.comactividades;

import android.content.ContentResolver;
import android.content.Intent;
import android.database.Cursor;
import android.provider.Contacts;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent ibm = new Intent(this,Actividad2.class);
        ibm.putExtra("Mandamensaje","Hola");
        startActivity(ibm);
        Accesa();
    }

    public void Accesa(){
        ContentResolver Agenda = getContentResolver();
        Cursor micur = Agenda.query(Contacts.People.CONTENT_URI,null,null,null,null);
        if(micur.getCount()>0){
            while(micur.moveToNext()){
                String id = micur.getString(micur.getColumnIndex(Contacts.People._ID));
                String name = micur.getString(micur.getColumnIndex(Contacts.People.NAME));
            }
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
