package org.learn.dellse.learnfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

public class Negative extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negative);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view2);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new MyRecyclerViewAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //YOUR CODE
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;


    }

    private ArrayList<numbersCard> getDataSet() {
        ArrayList results = new ArrayList<numbersCard>();

        numbersCard obj = new numbersCard("Negative Sentences:", "To reply to a Question in Negative\nWe use Ne and Pas at appropriate places as described below : ");

        results.add(obj);
        numbersCard obj2 = new numbersCard("Using Ne and Pas :", "ne"+" "+"---------->Before the verb\n\nPas---------->After the verb");

        results.add(obj2);

        return results ;
    }

}
