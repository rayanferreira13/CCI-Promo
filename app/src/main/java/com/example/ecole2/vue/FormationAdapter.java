package com.example.ecole2.vue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.ecole2.R;
import com.example.ecole2.entite.Formation;

import java.util.List;


public class FormationAdapter extends BaseAdapter {
	private Context mContext;
	private List<Formation> mFormations;
	private LayoutInflater inflater;

	public FormationAdapter(Context c, List<Formation> ids) {
		mContext = c;
		mFormations = ids;
		inflater = LayoutInflater.from(c);
	}
	@Override
	public int getCount() {
		return mFormations.size();
	}
	@Override
	public Object getItem(int position) {
		return mFormations.get(position);
	}
	// Will get called to provide the ID that
	// is passed to OnItemClickListener.onItemClick()
	@Override
	public long getItemId(int position) {
		return position;
	}
	// Return an ImageView for each item referenced by the Adapter
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		TextView textIntitule;
		TextView textAcronyme;
		TextView intDureeMois;
        View view;

		TextView textDebut;
        Formation formation = mFormations.get(position);
        if(convertView==null) {
            view = inflater.inflate(R.layout.view_formation, null);
        }
        else {
            view = convertView;
        }
		textIntitule = (TextView) view.findViewById(R.id.formationIntitule);
		textIntitule.setText(formation.getIntitule());
		textAcronyme = (TextView) view.findViewById(R.id.formationAcronyme);
		textAcronyme.setText("Acronyme: " + formation.getAcronyme());
		intDureeMois = (TextView) view.findViewById(R.id.formationDureeMois);
		intDureeMois.setText("Durée: " + formation.getDureeMois());
        return view;
	}

}
