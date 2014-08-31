package de.webcodr.chartrack.BlizzardApi;


import retrofit.RestAdapter;

public class Client {

    private static ApiInterface blizzardService;

    public static ApiInterface getClient() {
        if (blizzardService == null) {
            RestAdapter restAdapter = new RestAdapter.Builder()
                    .setEndpoint("http://eu.battle.net/api")
                    .setLogLevel(RestAdapter.LogLevel.FULL)
                    .build();

            blizzardService = restAdapter.create(ApiInterface.class);
        }

        return blizzardService;
    }

}
