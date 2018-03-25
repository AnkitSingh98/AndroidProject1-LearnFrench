package org.learn.dellse.learnfrench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

public class Preposition extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preposition);
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

        numbersCard obj = new numbersCard("PrePosition delien(PLACE)", "de ------> of,from\na  ------> at,to (Before city or place)\nen  ------> in (Before Female Countries)\nau ------> at (Before Male Countries)");

        results.add(obj);

        return results ;
    }

    public void example(View view)
    {
        Intent i = new Intent(Preposition.this, prepositionExercises.class);
        startActivity(i);
    }



}
