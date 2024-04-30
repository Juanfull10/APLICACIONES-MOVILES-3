package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private static EditText cuadroCedula;
    private static EditText cuadroPassword;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    public void init(){

        cuadroCedula = findViewById(R.id.editTextText);
        cuadroPassword=findViewById(R.id.editTextText2);

    }

    public static EditText getCuadroCedula() {
        return cuadroCedula;
    }

    public static EditText getCuadroPassword() {
        return cuadroPassword;
    }



}