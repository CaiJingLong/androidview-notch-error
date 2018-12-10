package com.example.androidviewnotch;

import android.os.Bundle;

import com.example.androidviewnotch.view.MyAndroidView;

import io.flutter.app.FlutterActivity;
import io.flutter.plugin.platform.PlatformViewRegistry;

public class MainActivity extends FlutterActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PlatformViewRegistry platformViewRegistry = this.registrarFor("myview").platformViewRegistry();

        MyAndroidView.init(platformViewRegistry);
    }
}
