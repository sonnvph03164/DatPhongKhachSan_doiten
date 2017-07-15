package com.example.thieppc.datphongkhachsan;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;
import android.content.Intent;

import static android.support.design.R.styleable.View;


public class ViewpageAdapter extends Activity {
    Button button;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.searchview);
        Button btnOpen=(Button)
                findViewById(R.id.timkiem);
        btnOpen.setOnClickListener(new View.OnClickListener()
            {
                  public void onClick(View arg0) {
                      opentimkiem();
                        }
              });
    }
    public void opentimkiem()
    {
        Intent myIntent=new Intent(this, Searchhotel.class);
        startActivity(myIntent);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_activity_home, menu);
        return true;
    }

}
