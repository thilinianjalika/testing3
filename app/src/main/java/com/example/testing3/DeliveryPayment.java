package com.example.testing3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class DeliveryPayment extends AppCompatActivity {

    Button btn_edit_contact;
    Button btn_edit_contact2;

    CheckBox pay_card,pay_cod,tv_ad2,tv_ad1;
    Button btn_complete_order;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery_payment);
    }


    public void CreateData(View view) {
        Intent intent = new Intent(this, DeliveryPayment.class);
        startActivity(intent);

        pay_card =(CheckBox)findViewById(R.id.checkBox);
        pay_cod =(CheckBox)findViewById(R.id.checkBox2);
        tv_ad2 = (CheckBox)findViewById(R.id.checkBox3);
        tv_ad1 = (CheckBox)findViewById(R.id.checkBox4);
      btn_complete_order=(Button)findViewById(R.id.btn_complete_order);

        btn_complete_order.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View view) {
            int totalamount=0;
            StringBuilder result=new StringBuilder("cicityc");




        }