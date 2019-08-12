package com.metro.help.tabactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class FourthFragment extends Fragment {

    public static final String ARG_PAGE = "ARG_PAGE";
    public int mPage;
    private WebView Webview;

        public static FourthFragment newInstance(int page) {
        Bundle args = new Bundle();
        args.putInt(ARG_PAGE, page);
        FourthFragment fourthFragment = new FourthFragment();
        fourthFragment.setArguments(args);
        return fourthFragment;

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_fourth, container, false);
        WebView webView = (WebView) rootView.findViewById(R.id.web_view);

        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        // 화면 줌 컨트롤과 제스처를 사용하여 확대
        webView.getSettings().setUseWideViewPort(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(true);
        webView.setInitialScale(200);

        webView.loadUrl("https://smss.seoulmetro.co.kr/traininfo/traininfoUserView.do");

        return rootView;

    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPage = getArguments().getInt(ARG_PAGE);
    }

    

}
