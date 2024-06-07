package com.mirea.kimpm.internalfilestorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private String fileName = "date.txt";
    private EditText date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        date = findViewById(R.id.date);
        date.setText(loadDateFromStorage());
    }

    public void save(View view) {
        String dateString = date.getText().toString();
        writeStringToStorage(dateString);
    }

    private void writeStringToStorage(String content) {
        try (FileOutputStream fos = openFileOutput(fileName, Context.MODE_PRIVATE)) {
            fos.write(content.getBytes());
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error writing to storage", e);
        }
    }

    private String loadDateFromStorage() {
        StringBuilder sb = new StringBuilder();
        try (FileInputStream fis = openFileInput(fileName)) {
            int read;
            byte[] buffer = new byte[1024];
            while ((read = fis.read(buffer))!= -1) {
                sb.append(new String(buffer, 0, read));
            }
        } catch (IOException e) {
            Log.e(LOG_TAG, "Error reading from storage", e);
        }
        return sb.toString();
    }

}