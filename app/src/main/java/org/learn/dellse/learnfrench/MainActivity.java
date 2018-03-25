package org.learn.dellse.learnfrench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;

public class MainActivity extends AppCompatActivity {


    InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         MobileAds.initialize(getApplicationContext(), "ca-app-pub-7339653404752392~9205637465");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7339653404752392/1682370665");

        AdRequest adRequest2 = new AdRequest.Builder().build();

        mInterstitialAd.loadAd(adRequest2);

        mInterstitialAd.loadAd(adRequest2);

   /*   FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "                  Developed  @AnkitHacks", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */



        ArrayList<front> front = new ArrayList<>();
        front.add(new front("FrancoPhone Countries", R.drawable.download));
        front.add(new front("French Expressions", R.drawable.exp));
        front.add(new front("Grammer", R.drawable.number));
        front.add(new front("Numbers", R.drawable.grammer));
        front.add(new front("Quiz", R.drawable.quiz));


        frontAdapter items = new frontAdapter(this, front);
        ListView l = (ListView) findViewById(R.id.listView);
        l.setAdapter(items);
        l.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                        if (position == 0) {
                            if (mInterstitialAd.isLoaded()) {
                                mInterstitialAd.show();
                            }else {
                            Intent intent = new Intent(view.getContext(), francophone.class);
                            intent.putExtra("message", position);
                            startActivity(intent);
                        }}

                        if (position == 1) {
                            if (mInterstitialAd.isLoaded()) {
                                mInterstitialAd.show();
                            }else {

                                Intent intent = new Intent(view.getContext(), expressions.class);
                                intent.putExtra("message", position);
                                startActivity(intent);
                            }}
                        if (position == 2) {
                            if (mInterstitialAd.isLoaded()) {
                                mInterstitialAd.show();
                            }else {
                                Intent intent = new Intent(view.getContext(), Grammer.class);
                                intent.putExtra("message", position);
                                startActivity(intent);
                            }}

                        if (position == 3) {

                            Intent intent = new Intent(view.getContext(), numbers.class);
                            intent.putExtra("message", position);
                            startActivity(intent);
                        }

                        if (position == 4) {

                            Intent intent = new Intent(view.getContext(), quiz.class);
                            intent.putExtra("message", position);
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
