package com.example.concatenar_toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void concatenar(View view) {

        TextView nome1 = (TextView) findViewById(R.id.txtNome1);

        TextView nome2 = (TextView) findViewById(R.id.txtNome2);

        if (nome1.getText().toString().equals("") || nome2.getText().equals("")
        ) {
            AlertDialog.Builder a = new AlertDialog.Builder(this);

            a.setTitle("Erro de concatenação");

            a.setMessage("Nome não inserido");

            a.create().show();
        } else{
            Toast t = Toast.makeText(this, "Olá "+ nome1.getText()+" "+ nome2.getText(), Toast.LENGTH_SHORT);

            t.setGravity(Gravity.CENTER, 0, 0);

            t.show();
        }
    }
}