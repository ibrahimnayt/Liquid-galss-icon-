package com.ibrahimnayt.liquidglass;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TextView tv = new TextView(this);
        tv.setText("افتح تطبيق اللانشر (Nova/Lawnchair) واختر Theme > Liquid Glass Icons لتفعيل الأيقونات");
        tv.setPadding(40, 100, 40, 40);
        tv.setTextSize(16);
        setContentView(tv);
    }
}
