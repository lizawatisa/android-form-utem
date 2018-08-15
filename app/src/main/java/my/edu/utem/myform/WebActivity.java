package my.edu.utem.myform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        webView = findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); //buka kat app browser of current app
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("http://www.utem.edu.my");
    }

   //utk override if press back button dia pergi previous page yg kita pergi kt web site bkn previous activiti page
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
