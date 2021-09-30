package com.ebeatsz.jsonparser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String string_json = "{\n" +
            " \"title\": \"JSONParserTutorial\",\n" +
            " \"array\": [\n" +
            "{\n" +
            " \"Company\": \"Google\",\n" +
            "},\n" +
            "{\n" +
            " \"Company\": \"Facebook\",\n" +
            "},\n" +
            "{\n" +
            " \"Company\": \"Linkedin\",\n" +
            "},\n" +
            "{\n" +
            " \"Company\": \"Microsoft\",\n" +
            "},\n" +
            "{\n" +
            " \"Company\": \"Apple\",\n" +
            "},\n" +
            "],\n" +
            "\"nested\": {\n" +
            "\"flag\": true,\n" +
            "\"random_number\": 1,\n" +
            "}\n" +
            "}";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {

            listView = findViewById(R.id.list_view);

            // Store items in list
            List<String> items = new ArrayList<String>();

            // Getting the jsonObject
            JSONObject root = new JSONObject(string_json);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}