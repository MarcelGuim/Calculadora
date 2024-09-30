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
import android.widget.CheckBox;
import android.widget.TextView;


public class Calculadora extends AppCompatActivity implements View.OnClickListener{
    TextView textView;


    CheckBox radians, degrees;
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
        Button btn1 = findViewById(R.id.b1);
        Button btn2 = findViewById(R.id.b2);
        Button btn3 = findViewById(R.id.b3);
        Button btn4 = findViewById(R.id.b4);
        Button btn5 = findViewById(R.id.b5);
        Button btn6 = findViewById(R.id.b6);
        Button btn7 = findViewById(R.id.b7);
        Button btn8 = findViewById(R.id.b8);
        Button btn9 = findViewById(R.id.b9);
        Button btn0 = findViewById(R.id.b0);
        Button btnC = findViewById(R.id.C);
        Button btnAC = findViewById(R.id.AC);
        Button btnMult = findViewById(R.id.multiplicar);
        Button btnRest = findViewById(R.id.resta);
        Button btnSuma = findViewById(R.id.suma);
        Button btnDiv = findViewById(R.id.dividir);
        Button btnSin = findViewById(R.id.sin);
        Button btnCos = findViewById(R.id.cos);
        Button btnTan = findViewById(R.id.tan);
        Button btnIgual = findViewById(R.id.igual);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn0.setOnClickListener(this);
        btnC.setOnClickListener(this);
        btnAC.setOnClickListener(this);
        btnMult.setOnClickListener(this);
        btnSuma.setOnClickListener(this);
        btnDiv.setOnClickListener(this);
        btnRest.setOnClickListener(this);
        btnSin.setOnClickListener(this);
        btnCos.setOnClickListener(this);
        btnTan.setOnClickListener(this);
        btnIgual.setOnClickListener(this);


        textView = findViewById(R.id.resultado);
        radians = findViewById(R.id.radians);
        degrees = findViewById(R.id.degrees);
    }
    double numActual = 0;

    double numEntrado = 0;
    boolean hayOperacion = false;
    boolean sumar = false;
    boolean restar = false;
    boolean multiplicar = false;
    boolean dividir = false;
    boolean sin = false;
    boolean cos = false;
    boolean tan = false;
    double resultado = 0;

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.b1) {
            if (hayOperacion) {
                numEntrado = 1;
            } else {
                numActual = 1;
            }
        }
        else if (id == R.id.b2) {
            if (hayOperacion) {
                numEntrado = 2;
            } else {
                numActual = 2;
            }
        }
        else if (id == R.id.b3) {
            if (hayOperacion) {
                numEntrado = 3;
            } else {
                numActual = 3;
            }
        }
        else if (id == R.id.b4) {
            if (hayOperacion) {
                numEntrado = 4;
            } else {
                numActual = 4;
            }
        }
        else if (id == R.id.b5) {
            if (hayOperacion) {
                numEntrado = 5;
            } else {
                numActual = 5;
            }
        }
        else if (id == R.id.b6) {
            if (hayOperacion) {
                numEntrado = 6;
            } else {
                numActual = 6;
            }
        }
        else if (id == R.id.b7) {
            if (hayOperacion) {
                numEntrado = 7;
            } else {
                numActual = 7;
            }
        }
        else if (id == R.id.b8) {
            if (hayOperacion) {
                numEntrado = 8;
            } else {
                numActual = 8;
            }
        }
        else if (id == R.id.b9) {
            if (hayOperacion) {
                numEntrado = 9;
            } else {
                numActual = 9;
            }
        }
        else if (id == R.id.b0) {
            if (hayOperacion) {
                numEntrado = 0;
            } else {
                numActual = 0;
            }
        }
        else if (id == R.id.C)
        {
            numEntrado = 0;
        }
        else  if (id == R.id.AC)
        {
            hayOperacion = false;
            numEntrado = 0;
            numActual = 0;
        }
        else if (id == R.id.multiplicar)
        {
            hayOperacion = true;
            dividir = false;
            sumar = false;
            restar = false;
            multiplicar = true;
            sin = false;
            cos = false;
            tan = false;
        }
        else if (id == R.id.dividir)
        {
            hayOperacion = true;
            dividir = true;
            sumar = false;
            restar = false;
            multiplicar = false;
            sin = false;
            cos = false;
            tan = false;
        }
        else if (id == R.id.resta)
        {
            hayOperacion = true;
            dividir = false;
            sumar = false;
            restar = true;
            multiplicar = false;
            sin = false;
            cos = false;
            tan = false;
        }
        else  if (id == R.id.suma)
        {
            hayOperacion = true;
            dividir = false;
            sumar = true;
            restar = false;
            multiplicar = false;
            sin = false;
            cos = false;
            tan = false;
        }
        else if (id == R.id.sin)
        {
            hayOperacion = true;
            dividir = false;
            sumar = false;
            restar = false;
            multiplicar = false;
            sin = true;
            cos = false;
            tan = false;
            numEntrado = numActual;
        }
        else if (id == R.id.cos)
        {
            hayOperacion = true;
            dividir = false;
            sumar = false;
            restar = false;
            multiplicar = false;
            sin = cos;
            cos = true;
            tan = false;
            numEntrado = numActual;
        }
        else if (id == R.id.tan)
        {
            hayOperacion = true;
            dividir = false;
            sumar = false;
            restar = false;
            multiplicar = false;
            sin = false;
            cos = false;
            tan = true;
            numEntrado = numActual;
        }
        else if (id == R.id.igual)
        {
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
           else if (sin)
           {
               if(radians.isChecked())
               {
                   resultado = Math.sin(numEntrado);
                   textView.setText(String.valueOf(resultado));
                   numActual = resultado;
                   hayOperacion = false;

               }
               else if(degrees.isChecked())
               {
                   resultado = Math.sin(numEntrado*Math.PI/180);
                   textView.setText(String.valueOf(resultado));
                   numActual = resultado;
                   hayOperacion = false;

               }
               else
               {
                   textView.setText("Marca grados o radianes");
                   numActual = resultado;
               }
           }
           else if (cos)
           {
               if(radians.isChecked())
               {
                   resultado = Math.cos(numEntrado);
                   textView.setText(String.valueOf(resultado));
                   numActual = resultado;
                   hayOperacion = false;

               }
               else if(degrees.isChecked())
               {
                   resultado = Math.cos(numEntrado*Math.PI/180);
                   textView.setText(String.valueOf(resultado));
                   numActual = resultado;
                   hayOperacion = false;

               }
               else
               {
                   textView.setText("Marca grados o radianes");
                   numActual = resultado;
               }
           }
           else if (tan)
           {
               if(radians.isChecked())
               {
                   resultado = Math.tan(numEntrado);
                   textView.setText(String.valueOf(resultado));
                   numActual = resultado;
                   hayOperacion = false;

               }
               else if(degrees.isChecked())
               {
                   resultado = Math.tan(numEntrado*Math.PI/180);
                   textView.setText(String.valueOf(resultado));
                   numActual = resultado;
                   hayOperacion = false;

               }
               else
               {
                   textView.setText("Marca grados o radianes");
                   numActual = resultado;
               }
           }

        }
        }

    }
}