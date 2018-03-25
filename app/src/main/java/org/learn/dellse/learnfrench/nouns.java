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

public class nouns extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nouns);
        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view3);
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

        numbersCard obj = new numbersCard("         What is a Noun ? ", "A noun is a word that represents a person, place, or thing, whether concrete (e.g., chair, dog) or abstract (idea, happiness). In French, all nouns have a gender - they are either masculine or feminine. The gender of some nouns makes sense (homme [man] is masculine, femme [woman] is feminine) but others don't: the words personne [person] and victime [victim] are always feminine, even when the person or victim is a man! \n" +
                "\n" +
                "It is very important to learn a noun's gender along with the noun itself because articles, adjectives, some pronouns, and some verbs have to agree with nouns; that is, they change depending on the gender of the noun they modify.");
        results.add(obj);


        return results;
    }

    public void noun(View view) {
        Intent i = new Intent(nouns.this, CommonNouns.class);
        startActivity(i);
    }
}
