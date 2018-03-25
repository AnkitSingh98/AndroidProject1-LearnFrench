package org.learn.dellse.learnfrench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-7339653404752392~9205637465");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //YOUR CODE
    }

    public void number(View view)
    {
        Intent i = new Intent(numbers.this, frenchNumbers.class);
        startActivity(i);
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;

    }


    @Override
    protected void onResume() {
        super.onResume();
        ((MyRecyclerViewAdapter) mAdapter).setOnItemClickListener(new MyRecyclerViewAdapter
                .MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Log.i(LOG_TAG, " Clicked on Item " + position);
            }
        });
    }

    private ArrayList<numbersCard> getDataSet() {
        ArrayList results = new ArrayList<numbersCard>();

            numbersCard obj = new numbersCard("Rules to learn numbers in french : " ,
                    "-->Strictly Learn numbers from 1 to 20 \n\n-->Learn 30,40,50,60,70,80,90,100,1000 \n\n-->Add et while writing 21,31,41..... except 81 and 91 ");
            results.add( obj);

        return results ;
    }

    }

