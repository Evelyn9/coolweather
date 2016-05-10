package com.coolweather.app.util;

/**
 * Created by 木子里 on 2016/5/9.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
