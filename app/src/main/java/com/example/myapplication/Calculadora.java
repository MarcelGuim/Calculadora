package com.example.myapplication;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {
    TextView textView;
    Button buttonC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculadora);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        textView = findViewById(R.id.resultado);
    }
    float numActual = 0;

    float numEntrado = 0;
    boolean hayOperacion = false;
    boolean sumar = false;
    boolean restar = false;
    boolean multiplicar = false;
    boolean dividir = false;
    float resultado = 0;

    public void setValor1(View v)
    {
        if (hayOperacion)
        {
            numEntrado = 1;
        }
        else
        {
            numActual = 1;
        }
    }
    public void setValor2(View v)
    {
        if (hayOperacion)
        {
            numEntrado = 2;
        }
        else
        {
            numActual = 2;
        }
    }
    public void setValor3(View v)
    {
        if (hayOperacion)
        {
            numEntrado = 3;
        }
        else
        {
            numActual = 3;
        }
    }
    public void setValor4(View v)
    {
        if (hayOperacion)
        {
            numEntrado = 4;
        }
        else
        {
            numActual = 4;
        }
    }
    public void setValor5(View v)
    {
        if (hayOperacion)
        {
            numEntrado = 5;
        }
        else
        {
            numActual = 5;
        }
    }
    public void setValor6(View v)
    {
        if (hayOperacion)
        {
            numEntrado = 6;
        }
        else
        {
            numActual = 6;
        }
    }
    public void setValor7(View v)
    {
        if (hayOperacion)
        {
            numEntrado = 7;
        }
        else
        {
            numActual = 7;
        }
    }
    public void setValor8(View v)
    {
        if (hayOperacion)
        {
            numEntrado = 8;
        }
        else
        {
            numActual = 8;
        }
    }
    public void setValor9(View v)
    {
        if (hayOperacion)
        {
            numEntrado = 9;
        }
        else
        {
            numActual = 9;
        }
    }
    public void setValor0(View v)
    {
        if (hayOperacion) {
            numEntrado = 0;
        } else {
            numActual = 0;
        }
    }
    public void setC(View v)
    {
        numEntrado = 0;
    }
    public void setAC(View v){
        hayOperacion = false;
        numEntrado = 0;
        numActual = 0;
    }
    public void Error(View v) {
        textView.setText("Error, boton decorativo");
    }
    public void Dividir(View v)
    {
        hayOperacion = true;
        dividir = true;
        sumar = false;
        restar = false;
        multiplicar = false;
    }
    public void Sumar(View v)
    {
        hayOperacion = true;
        dividir = false;
        sumar = true;
        restar = false;
        multiplicar = false;
    }
    public void Restar(View v)
    {
        hayOperacion = true;
        dividir = false;
        sumar = false;
        restar = true;
        multiplicar = false;
    }
    public void Multiplicar(View v)
    {
        hayOperacion = true;
        dividir = false;
        sumar = false;
        restar = false;
        multiplicar = true;
    }
    public void PonResultado(View v){
        if (!hayOperacion)
        {
            textView.setText("Error, no hay operacion");
        }
        else
        {
           if(sumar)
           {
               resultado = numActual + numEntrado;
               textView.setText(String.valueOf(resultado));
               numActual = resultado;
               hayOperacion = false;
           }
           else if(restar)
           {
               resultado = numActual - numEntrado;
               textView.setText(String.valueOf(resultado));
               numActual = resultado;
               hayOperacion = false;
           }
           else if(multiplicar)
           {
               resultado = numActual*numEntrado;
               textView.setText(String.valueOf(resultado));
               numActual = resultado;
               hayOperacion = false;
           }
           else if(dividir)
           {
               resultado = numActual/numEntrado;
               textView.setText(String.valueOf(resultado));
               numActual = resultado;
               hayOperacion = false;
           }
        }
    }

}
