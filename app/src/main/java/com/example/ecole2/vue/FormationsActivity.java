package com.example.ecole2.vue;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ecole2.R;
import com.example.ecole2.controleur.ControleFormation;
import com.example.ecole2.entite.Formation;

import java.util.List;

public class FormationsActivity extends RacineActivity implements AdapterView.OnItemClickListener {

    private static String TAG = "FormationsActivity";
    private ControleFormation controleFormation;
    private List<Formation> formations;
    private ListView liste;
    private FormationAdapter adapterFormation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formations);
        Log.i(TAG, "onCreate");
        controleFormation = ControleFormation.getInstance();
        creerListeFormations();
    }

    private void creerListeFormations() {
        formations = controleFormation.getFormations();
        Log.i(TAG, "creerListeFormations formations=" + formations);
        adapterFormation = new FormationAdapter(this, formations);
        liste = (ListView) findViewById(R.id.listView);
        liste.setAdapter(adapterFormation);
        liste.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Log.i(TAG,"onItemClick = " + position);
        controleFormation.setFormation(formations.get(position));
        Intent intent = new Intent(FormationsActivity.this, Formation2Activity.class);
        startActivity(intent);
        Log.i(TAG,"formations = " + formations.get(position));
    }
}