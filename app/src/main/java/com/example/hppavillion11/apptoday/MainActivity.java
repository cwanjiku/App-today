package com.example.hppavillion11.apptoday;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Send an email", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent x = new Intent(MainActivity.this, complains.class); //to open a new page
                startActivity(x);


            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
     String title = item.getTitle().toString();
     if(title.equalsIgnoreCase("share"))
     {
         Toast.makeText(this, "share",Toast.LENGTH_SHORT).show();
     }

     else if (title.equalsIgnoreCase("shop"))
        {
            Toast.makeText(this, "shop",Toast.LENGTH_SHORT).show();
        }

     else
     {
         Toast.makeText(this, "services",Toast.LENGTH_SHORT).show();
     }

        return super.onOptionsItemSelected(item);
    }
}
