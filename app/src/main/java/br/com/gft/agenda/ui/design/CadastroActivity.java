package br.com.gft.agenda.ui.design;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import br.com.gft.agenda.R;
import br.com.gft.agenda.dao.AlunoDao;
import br.com.gft.agenda.model.Aluno;

public class CadastroActivity extends AppCompatActivity {

    public static final String TITULO_APPBAR = "Novo Aluno";
    private EditText etEmail;
    private EditText etNome;
    private EditText etPhone;
    final AlunoDao dao = new AlunoDao();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        setTitle(TITULO_APPBAR);
        inicializacaoCampos();
        configuraBotaoSalvar();
    }

    private void configuraBotaoSalvar() {
        Button btnCadastrar = findViewById(R.id.btn_activity_cadastro_salvar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Aluno aluno = criaAluno();
                salva(aluno);
            }
        });
    }

    private void inicializacaoCampos() {
        etEmail = findViewById(R.id.et__activity_cadastro_email);
        etNome = findViewById(R.id.et__activity_cadastro_nome);
        etPhone = findViewById(R.id.et__activity_cadastro_phone);
    }

    private void salva(Aluno aluno) {
        dao.salvar(aluno);
        finish();
    }

    private Aluno criaAluno() {
        String nome = etNome.getText().toString();
        String email = etEmail.getText().toString();
        String phone = etPhone.getText().toString();

        return new Aluno(nome, email, phone);
    }

}
