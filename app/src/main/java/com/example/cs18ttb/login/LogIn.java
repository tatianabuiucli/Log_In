package com.example.cs18ttb.login;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by cs18ttb on 19/01/2020.
 */

public class LogIn extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        String username = getIntent().getStringExtra("Username");
        TextView tv = (TextView)findViewById(R.id.tv);
        tv.setText(username);

    }
}
