package com.example.testing3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MakePayment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_payment);
    }

    public void CreateData(View view) {
        Intent intent = new Intent(this, DeliveryPayment.class);
        startActivity(intent);
    }
}
