package com.example.amitkumar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

public class About extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    public void profile(MenuItem item) {

        Intent pIntent = new Intent(this, MainActivity.class);
        startActivity(pIntent);
        finish();
    }

    public void projects(MenuItem item) {

        Intent pIntent = new Intent(this, Projects.class);
        startActivity(pIntent);
        finish();
    }

    public void about(MenuItem item) {

        Intent pIntent = new Intent(this, About.class);
        startActivity(pIntent);
        finish();
    }


}