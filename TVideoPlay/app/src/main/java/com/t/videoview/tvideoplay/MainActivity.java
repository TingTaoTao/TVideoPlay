package com.t.videoview.tvideoplay;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.t.videoview.videoplay.widget.VideoPlayer;

public class MainActivity extends AppCompatActivity {

    private VideoPlayer mVp;
    private String mVideoUrl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//隐藏标题
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//设置全屏
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        Button btnCustom = (Button) findViewById(R.id.btn_custom);

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(MainActivity.this, ZZPlayerDemoActivity.class);
                startActivity(intent);
            }
        });
    }



//    @Override
//    public void onClick(View v) {
//        int id = v.getId();
//        Intent intent = null;
//        switch (id) {
//            case R.id.btn_custom:
//                intent = new Intent(this, ZZPlayerDemoActivity.class);
//                break;
//        }
//
//        if (intent != null) {
//            startActivity(intent);
//        }
//    }
}
