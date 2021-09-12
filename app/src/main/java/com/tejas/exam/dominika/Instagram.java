package com.tejas.exam.dominika;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.tejas.exam.R;

public class Instagram extends AppCompatActivity {

    WebView webview;
    ProgressBar pbar;

    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.instagram_page);

        webview = (WebView) findViewById(R.id.webView1);
        pbar = findViewById(R.id.progressBar1);
        webview.setWebViewClient(new WebViewClient());
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("https://www.instagram.com/mseb.exams/");
    }
    public class WebViewClient extends android.webkit.WebViewClient {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            pbar.setVisibility(View.GONE);
        }

    }
}
