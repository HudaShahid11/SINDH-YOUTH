package com.sindh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
ImageButton ssdp,kewo, hands,stc,voy,lrf,services;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ssdp=findViewById(R.id.ssdp);
        kewo=findViewById(R.id.kewo);
        hands=findViewById(R.id.hands);

        voy=findViewById(R.id.voy);
        lrf=findViewById(R.id.lrf);
        services=findViewById(R.id.services);

        ssdp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),ssdp.class);
                startActivity(intent);
            }
        });
        kewo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),kewo.class);
                startActivity(intent);
            }
        });
        hands.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),hands.class);
                startActivity(intent);
            }
        });

        voy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),voy.class);
                startActivity(intent);
            }
        });
        lrf.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),lrf.class);
                startActivity(intent);
            }
        });
        services.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kewo.org.pk/ypep/advocate1.html"));
                startActivity(intent);
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_example, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent i ;
        switch (item.getItemId()) {



            case R.id.mission:
                i = new Intent(getBaseContext(),mission.class);
                startActivity(i);
                return true;
            case R.id.policy:
                i = new Intent(getBaseContext(),activity.class);
                startActivity(i);
                return true;
            case R.id.internship:
                i = new Intent(getBaseContext(),internship.class);
                startActivity(i);
                return true;
            case R.id.membership:
                i = new Intent(getBaseContext(),membership.class);
                startActivity(i);
                return true;
            case R.id.online:
                i = new Intent(getBaseContext(),online_course.class);
                startActivity(i);
                return true;
            case R.id.location:
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://maps.app.goo.gl/FtW65LtYeetnGnNA6"));
                startActivity(i);
                return true;
            case R.id.home:
                i = new Intent(getBaseContext(),message.class);
                startActivity(i);
                return true;
            case R.id.kewo:
                i =new Intent(getBaseContext(),kewo.class);
                startActivity(i);
                return true;
            case R.id.ssdp:
                i =new Intent(getBaseContext(),ssdp.class);
                startActivity(i);
                return true;
            case R.id.stc:
                i =new Intent(getBaseContext(),stc.class);
                startActivity(i);
                return true;

            case R.id.hands:
                i =new Intent(getBaseContext(),hands.class);
                startActivity(i);
                return true;
            case R.id.lrf:
                i =new Intent(getBaseContext(),lrf.class);
                startActivity(i);
                return true;
            case R.id.voy:
                i =new Intent(getBaseContext(),voy.class);
                startActivity(i);
                return true;

        }

        return false;






    }

}

