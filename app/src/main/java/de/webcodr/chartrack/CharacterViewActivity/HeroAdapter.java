package de.webcodr.chartrack.CharacterViewActivity;


import android.content.Context;
import android.util.Log;
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

    static class ViewHolder {
        public TextView characterName;
        public TextView characterLevel;
        public TextView className;
    }

    public HeroAdapter(Context context, ArrayList<Hero> heroList) {
        super(context, R.layout.hero_view, heroList);
        this.context = context;
        this.heroList = heroList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View heroView = getHeroView(convertView, parent);
        setCharacterInformation((ViewHolder) heroView.getTag(), heroList.get(position));

        return heroView;
    }

    private View getHeroView(View convertView, ViewGroup parent) {
        View heroView = convertView;

        if (heroView == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            heroView = inflater.inflate(R.layout.hero_view, parent, false);
            ViewHolder viewHolder = getViewHolder(heroView);

            heroView.setTag(viewHolder);
        }

        return heroView;
    }

    private ViewHolder getViewHolder(View heroView) {
        ViewHolder viewHolder = new ViewHolder();
        viewHolder.characterName = (TextView) heroView.findViewById(R.id.txtCharacterName);
        viewHolder.characterLevel = (TextView) heroView.findViewById(R.id.txtCharacterLevel);
        viewHolder.className = (TextView) heroView.findViewById(R.id.txtClassName);

        return viewHolder;
    }

    private void setCharacterInformation(ViewHolder viewHolder, Hero hero) {
        viewHolder.characterName.setText(hero.getName());
        viewHolder.characterLevel.setText("Level " + hero.getLevel().toString());
        viewHolder.className.setText(hero.getClassName());
    }
}
