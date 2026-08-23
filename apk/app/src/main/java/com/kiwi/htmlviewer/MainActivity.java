package com.kiwi.htmlviewer;
import android.os.Bundle;import android.webkit.WebSettings;import android.webkit.WebView;import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity{private WebView w;private static final String URL="https://YOUR-BACKEND-URL.example.com/";public void onCreate(Bundle b){super.onCreate(b);w=new WebView(this);setContentView(w);WebSettings s=w.getSettings();s.setJavaScriptEnabled(true);s.setDomStorageEnabled(true);w.loadUrl(URL);}public void onBackPressed(){if(w.canGoBack())w.goBack();else super.onBackPressed();}}
