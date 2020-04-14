package com.example.regis;

import android.app.Application;
import android.media.VolumeShaper;

import com.parse.Parse;

import org.testng.annotations.Configuration;

import java.security.KeyPairGenerator;




public class ParseApplication extends Application {


    @Override
    public void onCreate() {
        super.onCreate();

        // set applicationId, and server server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax

         // set applicationId, and server server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("8cOR6Hb0st") // should correspond to APP_ID env variable
                .clientKey(null)  // set explicitly unless clientKey is explicitly configured on Parse server
                .server("https://parseapi.back4app.com/classes/_User").build());




    }
}
