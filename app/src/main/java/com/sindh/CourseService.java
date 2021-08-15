package com.sindh;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface CourseService {
    @GET("apps/sindh_course")
    Call<List<CourseResponse>> getAllCourses();
}

