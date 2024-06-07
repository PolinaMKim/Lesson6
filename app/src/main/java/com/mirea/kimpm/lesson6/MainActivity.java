package com.mirea.kimpm.lesson6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mirea.kimpm.lesson6.databinding.ActivityMainBinding;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private EditText Group;
    private EditText Number;
    private EditText Film;
    private Button button;

    private static final String PREFS_NAME = "MyPrefsFile";
    private static final String GROUP = "group";
    private static final String NUMBER = "number";
    private static final String FILM = "film";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Group = findViewById(R.id.Group);
        Number = findViewById(R.id.Number);
        Film = findViewById(R.id.Film);
        button = findViewById(R.id.button);

        loadPreferences();

        button.setOnClickListener(v -> savePreferences());
    }

    private void loadPreferences() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        String groupNumber = settings.getString(GROUP, "");
        String listNumber = settings.getString(NUMBER, "");
        String favoriteMovie = settings.getString(FILM, "");

        Group.setText(groupNumber);
        Number.setText(listNumber);
        Film.setText(favoriteMovie);
    }

    private void savePreferences() {
        SharedPreferences settings = getSharedPreferences(PREFS_NAME, 0);
        SharedPreferences.Editor editor = settings.edit();

        editor.putString(GROUP, Group.getText().toString());
        editor.putString(NUMBER, Number.getText().toString());
        editor.putString(FILM, Film.getText().toString());

        editor.apply();
    }
}