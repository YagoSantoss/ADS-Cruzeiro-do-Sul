package com.example.exerciciosaula07;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class FormularioActivity extends AppCompatActivity {

    private EditText senha, confirmarSenha;
    private Button botaoCriarSenha;
    private TextView mensagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        senha = findViewById(R.id.senha);
        confirmarSenha = findViewById(R.id.confirmar_senha);
        botaoCriarSenha = findViewById(R.id.botao_criar_senha);
        mensagem = findViewById(R.id.mensagem);

        botaoCriarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verificarSenhas();
            }
        });
    }

    private void verificarSenhas() {
        String senhaDigitada = senha.getText().toString();
        String senhaConfirmada = confirmarSenha.getText().toString();

        if (senhaDigitada.equals(senhaConfirmada)) {
            mensagem.setText("Sua senha foi criada com sucesso!");
            // Aqui você pode navegar para outra activity, se desejar
            // Intent intent = new Intent(FormularioActivity.this, OutraActivity.class);
            // startActivity(intent);
        } else {
            mensagem.setText("As senhas não combinam. Tente novamente!");
        }
    }
}
