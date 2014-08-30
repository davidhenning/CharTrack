package de.webcodr.chartrack;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

import java.util.ArrayList;

import de.webcodr.chartrack.BlizzardApi.Client;
import de.webcodr.chartrack.Model.CharacterProfile;
import de.webcodr.chartrack.Model.Hero;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class CharacterView extends Activity {

    private TextView txtBattleTag;
    private TextView txtTotalKills;
    private TextView txtParagonLevel;
    private ListView listChars;
    private ArrayAdapter<String> listAdapter;
    private ArrayList<String> heroList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_charakter_view);

        findViewById(R.id.buttonGetProfile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                download();
            }
        });

        txtBattleTag = (TextView) findViewById(R.id.txtBattleNetId);
        txtParagonLevel = (TextView) findViewById(R.id.txtParagonLevel);
        txtTotalKills = (TextView) findViewById(R.id.txtTotalKills);
        listChars = (ListView) findViewById(R.id.listChars);
    }

    private void download() {
        Client.
                getClient().
                getUserProfile(txtBattleTag.getText().toString(), new Callback<CharacterProfile>() {
                    @Override
                    public void success(CharacterProfile result, Response response) {
                        Toast.makeText(getApplicationContext(), result.getBattleTag() + " Loaded! Status Code:" + response.getStatus(), Toast.LENGTH_SHORT).show();

                        txtTotalKills.setText(result.getKills().toString());
                        txtParagonLevel.setText(String.valueOf(result.getParagonLevel()));

                        heroList = new ArrayList<String>();

                        for(Hero hero : result.getHeroes()) {
                            String heroName = String.format(
                                    "%s: %s (Level %d)",
                                    hero.getName(),
                                    hero.getClassName(),
                                    hero.getLevel());
                            heroList.add(heroName);
                        }

                        listAdapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.hero_view, R.id.charName, heroList);
                        listChars.setAdapter(listAdapter);
                    }

                    @Override
                    public void failure(RetrofitError retrofitError) {
                        Toast.makeText(getApplicationContext(), retrofitError.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.charakter_view, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
