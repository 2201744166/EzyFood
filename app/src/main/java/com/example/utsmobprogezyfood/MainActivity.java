package com.example.utsmobprogezyfood;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StrikethroughSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button cartButton;
    private Button makanan;
    private Button minuman;
    private Button snack;
    private Button topup;
    private Button map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cartButton = findViewById(R.id.gotoCart);
        cartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCartView();
            }
        });
        minuman = findViewById(R.id.minuman);
        minuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMinuman();
            }
        });
        makanan = findViewById(R.id.makanan);
        makanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMakanan();
            }
        });
        snack = findViewById(R.id.snack);
        snack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSnack();
            }
        });
        topup = findViewById(R.id.topup);
        topup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTopup();
            }
        });
        map = findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();
            }
        });

        TextView harga = findViewById(R.id.harga);
        String hrg = "Rp. 2.400 Rp. 1.500";

        TextView harga2 = findViewById(R.id.harga2);
        String hrg2 = "Rp. 10.000 Rp. 7.000";

        TextView harga3 = findViewById(R.id.harga3);
        String hrg3 = "Rp. 10.000 Rp. 7.000";

        SpannableString ss = new SpannableString(hrg);
        SpannableString ss2 = new SpannableString(hrg2);
        SpannableString ss3 = new SpannableString(hrg3);

        StrikethroughSpan stSpan = new StrikethroughSpan();
        ss.setSpan(stSpan, 0, 9, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss2.setSpan(stSpan, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss3.setSpan(stSpan, 0, 10, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        harga.setText(ss);
        harga2.setText(ss2);
        harga3.setText(ss3);
    }

    public void openCartView()
    {
        Intent intent = new Intent(this, Cart.class);
        startActivity(intent);
    }
    public void openMinuman()
    {
        Intent intent = new Intent(this, Minuman.class);
        startActivity(intent);
    }
    public void openMakanan()
    {
        Intent intent = new Intent(this, Makanan.class);
        startActivity(intent);
    }
    public void openSnack()
    {
        Intent intent = new Intent(this, Snack.class);
        startActivity(intent);
    }

    public void openTopup()
    {
        Intent intent = new Intent(this, TopUp.class);
        startActivity(intent);
    }

    public void openMap()
    {
        Intent intent = new Intent(this, Map.class);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }


}