package com.example.tescodinghariini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Pesan extends AppCompatActivity {
    private String nama,harga;
    private String KEY_NAME = "NAMA";
    private String KEY_HARGA = "HARGA";
    private TextView ttv21, ttv22;
    private EditText edtt1;
    private Button but1;

    int i = 2000;
    int h = 5000;
    int j = 10000;
    int k = 20000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);
        ttv21 = findViewById(R.id.tv1ly2);
        ttv22 = findViewById(R.id.tv2ly2);
        but1 = findViewById(R.id.bunt1);
        edtt1 = findViewById(R.id.edt2);

        Bundle extras = getIntent().getExtras();
        nama = extras.getString(KEY_NAME);
        harga = extras.getString(KEY_HARGA);
        ttv21.setText(nama);
        ttv22.setText(harga);

       but1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String lamasw = edtt1.getText().toString().trim();
               double lm = Double.parseDouble(lamasw);
               if(lm == i ){
                   Intent sa = new Intent(Pesan.this, code.class);
                   startActivity(sa);
               }else{
                   if(lm == h){
                       Intent sa = new Intent(Pesan.this, code.class);
                       startActivity(sa);
                   }else{
                       if(lm == j){
                           Intent sa = new Intent(Pesan.this, code.class);
                           startActivity(sa);
                       }else{
                           if(lm == k){
                               Intent sa = new Intent(Pesan.this, code.class);
                               startActivity(sa);
                           }
                           else{
                               if(lm <i){
                                   Toast.makeText(Pesan.this, "Tidak Sesuai", Toast.LENGTH_SHORT).show();
                               }else{
                                   if(lm < h){
                                       Toast.makeText(Pesan.this, "Tidak Sesuai", Toast.LENGTH_SHORT).show();
                                   }else{
                                       if(lm < j){
                                           Toast.makeText(Pesan.this, "Tidak Sesuai", Toast.LENGTH_SHORT).show();
                                       }else{
                                           if(lm < k){
                                               Toast.makeText(Pesan.this, "Tidak Sesuai", Toast.LENGTH_SHORT).show();
                                           }
                                       }
                                   }
                               }


                           }
                       }
                   }
               }

           }
       });

    }
}