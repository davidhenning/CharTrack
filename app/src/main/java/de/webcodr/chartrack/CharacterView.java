package de.webcodr.chartrack;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import de.webcodr.chartrack.BlizzardApi.Client;
import de.webcodr.chartrack.CharacterViewActivity.HeroAdapter;
import de.webcodr.chartrack.Model.CharacterProfile;
import de.webcodr.chartrack.Model.Progression;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class CharacterView extends Activity {

    private TextView txtBattleTag;
    private TextView txtTotalKills;
    private TextView txtParagonLevel;
    private TextView txtLabelCampaignMain;
    private TextView txtLabelCampaignAddon;
    private ListView listCharacters;

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
        txtLabelCampaignMain = (TextView) findViewById(R.id.txtLabelCampaignMain);
        txtLabelCampaignAddon = (TextView) findViewById(R.id.txtLabelCampaignAddon);
        listCharacters = (ListView) findViewById(R.id.listChars);
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

        setCampaignStateLabelColor(txtLabelCampaignMain, progression.hasCompletedMainCampaign());
        setCampaignStateLabelColor(txtLabelCampaignAddon, progression.hasCompletedAddonCampaign());
    }

    private void setCampaignStateLabelColor(TextView label, Boolean campaignState) {
        if (campaignState) {
            label.setTextColor(getResources().getColor(android.R.color.black));
        } else {
            label.setTextColor(getResources().getColor(android.R.color.darker_gray));
        }
    }

    private void setCharacterInfo(CharacterProfile profile) {
        txtTotalKills.setText(profile.getKills().toString());
        txtParagonLevel.setText(String.valueOf(profile.getParagonLevel()));
        setCampaignState(profile);
    }

    private void setHeroList(CharacterProfile profile) {
        ListAdapter heroListAdapter = new HeroAdapter(getApplicationContext(), profile.getHeroes());
        listCharacters.setAdapter(heroListAdapter);
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
