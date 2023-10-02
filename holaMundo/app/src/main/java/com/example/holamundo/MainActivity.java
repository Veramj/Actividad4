package com.example.holamundo;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etN1;
    private EditText etN2;
    private EditText etN3;
    private TextView mayor;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etN1 = findViewById(R.id.etN1);
        etN2 = findViewById(R.id.etN2);
        etN3 = findViewById(R.id.etN3);

        mayor = findViewById(R.id.tvMayor);
    }

    public void mayorDe3(View view)
    {
        // Obtener los valores ingresados en los EditText como strings
        String strN1 = etN1.getText().toString();
        String strN2 = etN2.getText().toString();
        String strN3 = etN3.getText().toString();
        if(strN1 == null || strN2 == null || strN3 == null){
            mayor.setText("Ingresa un numero en cada campo");
        }
        // Convertir los strings a números (suponiendo que son enteros)
        int n1 = Integer.parseInt(strN1);
        int n2 = Integer.parseInt(strN2);
        int n3 = Integer.parseInt(strN3);


        // Comparar los números
        if (n1 > n2 && n1 > n3) {
            // mayor n1
            mayor.setText("El numero mayor es el numero: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            // mayor n2
            mayor.setText("El numero mayor es el numero: " + n2);
        } else if (n3 > n1 && n3 > n2) {
            // mayor n3
            mayor.setText("El numero mayor es el numero: " + n3);
        }
    }

}