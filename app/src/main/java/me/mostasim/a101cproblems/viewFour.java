package me.mostasim.a101cproblems;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class viewFour extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_four);

        WebView wv= (WebView)findViewById(R.id.wvFour);
        wv.loadUrl("file:///android_asset/view4.html");
    }
}