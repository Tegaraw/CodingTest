package com.example.tescodinghariini;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private Button btt1, btt2, btt3;
  Integer stok = 3;
  private TextView ttv1,ttv2,ttv3, tvhar1,tvhar2,tvhar3;
    private String KEY_NAME = "NAMA";
    private String KEY_HARGA = "HARGA";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btt1 = findViewById(R.id.pesan1);
        btt2 = findViewById(R.id.pesan2);
        btt3 = findViewById(R.id.pesan3);
        ttv1 = findViewById(R.id.tv1);
        ttv2 = findViewById(R.id.tv2);
        ttv3 = findViewById(R.id.tv3);
        tvhar1 = findViewById(R.id.tvharga1);
        tvhar2 = findViewById(R.id.tvharga2);
        tvhar3 = findViewById(R.id.tvharga3);

if(btt1.isClickable()){
    stok = 3-1;
    Toast.makeText(this, "Jumlah Stock Sisa 2", Toast.LENGTH_SHORT).show();

}else{
    if(btt2.isClickable()){
        stok = 3-1;
        Toast.makeText(this, "Jumlah Stock Sisa 2", Toast.LENGTH_SHORT).show();
    }else{
        if(btt3.isClickable()){
            stok = 3-1;
            Toast.makeText(this, "Jumlah Stock Sisa 3", Toast.LENGTH_SHORT).show();
        }
    }
}
if (stok == 0){
   btt1.setEnabled(false);
   btt2.setEnabled(false);
   btt3.setEnabled(false);
}
        btt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama = ttv1.getText().toString();
                String harga = tvhar1.getText().toString();
                Intent pesan1 = new Intent(MainActivity.this, Pesan.class);
                pesan1.putExtra(KEY_NAME, nama);
                pesan1.putExtra(KEY_HARGA, harga);
                startActivity(pesan1);


            }
        });
        btt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama2 = ttv2.getText().toString();
                String harga2 = tvhar2.getText().toString();
                Intent pesan2 = new Intent(MainActivity.this, Pesan.class);
                pesan2.putExtra(KEY_NAME, nama2);
                pesan2.putExtra(KEY_HARGA, harga2);
                startActivity(pesan2);
            }
        });
        btt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nama3 = ttv3.getText().toString();
                String harga3 = tvhar3.getText().toString();
                Intent pesan3 = new Intent(MainActivity.this, Pesan.class);
                pesan3.putExtra(KEY_NAME, nama3);
                pesan3.putExtra(KEY_HARGA, harga3);
                startActivity(pesan3);
            }
        });
    }
}