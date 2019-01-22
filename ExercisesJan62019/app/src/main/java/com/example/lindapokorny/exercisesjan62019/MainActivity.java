package com.example.lindapokorny.exercisesjan62019;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class MainActivity extends AppCompatActivity {
    public static final String TAG = "JSON ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject newJsonWeAreMaking = new JSONObject();

        try {
            newJsonWeAreMaking.put("family_members", new JSONArray()
                    .put(new JSONObject()
                            .put("name", "Jose")
                            .put("role", "Brother")
                            .put("age", 37))
                    .put(new JSONObject()
                            .put("name", "Ramona")
                            .put("role", "Sister")
                            .put("age", 40))
                    .put(new JSONObject()
                            .put("name", "Joe")
                            .put("role", "Father")
                            .put("age", 69))
                    .put(new JSONObject()
                            .put("name", "Barbara")
                            .put("role", "Mother")
                            .put("age", 71))
                    .put(new JSONObject()
                            .put("name", "Aida")
                            .put("role", "Partner")
                            .put("age", 41)));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        String jsonString = newJsonWeAreMaking.toString();

        Log.d(TAG, "onCreate: " + jsonString);
    }
}
