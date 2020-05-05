package nosghi.com.nosghi.ui;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import nosghi.com.nosghi.R;

public class MainActivity extends AppCompatActivity {
    WebView nosghiWebView  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        nosghiWebView=findViewById(R.id.nosghiWebView);
        nosghiWebView.getSettings().setJavaScriptEnabled(true);
        nosghiWebView.setWebViewClient(new WebViewClient());
        nosghiWebView.loadUrl("https://www.nosghi.com/");

    }
}
