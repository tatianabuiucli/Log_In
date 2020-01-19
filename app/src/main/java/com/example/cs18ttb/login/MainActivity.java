package com.example.cs18ttb.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View view){

        if(view.getId() == R.id.loginButton){

            EditText username = (EditText) findViewById(R.id.username);
            String str = username.getText().toString();

            EditText password = (EditText)findViewById(R.id.password);
            String pswstr = password.getText().toString();

            if(str.isEmpty() || pswstr.isEmpty()){
                Toast.makeText(this, "Enter user name", Toast.LENGTH_SHORT).show();
            } else{
                Intent i = new Intent(this, LogIn.class);

                i.putExtra("Username",str);
                startActivity(i);
            }

        }

        if(view.getId()==R.id.signUpButton){
            Intent i = new Intent(this, SignUp.class);

            startActivity(i);

        }


    }
}
