package com.example.computerland.chatapp.Fragments;

import com.example.computerland.chatapp.Notifications.MyResponse;
import com.example.computerland.chatapp.Notifications.Sender;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface APIService {
    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAAuPKVLYs:APA91bEn1Vsi1p-X1pIIpc1PBqc_IVLZYwxDBsZinyH3SsfpBbZh09GNSeR2FTIrVoE8OY98KwrV2t9r0engwibIRX7kfZ7bilpBaNc0CnuE4dOoJhlI9pl9srsjGK49mm4mBeUde4ha"
            }
    )
    @POST("fcm/send")
    Call<MyResponse> sendNotification(@Body Sender body);
}
