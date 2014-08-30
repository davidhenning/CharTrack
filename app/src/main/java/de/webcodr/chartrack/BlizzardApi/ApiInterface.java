package de.webcodr.chartrack.BlizzardApi;

import de.webcodr.chartrack.Model.CharacterProfile;
import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

public interface ApiInterface {
    @GET("/d3/profile/{battleTag}/")
    CharacterProfile profile(@Path("battleTag") String battleTag);

    @GET("/d3/profile/{battleTag}/")
    void getUserProfile(@Path("battleTag") String battleTag, Callback<CharacterProfile> cb);
}
