package com.sindh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class online_category extends AppCompatActivity {
    Button pgd, safety,finance,lang,mgt,marketing,tech,tour,business,cisco_networking,cisco_infrastructure_automation,cisco_security,cisco_iot_and_data_analytics,cisco_os_and_it,cisco_programming,cisco_others;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_online_category);

//        safety = findViewById(R.id.safety);
//        safety.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(getBaseContext(), CourseActivity.class);
//                i.putExtra("category","safecon_safety");
//                startActivity(i);
//            }
//        });
        finance = findViewById(R.id.finance);
        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category",finance.getText());
                startActivity(i);
            }
        });

        tour = findViewById(R.id.tour);
        tour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category",tour.getText());
                startActivity(i);
            }
        });
        business = findViewById(R.id.business);
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category",business.getText());
                startActivity(i);
            }
        });


        lang = findViewById(R.id.lang);
        lang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","Languages");
                startActivity(i);
            }
        });
        mgt = findViewById(R.id.mgt);
        mgt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category",mgt.getText());
                startActivity(i);
            }
        });
        marketing = findViewById(R.id.marketing);
        marketing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","Marketing");
                startActivity(i);
            }
        });


        tech = findViewById(R.id.tech);
        tech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category",tech.getText());
                startActivity(i);
            }
        });
        cisco_networking = findViewById(R.id.cisco_networking);
        cisco_networking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","cisco_networking");
                startActivity(i);
            }
        });
        cisco_infrastructure_automation = findViewById(R.id.cisco_infrastructure_automation);
        cisco_infrastructure_automation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","cisco_infrastructure_automation");
                startActivity(i);
            }
        });
        cisco_security = findViewById(R.id.cisco_security);
        cisco_security.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","cisco_security");
                startActivity(i);
            }
        });
        cisco_iot_and_data_analytics = findViewById(R.id.cisco_iot_and_data_analytics);
        cisco_iot_and_data_analytics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","cisco_iot_and_data_analytics");
                startActivity(i);
            }
        });
        cisco_os_and_it = findViewById(R.id.cisco_os_and_it);
        cisco_os_and_it.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","cisco_os_and_it");
                startActivity(i);
            }
        });
        cisco_programming = findViewById(R.id.cisco_programming);
        cisco_programming.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","cisco_programming");
                startActivity(i);
            }
        });
        cisco_others = findViewById(R.id.cisco_others);
        cisco_others.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","cisco_others");
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
