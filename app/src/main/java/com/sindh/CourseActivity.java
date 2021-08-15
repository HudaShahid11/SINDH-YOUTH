package com.sindh;


import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CourseActivity extends AppCompatActivity implements CoursesAdapter.ClickedItem{
    Toolbar toolbar;
    RecyclerView recyclerView;
    CoursesAdapter usersAdapter;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course2);
        dialog = new ProgressDialog(this);
        toolbar = findViewById(R.id.toolbar);
        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        usersAdapter = new CoursesAdapter(this::ClickedUser);
        dialog.setTitle("Loading...");
        dialog.setMessage("Please wait...");
        dialog.setCancelable(false); // disable dismiss by tapping outside of the dialog
        dialog.show();
        getAllUsers();

    }
    public  void getAllUsers(){
        Call<List<CourseResponse>> userlist = CourseApiClient.getUserService().getAllCourses();
        userlist.enqueue(new Callback<List<CourseResponse>>() {
            @Override
            public void onResponse(Call<List<CourseResponse>> call, Response<List<CourseResponse>> response) {
                if(response.isSuccessful()){

                    List<CourseResponse> userResponses = response.body();
                    List<CourseResponse> course = new ArrayList<>();
                    Intent intent = getIntent();
                    String category = intent.getStringExtra("category");

                    for(int i=0 ; i < userResponses.size(); i++){
                        if(userResponses.get(i).getCategory().equals(category)){

                            course.add(userResponses.get(i));
                        }
                    }


                    usersAdapter.setData(course);
                    recyclerView.setAdapter(usersAdapter);
                    dialog.dismiss();
                }
            }

            @Override
            public void onFailure(Call<List<CourseResponse>> call, Throwable t) {
                dialog.dismiss();
                AlertDialog.Builder builder
                        = new AlertDialog
                        .Builder(CourseActivity.this);


                builder.setMessage(t.getLocalizedMessage());
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
        });

    }

    @Override
    public void ClickedUser(CourseResponse userResponse) {
        startActivity(new Intent(this,CourseDetail.class).putExtra("data",userResponse));

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

