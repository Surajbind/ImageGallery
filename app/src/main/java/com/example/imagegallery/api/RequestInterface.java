package com.example.imagegallery.api;


import com.example.imagegallery.Imagelist;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RequestInterface {

    @GET("services/rest/?method=flickr.photos.getRecent&per_page=20&page=1&api_key=6f102c62f41998d151e5a1b48713cf13&format=json&nojsoncallback=1&extras=url_s")
    Call<Imagelist> getJSON();


    @GET("services/rest/?method=flickr.photos.getRecent&per_page=20&page=1&api_key=6f102c62f41998d151e5a1b48713cf13&format=json&nojsoncallback=1&extras=url_s")
    Call<Imagelist> getSearch(@Query("text")String search);
}
