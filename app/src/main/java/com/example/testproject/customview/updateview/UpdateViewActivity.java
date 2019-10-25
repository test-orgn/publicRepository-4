package com.example.testproject.customview.updateview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.testproject.R;

public class UpdateViewActivity extends AppCompatActivity {

    private UpdateButton updateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_view);
        updateButton = findViewById(R.id.updatebutton);
    }

    float percentage = 0;

    public void click(View view){
        percentage +=0.1f;
        Log.e("xiaojun","percentage="+percentage);
        updateButton.setPercentage(percentage);
        if (percentage >= 1)
            percentage = 0;
    }
}
