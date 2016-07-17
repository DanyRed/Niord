package com.dany.niord;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.dany.niord.db.Invitado;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private ListView lvInvitados;
    private EditText etNombre;
    private EditText etApellido;
    private Button buttonGuardar;
    private Button buttonBorrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setUI();
        mostrarListaDeInvitados();
    }

    private void setUI(){
        setContentView(R.layout.activity_main);

        etNombre = (EditText) findViewById(R.id.etNombre);
        etApellido= (EditText) findViewById(R.id.etApellido);

        buttonGuardar = (Button) findViewById(R.id.buttonGuardar);
        buttonBorrar = (Button) findViewById(R.id.buttonBorrar);
        lvInvitados = (ListView) findViewById(R.id.lvInvitados);

        setOnClickListeners();
    }

    private void setOnClickListeners(){
        buttonGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = etNombre.getText().toString();
                String apellido = etApellido.getText().toString();

                if (nombre.isEmpty()){
                    Toast.makeText(MainActivity.this, "Nombre vacío", Toast.LENGTH_SHORT).show();
                } else {
                    etNombre.setText("");
                    etApellido.setText("");
                    crearInvitado(nombre,apellido);
                }
            }
        });

        buttonBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etNombre.setText("");
                etApellido.setText("");
                BorrarTodo();
            }
        });
    }

    private void crearInvitado(String nombre,String apellido){
        Invitado invitado = new Invitado();
        invitado.nombre = nombre;
        invitado.apellido = apellido;
        invitado.save();
        mostrarListaDeInvitados();
    }

    private void BorrarTodo(){
        Invitado.deleteAllInvitados();
        mostrarListaDeInvitados();
    }

    private void mostrarListaDeInvitados() {
        List<Invitado> invitados = Invitado.getAllInvitados();
        List<String> nombresArray = new ArrayList<>();

        for (Invitado invitado : invitados){

            String str=invitado.nombre+"-"+invitado.apellido;
            nombresArray.add(str);
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,  android.R.layout.simple_list_item_1, android.R.id.text1, nombresArray);
        lvInvitados.setAdapter(adapter);
    }
}
