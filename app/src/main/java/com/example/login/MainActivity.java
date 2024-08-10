package com.example.login;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText Username, Password;
    private Button Login;
    private TextView UserLogin,UserLogin2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Username = findViewById(R.id.editTextText2);
        Password = findViewById(R.id.editTextTextPassword);
        Login = findViewById(R.id.button);
        UserLogin = findViewById(R.id.textView);
        UserLogin2 = findViewById(R.id.textView2);
        //Set click listener for the login button
        Login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                //Get Username and Password from EditText fields
                String s1 = Username.getText().toString().trim();
                String s2 = Password.getText().toString().trim();

                //Perform authentication (replace with authentication logic)
                if (isValidCredentials(s1, s2)) {
                    //Display success msg
                    UserLogin.setText("Login successful for " + s1);
                    UserLogin2.setText("Username:"+ s1 + " Password:" + s2);
                } else {
                    //Display error msg
                    UserLogin.setText("Incorrect Username or Password");
                    //UserLogin.setText(getResources().getColor(android.R.color.holo_red_dark));
                }

            }
        });
    }
    // Replace this with your actual authentication logic
    private boolean isValidCredentials(String s1, String s2){
        //Example: simple check for demonstration
        return s1.equals("Dhruv") && s2.equals("dhruv@123");
    }
}