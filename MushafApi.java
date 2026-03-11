package com.isysway.mushaf.api;

import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Streaming;

import java.util.List;

public interface MushafApi {
    @GET("versions/app_updates.json")
    List<AppUpdate> getAppUpdates();

    @GET("versions/resources_versions.json")
    ResourcesVersions getResourcesVersions();

    @GET("other/urls.json")
    AppUrls getAppUrls();

    @GET("translations/available_translations_info.json")
    Response<ResponseBody> getAvailableTranslations();

    @GET("{path}")
    @Streaming
    Response<ResponseBody> getTranslation(@Path("path") String path);

    @GET("quran_scripts/{filename}")
    @Streaming
    Response<ResponseBody> getQuranScript(@Path("filename") String filename);

    @GET("fonts/arabic/{part}")
    @Streaming
    Response<ResponseBody> getArabicFont(@Path("part") String part);

    @GET("fonts/kurdish/{part}")
    @Streaming
    Response<ResponseBody> getKurdishFont(@Path("part") String part);

    @GET("recitations/available_recitations_info.json")
    Response<ResponseBody> getAvailableRecitations();

    @GET("recitations/available_recitation_translations_info.json")
    Response<ResponseBody> getAvailableRecitationTranslations();

    @GET("tafsirs/available_tafsirs_info.json")
    Response<ResponseBody> getAvailableTafsirs();
}
