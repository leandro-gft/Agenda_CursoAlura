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

import br.com.gft.agenda.dao.AlunoDao;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Lista de Alunos");

    }

    @Override
    protected void onResume() {
        super.onResume();
        ListView listaAlunos = findViewById(R.id.lvAlunos);
        AlunoDao dao = new AlunoDao();
        listaAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));

    }

    public void telaCadastro (View v){
        startActivity(new Intent(this, CadastroActivity.class));
    }
}
