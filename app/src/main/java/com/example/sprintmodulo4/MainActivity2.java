package com.example.sprintmodulo4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import com.example.sprintmodulo4.databinding.ActivityMain2Binding;
import java.net.URI;

public class MainActivity2 extends AppCompatActivity {
    private ActivityMain2Binding mBinding;
    Context context;
    String url1="https://www.linkedin.com/feed/";
    String url2="https://github.com/0swald06?tab=repositories";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding=ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());


        context = this;
        mBinding.linkBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//Implementacion de un iten implicito que manda a una URL
            Uri link = Uri.parse(url1);
            Intent i= new Intent(Intent.ACTION_VIEW,link);
                Log.d("Prueba", "Prueba de funcionamiento del intent en la activity segundaria ");
            startActivity(i);
            }
        });

        mBinding.whsBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
//Implementacion de un iten implicito que manda a una URL
                Uri link = Uri.parse(url2);
                Intent i= new Intent(Intent.ACTION_VIEW,link);
                startActivity(i);
            }
        });

        mBinding.Contactar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                DiagEnviar diagEnviar=new DiagEnviar();
                diagEnviar.show(getSupportFragmentManager(),"DiagEnviar");


            }

        });
        mBinding.btnRegresar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (MainActivity2.this, MainActivity.class);
                startActivity(intent);



            }

        });

    }


}
