package com.example.myprofile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.github.barteksc.pdfviewer.PDFView;

public class MainActivityCV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_cv);
        PDFView pdfView = findViewById(R.id.pdfv);
        pdfView.fromAsset("MyCV.pdf").load();
    }

}