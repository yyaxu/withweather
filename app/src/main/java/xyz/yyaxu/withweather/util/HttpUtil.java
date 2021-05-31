package xyz.yyaxu.withweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;
/*与服务器进行交互*/
public class HttpUtil {
    public static void sendOKHttpRequest(String address,okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
