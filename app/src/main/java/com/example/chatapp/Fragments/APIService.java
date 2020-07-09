package com.example.chatapp.Fragments;

import com.example.chatapp.Notifications.MyResponse;
import com.example.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-type:application/json",
                    "Authorization:key=AAAAAFeTeBs:APA91bEIEhA-ZwJhHFxp_5Ol1fGPBQaDHjmh5Xlqud1SSmL9MdEp4Ef54D9Q8ldVckKZgkwY0lh0DD0ku_bqNNkK7dkT4ebD0EdWqpozHM08BUbf53YkIhATI2a--JK4GPYfZx-oq_bl"
            }
    )

    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
