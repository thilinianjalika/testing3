package com.example.testing3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DeliveryReview extends AppCompatActivity {

    Button btn_disc;
    Button tv_continue;
    ImageView rImage;
    CheckBox tv_cardpay1,tv_cod;
    private DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_review);
    }

    public void CreateData(View view) {
        Intent intent = new Intent(this, DeliveryPayment.class);
        startActivity(intent);

        btn_disc = findViewById(R.id.btn_disc);
        tv_continue = findViewById(R.id.tv_continue);
        tv_cardpay1 =(CheckBox)findViewById(R.id.checkBox);
        tv_cod =(CheckBox)findViewById(R.id.checkBox2);

        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();

        DatabaseReference getImage = databaseReference.child("image");
        getImage.addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        }
}