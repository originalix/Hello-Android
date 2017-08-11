package com.originalix.lix.helloandroid;

/**
 * Created by Lix on 2017/8/11.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);
}
