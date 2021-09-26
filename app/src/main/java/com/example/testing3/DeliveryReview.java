package com.example.testing3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DeliveryReview extends AppCompatActivity {

    Buttonbtn_disc

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_review);
    }

    public void CreateData(View view) {
        Intent intent = new Intent(this, Wishlist.class);
        startActivity(intent);
    }
}