package org.learn.dellse.learnfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

public class francophone extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    InterstitialAd mInterstitialAd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_francophone);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId("ca-app-pub-7339653404752392/1682370665");

        AdRequest adRequest2 = new AdRequest.Builder()
                .addTestDevice("SEE_YOUR_LOGCAT_TO_GET_YOUR_DEVICE_ID")
                .build();

        mInterstitialAd.loadAd(adRequest2);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view2);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //YOUR CODE
    } @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;


    }


    private ArrayList<numbersCard> getDataSet() {
        ArrayList results = new ArrayList<numbersCard>();

        numbersCard obj = new numbersCard("L' Afrique","Le Benin\nLe Burkina Faso\nLe Burundi\nLe Cameroun\nLe Congo\nLe Chad\nLe Comorous\nLe Djibouti\nLe Gabon\nLe Guinea\nLa Cote d'lvoire\nLe Niger\nLe Rawanda\nLe Senegal\nLe Togo");
        results.add( obj);
        numbersCard obj2 = new numbersCard(" L' Oceanindien(Afrique)","Le Madagascar\nLes Seychelles\nLa Reunion\nLa Mayotte");
        results.add( obj2);
        numbersCard obj3 = new numbersCard(" L'Amerique du nord","Le Canada(quebec)\nLe Haiti");
        results.add( obj3);
        numbersCard obj4 = new numbersCard(" L'Amerique du sud et Les Antilles","La GuyaneFrancaise\nLa Guadeloupe\nLe Martinique");
        results.add( obj4);
        numbersCard obj5 = new numbersCard(" L'Ocean Pacific","La PolynesieFrancaise\nVanuatu\nLa Nouvelle-Caledonia");
        results.add( obj5);
        numbersCard obj6 = new numbersCard(" L'Europe","La France\nLe Luxembourg\nLa Belgique\nLe Monaco\nLa Suisse");
        results.add( obj6);
        numbersCard obj7 = new numbersCard(" L'Asie","Le Vietnam\nLe Laos\nLe Cambodge\nLe Liban");
        results.add( obj7);


        return results ;
    }
}
