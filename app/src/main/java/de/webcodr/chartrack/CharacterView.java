package de.webcodr.chartrack;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import de.webcodr.chartrack.BlizzardApi.Client;
import de.webcodr.chartrack.CharacterViewActivity.HeroAdapter;
import de.webcodr.chartrack.Model.CharacterProfile;
import de.webcodr.chartrack.Model.Hero;
import de.webcodr.chartrack.Model.Progression;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class CharacterView extends Activity {

    private TextView txtBattleTag;
    private TextView txtTotalKills;
    private TextView txtParagonLevel;
    private TextView txtMainCampaignState;
    private TextView txtAddonCampaignState;
    private ListView listChars;
    private HeroAdapter listAdapter;
    private ArrayList<Hero> heroList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_view);

        findViewById(R.id.buttonGetProfile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            download();
            }
        });

        txtBattleTag = (TextView) findViewById(R.id.txtBattleNetId);
        txtParagonLevel = (TextView) findViewById(R.id.txtParagonLevel);
        txtTotalKills = (TextView) findViewById(R.id.txtTotalKills);
        txtMainCampaignState = (TextView) findViewById(R.id.txtMainCampaignState);
        txtAddonCampaignState = (TextView) findViewById(R.id.txtAddonCampaignState);
        listChars = (ListView) findViewById(R.id.listChars);
    }

    private void download() {
        Client.
            getClient().
            getUserProfile(txtBattleTag.getText().toString(), new Callback<CharacterProfile>() {
                @Override
                public void success(CharacterProfile result, Response response) {
                    Toast.makeText(getApplicationContext(), result.getBattleTag() + " Loaded! Status Code:" + response.getStatus(), Toast.LENGTH_SHORT).show();
                    setCharacterInfo(result);
                    setHeroList(result);
                }

                @Override
                public void failure(RetrofitError retrofitError) {
                    Toast.makeText(getApplicationContext(), retrofitError.getMessage(), Toast.LENGTH_SHORT).show();
                }
            });
    }

    private void setCampaignState(CharacterProfile profile) {
        Progression progression = profile.getProgression();
        Boolean isMainCampaignCompleted = progression.hasCompletedMainCampaign();
        Boolean isAddonCampaignCompleted = progression.hasCompletedAddonCampaign();

        txtMainCampaignState.setText(formatCompletionState(isMainCampaignCompleted));
        txtAddonCampaignState.setText(formatCompletionState(isAddonCampaignCompleted));
    }

    private String formatCompletionState(Boolean state) {
        if (state) {
            return "completed";
        }

        return "not completed";
    }

    private void setCharacterInfo(CharacterProfile profile) {
        txtTotalKills.setText(profile.getKills().toString());
        txtParagonLevel.setText(String.valueOf(profile.getParagonLevel()));
        setCampaignState(profile);
    }

    private void setHeroList(CharacterProfile profile) {
        heroList = new ArrayList<Hero>();

        for (Hero hero : profile.getHeroes()) {
            heroList.add(hero);
        }

        listAdapter = new HeroAdapter(getApplicationContext(), heroList);
        listChars.setAdapter(listAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.character_view, menu);
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
