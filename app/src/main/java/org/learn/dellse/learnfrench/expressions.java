package org.learn.dellse.learnfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

public class expressions extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expressions);

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

        numbersCard obj = new numbersCard("  Les Salutations - Greetings","Salut! --> Hi\nBonjour Monsieur! --> Good Morning Sir\nBonsoir Madame -->Good Evening Madame\nBonnenuit Madameoiselle --> Good Night Miss");
        results.add( obj);
        numbersCard obj2 = new numbersCard(" Les Formules de politesse(The Formula of Politeness)","Bienvenue -->Welcome\nEnchante -->Glad to meet you\nCava,merci -->Fine,Thank you\nPasmal -->not bad\nNon,merci -->no thank you\nJe vous en prie -->No mention\nDe Rien -->No mention\nExcuse-moi -->Excuse me\nPardon -->Sorry\nComment? -->How\nOui,S'il vous plait -->Yes Please");
        results.add( obj2);
        numbersCard obj3 = new numbersCard(" Pour Accepter(For Accepting)","D'accord -->OK\nAvec Plaisir -->With Pleasure\nVolontiers -->Volontary");
        results.add( obj3);
        numbersCard obj4 = new numbersCard(" Les Voeux(The Wishes)","Bonne Journee -->Have a nice day\nBonne Soiree -->Have a nice evening\nBon anniversaire -->Happy Birthday\nBonne Fete -->Happy Festival\nBon Appetit -->Enjoy your meal\nBon Weekend -->Happy Weekend\nBon Voyage -->Happy Journey\nBon Courage-->Be Courage");
        results.add( obj4);
        numbersCard obj5 = new numbersCard(" Prendre conge(To Take Leave)","Au revoir -->Good Bye\nA Demain -->See You Tommorow\nA plus/A plus tard -->See you later\nA tout de suite -->Immediately\nA tout a l'heure -->See you in a while\nA Bientot -->See You Soon");
        results.add( obj5);



        return results ;
    }
    }

