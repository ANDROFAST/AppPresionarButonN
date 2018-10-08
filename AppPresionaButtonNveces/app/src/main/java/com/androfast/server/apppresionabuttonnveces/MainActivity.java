package com.androfast.server.apppresionabuttonnveces;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int clicContador =0;
    int maximo=3;
    Button btnOk;
    TextView mostrarContador;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mostrarContador =(TextView)findViewById(R.id.txtContador);
        btnOk=(Button)findViewById(R.id.btnOK);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               clicContador = clicContador +1;
                if(clicContador == maximo)
                {
                    //si el usuario hace los clic maximos aqui puede ejecutar
                    //su codigo por ejemplo un metodo, en este caso ejecutaremos un mensaje con un Toast
                    Toast.makeText(getApplicationContext(),"Perfecto presionaste "+maximo+" veces" , Toast.LENGTH_LONG).show();
                }
                mostrarContador.setText("Recuerda debes hacer "+ maximo+ " clics y vas"+ clicContador);
            }
        });

    }
}
