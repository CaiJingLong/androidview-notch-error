package com.example.androidviewnotch.view;
/// create 2018/12/10 by cai


import android.content.Context;
import android.view.View;
import android.widget.TextView;

import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugin.platform.PlatformViewRegistry;

public class MyAndroidView {

    public static void init(PlatformViewRegistry platformViewRegistry) {
        platformViewRegistry.registerViewFactory("my-text", new MyTextViewFactory());
    }

    private static class MyTextViewFactory extends PlatformViewFactory {

        MyTextViewFactory() {
            super(new StandardMessageCodec());
        }

        @Override
        public PlatformView create(Context context, int i, Object o) {
            return new MyTextView(context);
        }
    }

    private static class MyTextView implements PlatformView {

        private Context context;

        MyTextView(Context context) {
            this.context = context;
        }

        @Override
        public View getView() {
            TextView textView = new TextView(context);
            textView.setText("this is text view");
            return textView;
        }

        @Override
        public void dispose() {

        }
    }
}