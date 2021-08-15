package com.sindh;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class CourseDetail extends AppCompatActivity {
    TextView title,duration,cost,assessment,certification,responsive,publisher,info;
    me.biubiubiu.justifytext.library.JustifyTextView description;
    ImageView image;
    CourseResponse userResponse;
    Button start;
    ImageButton fb,wapp;
    TextView software,program;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        title = findViewById(R.id.title);
        description = findViewById(R.id.desc);
        duration = findViewById(R.id.duration);
        assessment = findViewById(R.id.assessment);
        certification = findViewById(R.id.certification);
        responsive = findViewById(R.id.responsive);
        publisher = findViewById(R.id.publisher);
       // software = findViewById(R.id.software);
        program = findViewById(R.id.program);
        image = findViewById(R.id.image);
        cost = findViewById(R.id.cost);
       // info = findViewById(R.id.info);
        start = findViewById(R.id.start);

        image = findViewById(R.id.image);

        Intent intent = getIntent();
        if(intent.getExtras() != null){
            userResponse = (CourseResponse) intent.getSerializableExtra("data");
            String title_data = userResponse.getTitle();
            String desc_data = userResponse.getDescription();

            String duration_data = userResponse.getDuration();
            String cost_data = userResponse.getCost();
            String ass_data = userResponse.getAssessment();
            String cer_data = userResponse.getCertification();
            String res_data = userResponse.getResponsive();
            String pub_data = userResponse.getPublisher();
            String img_data = userResponse.getUrl();
           // String info_data = userResponse.getWeb_url();
            desc_data= desc_data.concat("\n");
          Picasso.get().load(img_data).into(image);
            title.setText(title_data);
            description.setText(desc_data);
            duration.setText(duration_data);
            cost.setText(cost_data);
            assessment.setText(ass_data);
            certification.setText(cer_data);
            responsive.setText(res_data);
            publisher.setText(pub_data);
//            if(userResponse.getCategory().equals("safecon_safety")){
//                software.setText("");
//            }
//            else if(userResponse.getCategory().equals("internship_e_filing")){
//                software.setText("");
//                program.setText("Weekdays");
//
//            }


            start.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent i = new Intent(getBaseContext(),CourseForm.class);
                    i.putExtra("data",userResponse);
                    startActivity(i);


                }
            });


        }
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
