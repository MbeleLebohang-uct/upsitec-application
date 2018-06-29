package com.upsitec.upsitec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView mDriverCard, mCustomerCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Define cards
        mDriverCard = findViewById(R.id.driver);
        mCustomerCard = findViewById(R.id.customer);

        // Add click listener to the cards
        mDriverCard.setOnClickListener(this);
        mCustomerCard.setOnClickListener(this);
        
    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case(R.id.driver):
                intent = new Intent(MainActivity.this, DriverLoginActivity.class);
                startActivity(intent);
                finish();
                return;

            case (R.id.customer):
                intent = new Intent(MainActivity.this, CustomerLoginActivity.class);
                startActivity(intent);
                finish();
                return;

            default:
               return;
        }
    }
}
