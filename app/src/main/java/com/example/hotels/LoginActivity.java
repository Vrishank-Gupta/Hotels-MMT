package com.example.hotels;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.hotels.HotelHermes.DataItem;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    SignInButton btnSignIn;
    GoogleSignInClient mGoogleSignInClient;
    public static GoogleSignInAccount account;


    GoogleSignInOptions gso;
    public static List<DataItem> dataItemArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataItemArrayList = new ArrayList<>();
        btnSignIn = findViewById(R.id.btnGoogle);
        btnSignIn.setSize(SignInButton.SIZE_STANDARD);

        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();


        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);

        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        if(account != null) {

            startActivity(new Intent(LoginActivity.this, HotelsActivity.class));
            finish();
        }

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this, "Hello", Toast.LENGTH_SHORT).show();
                signIn();
            }
        });
    }

    private void signIn() {
        Intent signInIntent = mGoogleSignInClient.getSignInIntent();
        startActivityForResult(signInIntent, 1);
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }

    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            account = completedTask.getResult(ApiException.class);
            Log.d("myToken", "handleSignInResult: " + account.getId());
            startActivity(new Intent(LoginActivity.this, HotelsActivity.class));
            finish();



        } catch (ApiException e) {

            Log.w("GoogleLogin", "signInResult:failed code=" + e.getMessage());
            Toast.makeText(this, "Couldn't Login", Toast.LENGTH_SHORT).show();
        }
    }
}