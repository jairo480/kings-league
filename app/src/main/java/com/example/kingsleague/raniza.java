package com.example.kingsleague;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import com.example.kingsleague.ui.menu.menuPantalla;

public class raniza extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.raniza);
        WebView webView = findViewById(R.id.webview);
        String video = "<iframe width=\"420\" height=\"246\" src=\"https://www.youtube.com/embed/PG-ec0Xxpfk?si=vrv_DsqNm1vkw3MU\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>";
        webView.loadData(video, "text/html","utf-8");
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());
    }
    public void menu(View View) {
        Intent siguiente = new Intent(this, menuPantalla.class);
        startActivity(siguiente);
    }
}
