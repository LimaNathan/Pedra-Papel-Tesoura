package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void selecionarPedra(View view){
        this.opcaoSelecionada("Pedra");
    }

    public void selecionarPapel(View view){
        this.opcaoSelecionada("Papel");
    }

    public void selecionarTesoura(View view){
        this.opcaoSelecionada("Tesoura");
    }


    public void opcaoSelecionada(String opcaoSelecionada){

        ImageView imageResultado = findViewById(R.id.imageResultado);

        int numero = new Random().nextInt(3); // ira gerar 0 1 2
        String[] opcoes = {"Pedra", "Papel", "Tesoura"}; //pedra = 0, papel = 1, tesoura = 2
        String opcaoApp = opcoes [ numero ];

        switch(opcaoApp){

            case "Pedra":
                imageResultado.setImageResource(R.drawable.pedra);

                break;

            case "Papel":
                imageResultado.setImageResource(R.drawable.papel);
                break;

            case "Tesoura":
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        System.out.println("Item selecionado: " + opcaoApp);

    }
}