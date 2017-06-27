package com.example.bhagya.contentcheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class webViewActivity extends AppCompatActivity {
WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        webView= (WebView) findViewById(R.id.webview);
      webView.loadUrl("http://soundbible.com/suggest.php?q=tick+tick&x=0&y=0");
       // webView.loadUrl("file:///android_asset/testHtml.html");
        webView.setWebViewClient(new WebViewClient()
        {
            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                findViewById(R.id.progress).setVisibility(View.GONE);
            }
        });




    }

}
