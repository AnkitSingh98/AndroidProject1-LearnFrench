package org.learn.dellse.learnfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

public class VerbConjugation extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verb_conjugation);
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

        numbersCard obj = new numbersCard("s'Appeler(To call oneself)",

                        "je m'appelle\n" +
                        "tu t'appelles\n" +
                        "il/elle s'appelle\n" +
                        "nous nous appelons\n" +
                        "vous vous appelez\n" +
                        "ils/elles s'appellent");
        results.add( obj);
        numbersCard obj2 = new numbersCard("Etre(To Be)","je suis\n" +
                "tu es\n" +
                "il/elle est\n" +
                "nous sommes\n" +
                "vous êtes\n" +
                "ils/elles sont");
        results.add( obj2);
        numbersCard obj3 = new numbersCard("Avoir(To Have)","j'ai\n" +
                "tu as\n" +
                "il/elle a\n" +
                "nous avons\n" +
                "vous avez\n" +
                "ils/elles ont");
        results.add( obj3);
        numbersCard obj4 = new numbersCard("Parler(To Speak)","je parle\n" +
                "tu parles\n" +
                "il/elle parle\n" +
                "nous parlons\n" +
                "vous parlez\n" +
                "ils/elles parlent");
        results.add( obj4);
        numbersCard obj5 = new numbersCard("Venir(To Come)","je viens\n" +
                "tu viens\n" +
                "il/elle vient\n" +
                "nous venons\n" +
                "vous venez\n" +
                "ils/elles viennent");
        results.add( obj5);
        numbersCard obj6 = new numbersCard("Aller(To Go)","je vais\n" +
                "tu vas\n" +
                "il/elle va\n" +
                "nous allons\n" +
                "vous allez\n" +
                "ils/elles vont");
        results.add( obj6);
        numbersCard obj7 = new numbersCard("Faire(To do,To make)",
                "je fais\n" +
                "tu fais\n" +
                "il/elle fait\n" +
                "nous faisons\n" +
                "vous faites\n" +
                "ils/elles font");
        results.add( obj7);
        numbersCard obj8 = new numbersCard("Savoir(To Know)","je sais\n" +
                "tu sais\n" +
                "il/elle sait\n" +
                "nous savons\n" +
                "vous savez\n" +
                "ils/elles savent");
        results.add( obj8);
        numbersCard obj9 = new numbersCard("Prendre(To Take)",
                "je prends\n" +
                "tu prends\n" +
                "il/elle prend\n" +
                "nous prenons\n" +
                "vous prenez\n" +
                "ils/elles prennent");
        results.add( obj9);
        numbersCard obj10 = new numbersCard("Voir(To see)",
                "je vois\n" +
                "tu vois\n" +
                "il/elle voit\n" +
                "nous voyons\n" +
                "vous voyez\n" +
                "ils/elles voient");
        results.add( obj10);
        numbersCard obj11 = new numbersCard("Manger(To Eat)","je mange\n" +
                "tu manges\n" +
                "il/elle mange\n" +
                "nous mangeons\n" +
                "vous mangez\n" +
                "ils/elles mangent");
        results.add( obj11);
        numbersCard obj12 = new numbersCard("Finir(To Finish)",
                "je finis\n" +
                "tu finis\n" +
                "il/elle finit\n" +
                "nous finissons\n" +
                "vous finissez\n" +
                "ils/elles finissent");
        results.add( obj12);
        numbersCard obj13= new numbersCard("Aimer(To Like)",
                "j'aime\n" +
                "tu aimes\n" +
                "il/elle aime\n" +
                "nous aimons\n" +
                "vous aimez\n" +
                "ils/elles aiment");
        results.add( obj13);
        numbersCard obj14 = new numbersCard("Attendre(To Wait)",
                "j'attends\n" +
                "tu attends\n" +
                "il/elle attend\n" +
                "nous attendons\n" +
                "vous attendez\n" +
                "ils/elles attendent");
        results.add( obj14);





        return results ;
    }
}
