package com.clearsky77.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebChromeClient
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        webView.settings.javaScriptEnabled = true // 자바스크립트 허용

        /* 웹뷰에서 새 브라우저로 열지 않도록 */
        webView.webViewClient = WebViewClient()
        webView.webChromeClient = WebChromeClient()

        webView.loadUrl("https://www.naver.com")
    }

    override fun onBackPressed() {
        if(webView.canGoBack()){ // 이전 페이지가 있었다면
            webView.goBack() // 이전 페이지로 돌아가라
        }else {
            super.onBackPressed() // 그렇지 않으면 앱 종료
        }
    }
}