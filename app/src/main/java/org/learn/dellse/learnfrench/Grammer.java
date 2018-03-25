package org.learn.dellse.learnfrench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

public class Grammer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grammer);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-7339653404752392~9205637465");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        ArrayList<String> ansiContent =new ArrayList<String>();

        ansiContent.add("Nouns");
        ansiContent.add("Articles");
        ansiContent.add("Verbs");
        ansiContent.add("Verb Conjugation");
        ansiContent.add("Pronouns");
        ansiContent.add("Preposition");
        ansiContent.add("Adjective Possesive");
        ansiContent.add("Negative Sentences");



        ArrayAdapter<String> con=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ansiContent);
        ListView l1=(ListView)findViewById(R.id.listView2);
        l1.setAdapter(con);
        l1.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        if (position == 0) {
                            Intent intent = new Intent(view.getContext(), nouns.class);
                            startActivity(intent);
                        }
                        if (position == 1) {
                            Intent intent = new Intent(view.getContext(), articles.class);
                            startActivity(intent);
                        }
                        if (position == 2) {
                            Intent intent = new Intent(view.getContext(), verbs.class);
                            startActivity(intent);
                        }
                        if (position == 3) {
                            Intent intent = new Intent(view.getContext(), VerbConjugation.class);
                            startActivity(intent);
                        }

                        if (position == 4) {
                            Intent intent = new Intent(view.getContext(),Pronoun.class);
                            startActivity(intent);
                        }
                        if (position == 5) {
                            Intent intent = new Intent(view.getContext(),Preposition.class);
                            startActivity(intent);
                        }
                        if (position == 6) {
                            Intent intent = new Intent(view.getContext(),Adjective.class);
                            startActivity(intent);
                        }

                        if (position == 7) {
                            Intent intent = new Intent(view.getContext(),Negative.class);
                            startActivity(intent);
                        }




                    }
                }

        );

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //YOUR CODE
    } @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;

    }
}
