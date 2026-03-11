package com.isysway.mushaf.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MushafRetrofitInstance {
    private static OkHttpClient client;
    private static MushafApi mushafApi;

    static {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        client = new OkHttpClient.Builder()
                .addInterceptor(chain -> {
                    // Log the request URL
                    System.out.println("Request URL: " + chain.request().url());
                    return chain.proceed(chain.request());
                })
                .cache(null)
                .build();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(MushafApiConfig.MUSHAF_COMPONENTS_ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(client)
                .build();

        mushafApi = retrofit.create(MushafApi.class);
    }

    public static MushafApi getMushafApi() {
        return mushafApi;
    }

    public static void resetApi() {
        // Reset the API instance if needed
        // This would recreate the Retrofit instance
    }
}
