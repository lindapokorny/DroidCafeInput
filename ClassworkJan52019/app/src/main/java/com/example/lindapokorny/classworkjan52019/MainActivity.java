package com.example.lindapokorny.classworkjan52019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
List<String> urlList = new ArrayList<>();

    try{
        JSONObject jsonObject = new JSONObject(Hound.Json);
        try {
            JSONArray jsonArray = jsonObject.getJSONArray("message");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        Log.d("HOUND", "URL: ", + url);
        urlList.add(url);
    }
}
