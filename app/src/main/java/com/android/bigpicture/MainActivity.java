package com.android.bigpicture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BigView bigView = findViewById(R.id.bigView);
        InputStream inputStream = null;
        try {
            inputStream= getAssets().open("big.png");
            bigView.setImage(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (null != inputStream){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
