package com.example.utsmobprogezyfood;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cart extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        button = findViewById(R.id.backHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainView();
            }
        });

        TextView harga = findViewById(R.id.harga);
        String hrg = "Rp. 2.400 Rp. 1.500";

        TextView harga2 = findViewById(R.id.harga2);
        String hrg2 = "Rp. 10.000 Rp. 7.000";

        TextView harga3 = findViewById(R.id.harga3);
        String hrg3 = "Total = Rp. 20.000 Rp. 14.000";

        SpannableString ss = new SpannableString(hrg);
        SpannableString ss2 = new SpannableString(hrg2);
        SpannableString ss3 = new SpannableString(hrg3);

        StrikethroughSpan stSpan = new StrikethroughSpan();
        ss.setSpan(stSpan, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss2.setSpan(stSpan, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss3.setSpan(stSpan, 8, 17, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        harga.setText(ss);
        harga2.setText(ss2);
        harga3.setText(ss3);
    }

    public void openMainView()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}