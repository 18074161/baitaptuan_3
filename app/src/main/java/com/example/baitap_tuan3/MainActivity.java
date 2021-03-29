package com.example.baitap_tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btnXanh, btnDo, btnDen, btnBac;
    TextView txtMau, txtHang, txtNCC, txtGia;
    ImageView imgVIew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_2);
        Anhxa();
        btnXanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtGia.setText("80.000 đ");
                txtMau.setText("Mau: Xanh");
                imgVIew.setImageResource(R.drawable.vs_bac);
            }
        });
        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtGia.setText("80.000 đ");
                txtMau.setText("Mau: Đỏ");
                imgVIew.setImageResource(R.drawable.vs_red_a);
            }
        });
        btnDen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtGia.setText("80.000 đ");
                txtMau.setText("Mau: Đen");
                imgVIew.setImageResource(R.drawable.vsmart_black_star);
            }
        });
        btnBac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtGia.setText("80.000 đ");
                txtMau.setText("Mau: Bac");
                imgVIew.setImageResource(R.drawable.vsmart_live_xanh);
            }
        });


    }
    public void Anhxa(){
        btnXanh = findViewById(R.id.button3);
        btnDo = findViewById(R.id.button4);
        btnDen = findViewById(R.id.button5);
        btnBac = findViewById(R.id.button6);
        txtMau = findViewById(R.id.textView7);
        txtHang = findViewById(R.id.textView7);
        txtNCC = findViewById(R.id.textView8);
        txtGia = findViewById(R.id.textView9);
        imgVIew = findViewById(R.id.imageView2);
    }
}