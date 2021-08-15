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
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class nav extends AppCompatActivity {
Button signup , events , gallery  , policy ;
ImageButton fb , twi , youtube , wapp , email , call , web;
ViewFlipper v_flipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);
        signup = findViewById(R.id.signup);
        events = findViewById(R.id.event);
        gallery = findViewById( R.id.gallery);
        policy = findViewById(R.id.policy);
        fb = findViewById(R.id.fb);
        twi = findViewById(R.id.twi);
        youtube = findViewById(R.id.youtube);
        wapp = findViewById(R.id.wapp);
        email = findViewById(R.id.email);
        call = findViewById(R.id.call);
        web = findViewById(R.id.web);
        signup.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),form.class);
                startActivity(intent);
            }
        });
        policy.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),activity.class);
                startActivity(intent);
            }
        });
        gallery.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),press.class);
                startActivity(intent);
            }
        });
        events.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),Upcoming_events.class);
                startActivity(intent);
            }
        });
        fb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/SindhSportsDepartment/"));
                startActivity(intent);
            }
        });
        twi.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/SindhSportsDept?s=20"));
                startActivity(intent);
            }
        });
        youtube.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UCSb_7XR0rhQIcZOk88p8hOg"));
                startActivity(intent);
            }
        });
        wapp.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://api.whatsapp.com/send?phone=923337007547"));
                startActivity(intent);
            }
        });
        email.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String mailto = "mailto:info@sindhgames.com";

                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse(mailto));

                try {
                    startActivity(emailIntent);
                } catch (ActivityNotFoundException e) {
                    //TODO: Handle case where no email app is available
                }
            }
        });
        call.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String vc = "tel:02199203009" ;
                Intent next = new Intent (Intent.ACTION_DIAL, Uri.parse(vc));
                startActivity(next);
            }
        });
        web.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sindhgames.com/"));
                startActivity(intent);
            }
        });

        int image[] = {R.drawable.cmm , R.drawable.scc};

        v_flipper = findViewById(R.id.v_flipper);

        for(int images:image){
            Flipper(images);
        }



    }
    public void Flipper (int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);
        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(4000);
        v_flipper.setAutoStart(true);
        v_flipper.setInAnimation(this,android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this,android.R.anim.slide_out_right);

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
