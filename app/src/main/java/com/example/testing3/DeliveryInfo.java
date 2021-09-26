package com.example.testing3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DeliveryInfo extends AppCompatActivity {


    EditText et_email;
    EditText et_name;
    EditText et_company;
    EditText et_address;
    EditText et_address2;
    EditText et_city;
    EditText et_pcode;
    EditText et_phone;
    Button btn_deliveryinfo;

    DatabaseReference dbRef;
    Delivery delivery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_info);

        getSupportActionBar().setTitle("SHIPPING INFO");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        et_email = findViewById(R.id.et_email);
        et_name = findViewById(R.id.et_name);
        et_company = findViewById(R.id.et_company);
        et_address = findViewById(R.id.et_address);
        et_address2 = findViewById(R.id.et_address2);
        et_city = findViewById(R.id.et_city);
        et_pcode = findViewById(R.id.et_pcode);
        et_phone = findViewById(R.id.et_phone);
        btn_deliveryinfo = findViewById(R.id.btn_deliveryinfo);

        delivery = new Delivery();

    }

    public void CreateData(View view) {

        dbRef = FirebaseDatabase.getInstance().getReference().child("Delivery");

        try {
            if (TextUtils.isEmpty(et_email.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter a Email", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(et_name.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter a Name", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(et_address.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter a Address", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(et_address2.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter a Apartment", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(et_city.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter the City", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(et_pcode.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter the Postal code", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(et_phone.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please enter a Contact Number", Toast.LENGTH_SHORT).show();
            else {


                delivery.setEmail(et_email.getText().toString().trim());
                delivery.setName(et_name.getText().toString().trim());
                delivery.setCompany(et_company.getText().toString().trim());
                delivery.setAddress(et_address.getText().toString().trim());
                delivery.setApartment(et_address2.getText().toString().trim());
                delivery.setCity(et_city.getText().toString().trim());
                delivery.setPostal_code(Integer.parseInt(et_pcode.getText().toString().trim()));
                delivery.setPhone(Integer.parseInt(et_phone.getText().toString().trim()));
                dbRef.push().setValue(delivery);

                Toast.makeText(getApplicationContext(), "Data inserted successfully!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(this,DeliveryReview.class);
                startActivity(intent);
            }

        } catch (NumberFormatException e) {
            Toast.makeText(getApplicationContext(), "Invalid Number Format", Toast.LENGTH_SHORT).show();
            Toast.makeText(getApplicationContext(), "Invalid email address", Toast.LENGTH_SHORT).show();

        }
    }
}

