package br.com.gft.agenda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.ArrayList;
import java.util.List;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        setTitle("Novo Aluno");

        final EditText etEmail = findViewById(R.id.et__activity_cadastro_email);
        final EditText etNome = findViewById(R.id.et__activity_cadastro_nome);
        final EditText etPhone = findViewById(R.id.et__activity_cadastro_phone);

        Button btnCadastrar = findViewById(R.id.btn_activity_cadastro_salvar);
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nome = etNome.getText().toString();
                String email = etEmail.getText().toString();
                String phone = etPhone.getText().toString();

                Aluno aluno = new Aluno(nome, email, phone);
                Toast.makeText(CadastroActivity.this, aluno.getNome() +" - "+ aluno.getEmail() +" - "+ aluno.getPhone(), Toast.LENGTH_SHORT).show();

            }
        });

    }

}
