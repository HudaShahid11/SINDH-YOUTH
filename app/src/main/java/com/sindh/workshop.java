package com.sindh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class workshop extends AppCompatActivity {
    Button finance,technology,language,vocational,standard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workshop);
        finance = findViewById(R.id.finance);
        finance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","workshop_finance");
                startActivity(i);
            }
        });
        technology = findViewById(R.id.technology);
        technology.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","workshop_technology");
                startActivity(i);
            }
        });
        language = findViewById(R.id.language);
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","workshop_language");
                startActivity(i);
            }
        });
        vocational = findViewById(R.id.vocational);
        vocational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","workshop_vocational");
                startActivity(i);
            }
        });
        standard = findViewById(R.id.standard);
        standard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), CourseActivity.class);
                i.putExtra("category","workshop_standard");
                startActivity(i);
            }
        });
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
