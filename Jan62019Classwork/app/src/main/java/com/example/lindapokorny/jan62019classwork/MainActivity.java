package com.example.lindapokorny.jan62019classwork;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "JSON ACTIVITY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JSONObject newJsonWeAreMaking = new JSONObject();
        Log.d(TAG, "OnCreate: " + newJsonWeAreMaking.toString());

        /*
        try {
            newJsonWeAreMaking.put("name", "Jose"); */

        //Here we are making a JSON Object; and putting "family_members" as the key to our object,
        // then we are giving the Key the Value of a JSON ARRAY.  Inside of the Json Array we are also putting another
        // key value pair of: "name","Jose"
        //output will look like this:   {"family_members":[{"name":"Jose"}]}

        /* made a JSON AND GAVE IT VALUES
        try {

            newJsonWeAreMaking
                    .put("family_members", new JSONArray()
                    .put(new JSONObject()
                            .put("name", "Jose"))
                    .put(new JSONObject()
                            .put("name", "Ramona"))
                    .put(new JSONObject()
                            .put("name", "Joe"))
                    .put(new JSONObject()
                            .put("name", "Barbara"))
                    .put(new JSONObject()
                            .put("name", "Aida")
                    )

                    );

    }catch (JSONException e){
            e.printStackTrace();
        }
        Log.d(TAG, "OnCreate: " + newJsonWeAreMaking.toString());

        Log.d(TAG, newJsonWeAreMaking.toString());


    } */
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

/*        String letsBreakStuff = "{\"family_members\":" {\"name\":\"Jose\",\"role\":\"Brother\"," +
                "\"age\":37},{\"name\":\"Ramona\",\"role\":\"Sister\",\"age\":40},{\"name\":\"Joe\"" +
                ",\"role\":\"Father\",\"age\":69},{\"name\":\"Barbara\",\"role\":\"Mother\",\"age\":71},{\"name\":\"" +
                "Aida\",\"role\":\"Partner\",\"age":41}]}
*/

        try {
            // First, we're turning the String into a JSONObject
            JSONObject oldJsonWeAreParsing = new JSONObject(jsonString);

            // Next, we're extracting the part of the JSON we want, the JSONArray,
            // and using the key "family_members" to get to it:
            JSONArray familyMembersJsonArray = oldJsonWeAreParsing.getJSONArray("family_members");

            List<FamilyMember> familyMemberList = new ArrayList<>();

            for (int i = 0; i < familyMembersJsonArray.length(); i++) {
                FamilyMember member = new FamilyMember();
                member.setName((String) familyMembersJsonArray.getJSONObject(i).get("name"));
                member.setRole((String) familyMembersJsonArray.getJSONObject(i).get("role"));
                member.setAge((Integer) familyMembersJsonArray.getJSONObject(i).get("age"));
                familyMemberList.add(member);
                //here we are creating a family member ArrayList - and setting the name to the new member by getting the Key's such as "name" "role" "age"
            }

        } catch (JSONException e){
            e.printStackTrace();
        }
}
    }
