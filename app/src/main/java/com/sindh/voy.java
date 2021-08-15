package com.sindh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class voy extends AppCompatActivity {
    Button call,wapp,email,web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voy);
        call=findViewById(R.id.call);
        wapp=findViewById(R.id.wapp);
        email=findViewById(R.id.email);
        web=findViewById(R.id.web);
        call.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                String vc = "tel:03102939128" ;
                Intent next = new Intent (Intent.ACTION_DIAL, Uri.parse(vc));
                startActivity(next);

            }
        });

        wapp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=+923102939128&text=&source=&data="));
                startActivity(i);
            }
        });

        email.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String mailto = "mailto:azhar786murtaza@gmail.com";

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse(mailto));

                try {
                    startActivity(emailIntent);
                } catch (ActivityNotFoundException e) {
                    //TODO: Handle case where no email app is available
                }
            }
        });
        web.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/voceofyouthwelfareorganization/"));
                startActivity(i);
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
