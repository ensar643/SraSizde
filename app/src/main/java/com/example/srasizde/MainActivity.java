package com.example.srasizde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editTextYas,editTextMaas;
    Button btnGonder;
    TextView txtGoster;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextYas = findViewById(R.id.editTextYas);
        editTextMaas = findViewById(R.id.editTextMaas);
        btnGonder = findViewById(R.id.btnGonder);
        txtGoster = findViewById(R.id.txtGoster);

        btnGonder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int yas = Integer.parseInt(editTextYas.getText().toString());
                int maas = Integer.parseInt(editTextMaas.getText().toString());
                Personel personel = new Personel();
                personel.setYas(yas);
                personel.setMaas(maas);
                txtGoster.setText("Yaş:"+personel.getYas() +" Maaş:"+ personel.getMaas());
            }
        });
    }
}