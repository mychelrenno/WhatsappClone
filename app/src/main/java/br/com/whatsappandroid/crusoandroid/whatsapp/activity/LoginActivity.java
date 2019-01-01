package br.com.whatsappandroid.crusoandroid.whatsapp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

import br.com.whatsappandroid.crusoandroid.whatsapp.R;

public class LoginActivity extends AppCompatActivity {

    private EditText nome;
    private EditText codPais;
    private EditText codArea;
    private EditText telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nome = findViewById(R.id.edit_nome);
        codPais = findViewById(R.id.edit_cod_pais);
        codArea = findViewById(R.id.edit_cod_area);
        telefone = findViewById(R.id.edit_telefone);

        SimpleMaskFormatter smfCodPais = new SimpleMaskFormatter("+NN");
        MaskTextWatcher mtwCodPais = new MaskTextWatcher(codPais, smfCodPais);
        codPais.addTextChangedListener(mtwCodPais);

        SimpleMaskFormatter smfCodArea = new SimpleMaskFormatter("(NN)");
        MaskTextWatcher mtwCodArea = new MaskTextWatcher(codArea, smfCodArea);
        codArea.addTextChangedListener(mtwCodArea);

        SimpleMaskFormatter smfTelefone = new SimpleMaskFormatter("NNNNN-NNNN");
        MaskTextWatcher mtwTelefone = new MaskTextWatcher(telefone, smfTelefone);
        telefone.addTextChangedListener(mtwTelefone);
    }
}
