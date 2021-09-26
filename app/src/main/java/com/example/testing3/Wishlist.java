package com.example.testing3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.net.HttpCookie;

public class Wishlist extends AppCompatActivity {

    ImageView rImage;
    Button btn_select_option;
    private DatabaseReference databaseReference;

    protected void onCreate(Bundle savedInstanceState, HttpCookie dataSnapshot) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wishlist);

        getSupportActionBar().setTitle("WISHLIST");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        rImage = findViewById(R.id.rImage);
        btn_select_option = findViewById(R.id.btn_select_option);
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        
        DatabaseReference getImage = databaseReference.child("image");
        getImage.addListenerForSingleValueEvent(new ValueEventListener() {




            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {

                String link = dataSnapshot.getValue(Wishlist.class);
            }



            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        }


    public void CreateData(View view) {
        Intent intent = new Intent(this, MakePayment.class);
        startActivity(intent);


    }
}