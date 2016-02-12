package com.example.jacek.jakinapiwek;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity  {
    Button oblicz;
    Button plusjeden;
    EditText ileosob;
    EditText zaplata;
    int iloscOsob=0;
    String iloscOsobString="1";
    int ileOsobFinal=0;
    double doZaplaty=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        oblicz=(Button)findViewById(R.id.oblicz);
        plusjeden=(Button)findViewById(R.id.plusjednbutton);
        ileosob=(EditText)findViewById(R.id.ileosob);
        zaplata=(EditText)findViewById(R.id.zaplata);

        //plusjeden.setOnClickListener(this);

        View.OnClickListener obliczenia =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ileOsobString=ileosob.getText().toString();
                if(TextUtils.isEmpty(ileOsobString)) {
                    ileosob.setError("Podaj liczbę osób");
                    return;
                }
                Log.d("aa","null");
                // int ileOsobFinal=Integer.parseInt(ileosob.getText().toString());
               // String cena=zaplata.getText().toString();
                //double kwota=Double.parseDouble(zaplata.getText().toString());
                //doZaplaty=kwota+(kwota*0.1);
               // String ile=Double.toString(doZaplaty);
              Log.d("aa","11");
            }
        };
        oblicz.setOnClickListener(obliczenia);
        View.OnClickListener dodaj = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                iloscOsob+=1;
                iloscOsobString=Integer.toString(iloscOsob);
                ileosob.setText(iloscOsobString);
                ileosob.setError(null);
            }
        };
        plusjeden.setOnClickListener(dodaj);




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
