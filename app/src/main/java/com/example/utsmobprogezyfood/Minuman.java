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

public class Minuman extends AppCompatActivity {

    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minuman);
        button = findViewById(R.id.backHome);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainView();
            }
        });

        TextView harga = findViewById(R.id.harga);
        String hrg = "Rp. 10.000 Rp. 7.000";
        SpannableString ss = new SpannableString(hrg);

        StrikethroughSpan stSpan = new StrikethroughSpan();
        ss.setSpan(stSpan, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        harga.setText(ss);
    }

    public void openMainView()
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}