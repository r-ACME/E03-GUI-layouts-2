package br.ufmg.coltec.tp.e03_layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Forms extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.form);

        Button enviar = findViewById(R.id.btn_form_enviar);
        Button limpar = findViewById(R.id.btn_form_limpar);

        enviar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                AlertDialog.Builder confirmarEnvio = new AlertDialog.Builder(Forms.this);

                confirmarEnvio.setMessage(R.string.lbl_form_sent);
                confirmarEnvio.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText( Forms.this, R.string.lbl_form_sent_positivo, Toast.LENGTH_LONG).show();
                    }
                })
                .setNegativeButton(R.string.no, new DialogInterface.OnClickListener(){
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i){
                        Toast.makeText( Forms.this, R.string.lbl_form_sent_negativo, Toast.LENGTH_LONG).show();
                    }
                });

                AlertDialog dialog = confirmarEnvio.create();
                dialog.show();
            }
        });

        limpar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){

                AlertDialog.Builder confirmarDelecao = new AlertDialog.Builder(Forms.this);

                confirmarDelecao.setMessage(R.string.lbl_form_clear);
                confirmarDelecao.setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {

                                TextView name = findViewById(R.id.txt_form_name);
                                TextView email = findViewById(R.id.txt_form_email);
                                TextView comment = findViewById(R.id.txt_form_comment);
                                RadioGroup grade = findViewById(R.id.rg_form_grade);

                                name.setText(R.string.empty);
                                email.setText(R.string.empty);
                                comment.setText(R.string.empty);
                                grade.clearCheck();
                                Toast.makeText( Forms.this, R.string.lbl_form_clear_positivo, Toast.LENGTH_LONG).show();

                            }
                        })
                        .setNegativeButton(R.string.no, new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i){
                            }
                        });

                AlertDialog dialog = confirmarDelecao.create();
                dialog.show();
            }
        });
    }
}