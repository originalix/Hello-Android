package com.originalix.lix.helloandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class RetrofitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://gank.io")
                .addConverterFactory()
                .build();
        AndroidNewsService service = retrofit.create(AndroidNewsService.class);
        Call<NewsModel> call = service.getNewsModel();
        call.enqueue(new Callback<NewsModel>() {
            @Override
            public void onResponse(Call<NewsModel> call, Response<NewsModel> response) {
                NewsModel model = response.body();
                Log.d("lix", model.toString());
            }

            @Override
            public void onFailure(Call<NewsModel> call, Throwable t) {
                Log.e("lix", call.toString());
            }
        });
    }
}
