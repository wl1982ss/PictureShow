package com.example.pictureshow;

import android.media.ImageReader;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.pictureshow.Util.GalleryFlow;
import com.example.pictureshow.Util.ImageAdapter;

public class MainActivity extends AppCompatActivity {
    private GalleryFlow gallery_flow;
    // 存放图片id的数组
    private int[]   imageIds;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 构造存放图片id的数组
        imageIds = new int[] {
                R.drawable.internet_pic,
                R.drawable.smile,
                R.drawable.smile_1,
                R.drawable.monitor_room
        };
        gallery_flow = (GalleryFlow) findViewById(R.id.gallery_flow);
        // 实例化ImageAdapter 对象
        ImageAdapter adapter = new ImageAdapter(this, imageIds);
        // 向图片数组中加载图片
        adapter.createRefectedBitmap();
        gallery_flow.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
