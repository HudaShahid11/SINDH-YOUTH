package com.sindh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.nineoldandroids.animation.ValueAnimator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class message extends AppCompatActivity {
    ProgressDialog dialog;
    Dialog epicdialog;
    Button visit;
    Button close;
    TextView note;
    ImageButton fb , twi , youtube , wb , email , call , web;
    Button internship , reg , courses  , resume,workshops ;
    Url url = new Url();
    String link = url.getUrl();
    String password = "123456";
    String text ="Total Registration: ";
    String last_text;
    TextView data;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        epicdialog = new Dialog(this);
        showPopup();
        final TextView first = (TextView) findViewById(R.id.first);
        final TextView second = (TextView) findViewById(R.id.second);
        first.setText(last_text);
        second.setText(last_text);
        final ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f);
        animator.setRepeatCount(ValueAnimator.INFINITE);
        animator.setInterpolator(new LinearInterpolator());
        animator.setDuration(9000L);
        animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator animation) {
                final float progress = (float) animation.getAnimatedValue();
                final float width = first.getWidth();
                final float translationX = width * progress;
                first.setTranslationX(translationX);
                second.setTranslationX(translationX - width);
            }
        });
       // animator.start();
        dialog = new ProgressDialog(this);
        dialog.setTitle("Loading...");
        dialog.setMessage("Please wait...");
        dialog.setCancelable(false); // disable dismiss by tapping outside of the dialog
        dialog.show();
        RestAdapter adapter = new RestAdapter.Builder()
                .setEndpoint(link) //Setting the Root URL
                .build(); //Finally building the adapter

        //Creating object for our interface
        CountApi api = adapter.create(CountApi.class);

        //Defining the method insertuser of our interface
        api.insertUser(

                //Passing the values by getting it from editTexts
                password,




                //Creating an anonymous callback
                new Callback<Response>() {


                    @Override
                    public void success(Response result, Response response) {
                        //On success we will read the server's output using bufferedreader
                        //Creating a bufferedreader object
                        BufferedReader reader = null;

                        //An string to store output from the server
                        String output = "";

                        try {
                            //Initializing buffered reader
                            reader = new BufferedReader(new InputStreamReader(result.getBody().in()));

                            //Reading the output in the string
                            output = reader.readLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        dialog.dismiss();
                        last_text = text+output;
                        first.setText(last_text);
                        second.setText(last_text);





                    }



                    @Override
                    public void failure(RetrofitError error) {
                        dialog.dismiss();

                        first.setText("Loading..");
                        second.setText("Loading..");

                    }
                }
        );

//        first.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getBaseContext(),internship.class);
//                startActivity(intent);
//            }
//        });
//        second.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getBaseContext(),internship.class);
//                startActivity(intent);
//            }
//        });

        fb = findViewById(R.id.fb);
        twi = findViewById(R.id.twi);
        youtube = findViewById(R.id.youtube);
        email = findViewById(R.id.e_mail);

        wb = findViewById(R.id.wb);
      //  internship = findViewById(R.id.internship);
//        reg = findViewById(R.id.reg);
      courses  = findViewById( R.id.course);
      resume = findViewById(R.id.resume);
      workshops=findViewById(R.id.workshops);
      workshops.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent;
              intent = new Intent(getBaseContext(),workshop.class);
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
        wb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sindhgames.com"));
                startActivity(intent);
            }
        });
//        internship.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Intent intent;
//                intent = new Intent(getBaseContext(),internship.class);
//                startActivity(intent);
//            }
//        });
        resume.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://kewo.org/app/kewo_app/apps/cv"));
                startActivity(i);
            }
        });
        courses.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent;
                intent = new Intent(getBaseContext(),online_course.class);
                startActivity(intent);
            }
        });
//        reg.setOnClickListener(new View.OnClickListener(){
//
//            @Override
//            public void onClick(View v) {
//                Intent intent;
//                intent = new Intent(getBaseContext(),counter.class);
//                startActivity(intent);
//            }
//        });

//        data= findViewById(R.id.data);
//        data.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent;
//                intent = new Intent(getBaseContext(),data.class);
//                startActivity(intent);
//            }
//        });

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
    public void showPopup(){
        epicdialog.setContentView(R.layout.epic_popup);
        close = epicdialog.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                epicdialog.dismiss();
            }
        });
        visit= epicdialog.findViewById(R.id.visit);
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(),online_category.class);
                startActivity(i);
            }
        });
        epicdialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        epicdialog.show();
    }
}
