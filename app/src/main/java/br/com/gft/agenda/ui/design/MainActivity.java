package br.com.gft.agenda.ui.design;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import br.com.gft.agenda.R;
import br.com.gft.agenda.dao.AlunoDao;

public class MainActivity extends AppCompatActivity {

    private final AlunoDao dao = new AlunoDao();
    private static final String TITULO_APPBAR = "Lista de Alunos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(TITULO_APPBAR);
    }

    @Override
    protected void onResume() {
        super.onResume();
        configuraLista();
    }

    private void configuraLista() {
        ListView listaAlunos = findViewById(R.id.lvAlunos);
        listaAlunos.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dao.todos()));
    }

    public void telaCadastro(View v) {
        abreCadastroActiviry();
    }

    private void abreCadastroActiviry() {
        startActivity(new Intent(this, CadastroActivity.class));
    }
}
