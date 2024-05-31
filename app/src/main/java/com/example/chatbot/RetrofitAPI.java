package com.example.chatbot;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface RetrofitAPI {
    @GET              //getting data
    Call<MsgModel> getMessage(@Url String url) ;   ///storing in msgModel--->method-->url

    //we will call getMessage() method to -> get message ->in the string we will pass the url from which we are getting the api
}
