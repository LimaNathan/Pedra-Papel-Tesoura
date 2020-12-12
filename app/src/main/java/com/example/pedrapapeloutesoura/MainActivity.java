package com.example.pedrapapeloutesoura;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

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

        System.out.println("Item selecionado: " + opcaoSelecionada);

    }
}