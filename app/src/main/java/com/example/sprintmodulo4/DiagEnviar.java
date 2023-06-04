package com.example.sprintmodulo4;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;



public class DiagEnviar extends DialogFragment{

    Button enviarBtn ;
    TextView mensaje;

    TextView nombre;
    TextView correo;
    public DiagEnviar(){

    }
    @Nullable
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState){

        return crearDialogo();
    }

    private Dialog crearDialogo(){
        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());

        LayoutInflater inflater=getActivity().getLayoutInflater();

        View v = inflater.inflate(R.layout.diag_enviar,null);
        builder.setView(v);

        enviarBtn = v.findViewById(R.id.Enviar);
        mensaje =v.findViewById(R.id.EditMensaje);




        enviarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(mensaje.length()==0){
                    Toast.makeText(getContext(),"Debe ingresar un mensaje",Toast.LENGTH_SHORT).show();
                } else if (mensaje.length()>50) {
                    Toast.makeText(getContext(),"Ingrese 50 o menos caracteres",Toast.LENGTH_SHORT).show();
                } else{
                    Toast.makeText(getContext(),"Mensaje enviado",Toast.LENGTH_SHORT).show();
                    dismiss();
                }

            }
        });


        return builder.create();
    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);

    }

    public View onCreteView (LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState){

        return inflater.inflate(R.layout.diag_enviar,container,false);
    }


}