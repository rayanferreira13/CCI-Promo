package com.example.ecole2.vue;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.example.ecole2.R;
import com.example.ecole2.controleur.ControleFormation;
import com.example.ecole2.controleur.ControleurMessage;


public class MessageActivity extends RacineActivity {
    private static String TAG = "AccueilActivity";
    private ImageView imageView;
    private ControleFormation controleFormation;
    private ControleurMessage controleurMessage;

    EditText editMail;
    EditText editMessage;
    EditText editNom;
    EditText editPrenom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        controleFormation = ControleFormation.getInstance();
        controleurMessage = ControleurMessage.getInstance();
        Log.i(TAG, "onCreate");
        Button btnMsg=(Button)findViewById(R.id.envoyerMessage);
        btnMsg.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"Bouton message");
                editMail = (EditText) findViewById(R.id.editEmail);
                editMessage = (EditText) findViewById(R.id.editMessage);
                editNom = (EditText) findViewById(R.id.editNom);
                editPrenom = (EditText) findViewById(R.id.editPrenom);
                controleurMessage.postMessage(editMail.getText().toString(), editMessage.getText().toString(), editNom.getText().toString(), editPrenom.getText().toString(), MessageActivity.this);
            }
        });
    }
}