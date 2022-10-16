package com.example.myprofile;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnMaps, btnPdf, btnCall, btnMail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMaps=findViewById(R.id.maps);
        btnPdf=findViewById(R.id.buttonMove);
        btnCall=findViewById(R.id.btnCall);
        btnMail=findViewById(R.id.email);
        String email = "111202113316@mhs.dinus.ac.id";
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent openMaps = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("https://goo.gl/maps/DMuDo2APLxt3csr77"));
                startActivity(openMaps);
            }
        });
        btnPdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivityCV.class);
                startActivity(i);
            }
        });
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = "081541193319";
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.fromParts("tel", number, null));
                startActivity(call);
            }
        });
        btnMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent kirim_mail = new Intent(Intent.ACTION_VIEW
                        , Uri.parse("mailto:"+ email));
                startActivity(kirim_mail);
            }
        });
    }
}