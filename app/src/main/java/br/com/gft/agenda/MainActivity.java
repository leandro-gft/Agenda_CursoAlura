package br.com.gft.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Alunos");

        ListView listaAlunos = findViewById(R.id.lvAlunos);

        List<String> alunos = new ArrayList<>(Arrays.asList("Alex", "Fran", "Jose", "Leandro", "Ana"));

        listaAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, alunos));
    }

    public void telaCadastro (View v){
        startActivity(new Intent(this, CadastroActivity.class));
    }
}
