package com.example.itread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class GetEmailNumberActivity extends AppCompatActivity {

    private EditText email_get_email;
    private Button email_finsh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_get_email_number);
    }
}
