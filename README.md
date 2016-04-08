# BannerDemo
Android自定义广告轮播图

#### 自定义的RelativeLayout，配合Glide 实现本地以及网络图片的加载

#### 效果：


#### 使用方法：

1. 将BannerLayout以及res/values/attr.xml 两个文件复制到项目中。
2. 在build.gradle中添加对Glide 的引用：
> compile 'com.github.bumptech.glide:glide:3.7.0'

3. 布局文件中添加bannerlayout,设置相应的属性
```xml
  <com.twosx.app.bannerdemo.BannerLayout
    android:id="@+id/banner1"
    android:layout_width="match_parent"
    android:layout_height="180dp"
    app:defaultImage="@mipmap/ic_launcher"
    app:indicatorMargin="10dp"
    app:indicatorShape="oval"
    app:indicatorSpace="2dp"
    app:scrollDuration="1100"
    app:selectedIndicatorColor="?attr/colorPrimary"
    app:selectedIndicatorHeight="6dp"
    app:selectedIndicatorWidth="6dp"
    app:titleColor="#ff0000"
    app:unSelectedIndicatorColor="#99ffffff"
    app:unSelectedIndicatorHeight="6dp"
    app:unSelectedIndicatorWidth="6dp"/>
```
  
4. 在activity中添加图片||标题||点击事件。（具体可参考代码中的MainActivity）
```java
  // 加载本地图片以及标题 
  BannerLayout bannerLayout1 = (BannerLayout) findViewById(R.id.banner1);
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
  
  // ------------------分割线----------------------
  
  // 加载网络图片，标题可空，添加点击事件
  BannerLayout bannerLayout2 = (BannerLayout) findViewById(R.id.banner2);
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
  
```


