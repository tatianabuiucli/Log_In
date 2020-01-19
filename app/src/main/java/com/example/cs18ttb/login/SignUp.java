package com.example.cs18ttb.login;

import android.app.Activity;
import android.app.Notification;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by cs18ttb on 19/01/2020.
 */

public class SignUp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }

    public void signUpClick(View view){

        if(view.getId()==R.id.signUpButton){
            EditText name = (EditText)findViewById(R.id.name);
            EditText email = (EditText)findViewById(R.id.email);
            EditText username = (EditText)findViewById(R.id.username);
            EditText password = (EditText)findViewById(R.id.password);
            EditText password2 = (EditText)findViewById(R.id.password2);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String usernamestr=  username.getText().toString();
            String passwordstr = password.getText().toString();
            String password2str = password2.getText().toString();

            if(!passwordstr.equals(password2str)){
                //popup message

                Toast.makeText(this, "Passwords dont match", Toast.LENGTH_SHORT).show();
            }


        }


    }


}
