package de.webcodr.chartrack.CharacterViewActivity;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import de.webcodr.chartrack.Model.Hero;
import de.webcodr.chartrack.R;

public class HeroAdapter extends ArrayAdapter<Hero> {
    private Context context;
    private ArrayList<Hero> heroList;

    public HeroAdapter(Context context, ArrayList<Hero> heroList) {
        super(context, R.layout.hero_view, heroList);
        this.context = context;
        this.heroList = heroList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View heroView = inflater.inflate(R.layout.hero_view, parent, false);
        TextView txtCharacterName = (TextView) heroView.findViewById(R.id.txtCharacterName);
        TextView txtClassName = (TextView) heroView.findViewById(R.id.txtClassName);
        TextView txtCharacterLevel = (TextView) heroView.findViewById(R.id.txtCharacterLevel);
        Hero hero = heroList.get(position);

        txtCharacterName.setText(hero.getName());
        txtCharacterLevel.setText("Level " + hero.getLevel().toString());
        txtClassName.setText(hero.getClassName());

        return heroView;
    }
}
