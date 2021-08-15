package com.sindh;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class counter extends AppCompatActivity  {
TextView count_text;
Button count_button;
ProgressDialog dialog;
Url url = new Url();
String link = url.getUrl();
String password = "123456";
String text ="Total Registration: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        count_text = findViewById(R.id.count_text);
        count_button = findViewById(R.id.count_button);
        dialog = new ProgressDialog(this);
        count_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
                                count_text.setTextSize(80);
                                count_text.setText(output);




                            }



                            @Override
                            public void failure(RetrofitError error) {
                                dialog.dismiss();
                                AlertDialog.Builder builder
                                        = new AlertDialog
                                        .Builder(counter.this);


                                builder.setMessage(error.toString());
                                builder.setTitle("Error");
                                builder.setCancelable(false);
                        /*builder.setPositiveButton(
                                        "Exit",
                                        (dialog, which) -> {

                                            // When the user click yes button
                                            // then app will close
                                            finish();
                                        });*/
                                builder
                                        .setNegativeButton(
                                                "Ok",
                                                (dialog, which) -> {
                                                    dialog.cancel();
                                                });
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();
                            }
                        }
                );
            }
        });
    }
}
