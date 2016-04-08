package com.twosx.app.bannerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BannerLayout bannerLayout1 = (BannerLayout) findViewById(R.id.banner1);
        BannerLayout bannerLayout2 = (BannerLayout) findViewById(R.id.banner2);

        List<Integer> res = new ArrayList<>();
        res.add(R.drawable.lunbo1);
        res.add(R.drawable.lunbo2);
        res.add(R.drawable.lunbo3);
        List<String> titles = new ArrayList<>();
        titles.add("标题一");
        titles.add("标题二");
        titles.add("标题三");

        if (bannerLayout1 != null) {
            bannerLayout1.setViewRes(res, titles);
        }

        List<String> urls = new ArrayList<>();
        urls.add("http://www.ctsay.com/img/16/0321/56ef5ac94368c.jpeg");
        urls.add("http://www.ctsay.com/img/16/0331/56fc8af888536.jpg");
        urls.add("http://www.ctsay.com/img/16/0205/56b3f70240f6b.jpg");
        urls.add("http://www.ctsay.com/img/15/1215/566f81191b023.jpg");

        if (bannerLayout2 != null) {
            bannerLayout2.setViewUrls(urls, null);
            bannerLayout2.setOnBannerItemClickListener(new BannerLayout.OnBannerItemClickListener() {
                @Override
                public void onItemClick(int position) {
                    Toast.makeText(MainActivity.this, "position:" + position, Toast.LENGTH_SHORT).show();
                }
            });
        }


    }
}
