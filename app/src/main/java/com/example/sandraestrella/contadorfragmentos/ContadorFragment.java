package com.example.sandraestrella.contadorfragmentos;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
/**
 * Created by sandra estrella on 18/12/2017.
 */

public class ContadorFragment {
    EditText mConteo;
    int x = 0;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_contador,container,false);

        mBotonContar = (Button) v.findViewById(R.id.boton_contar);
        mBotonLimpiar = (Button) v.findViewById(R.id.boton_limpiar);
        mConteo = (EditText) v.findViewById(R.id.campo_conteo);

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                x++;
                mConteo.setText("" +x);
            }
        });
        mBotonLimpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                x = 0;
                mConteo.setText("" +x);
            }
        });

        return v;
    }
}
