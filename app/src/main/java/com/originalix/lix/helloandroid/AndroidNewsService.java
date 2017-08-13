package com.originalix.lix.helloandroid;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Lix on 2017/8/13.
 */

public interface AndroidNewsService {
    @GET("/api/data/Android/100/1")
    public Call<NewsModel> getNewsModel(
    );
}
