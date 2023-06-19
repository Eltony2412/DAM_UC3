    package com.example.dam_uc3_elberthluque;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

    public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Spinner spinnersexo;
    private Spinner spinnerDia;
    private Spinner spinnerMes;
    private Spinner spinnerAño;

    Button boton_regis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnersexo = findViewById(R.id.spinner_Sexo);
        spinnerDia = findViewById(R.id.spinner_dia);
        spinnerMes = findViewById(R.id.spinner_Mes);
        spinnerAño = findViewById(R.id.spinner_Año);

        String [] opcionesSexo = {"Masculino", "Femenino"};
        String [] opcionesDia = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String [] opcionesMes = {"Ene", "Feb", "Mar", "Abr", "May", "Jun", "Jul", "Ago", "Sep", "Oct", "Nov", "Dic"};
        String [] opcionesAño = {"2000", "1999", "1998", "1997", "1996"};

        //adapterSexo
        ArrayAdapter <String> adaptersexo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcionesSexo);
        spinnersexo.setAdapter(adaptersexo);

        //adapterDia
        ArrayAdapter <String> adapterdia = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcionesDia);
        spinnerDia.setAdapter(adapterdia);

        //adapterMes
        ArrayAdapter <String> adaptermes = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcionesMes);
        spinnerMes.setAdapter(adaptermes);

        //adapterAño
        ArrayAdapter <String> adapteraño = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, opcionesAño);
        spinnerAño.setAdapter(adapteraño);


        boton_regis = findViewById(R.id.button_registrarse);

        boton_regis.setOnClickListener(this);

    }

        @Override
        public void onClick(View view) {
            Toast.makeText(this, "Se envió sus datos", Toast.LENGTH_SHORT).show();
        }
    }