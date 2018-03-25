package org.learn.dellse.learnfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

public class verbs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verbs);
        ArrayList<contents> contents = new ArrayList<>();
        contents.add(new contents("être", "to be" ));
        contents.add(new contents("avoir", "to have" ));
        contents.add(new contents("pouvoir", "to be able (can)" ));
        contents.add(new contents("faire", "to do, to make" ));
        contents.add(new contents("mettre", "to put, to place" ));
        contents.add(new contents("dire", "to say, to tell" ));
        contents.add(new contents("devoir", "to have to , must, to owe" ));
        contents.add(new contents("prendre", "to take, to catch, to capture" ));
        contents.add(new contents("donner", "to give, to produce" ));
        contents.add(new contents("aller", "to go" ));
        contents.add(new contents("vouloir", "to want, to wish" ));
        contents.add(new contents("savoir", "to know" ));
        contents.add(new contents("falloir", "to have to" ));
        contents.add(new contents("voir", "to see" ));
        contents.add(new contents("demander", "to ask, to request" ));
        contents.add(new contents("trouver", "to find, to discover" ));
        contents.add(new contents("rendre", "to return (something), to give back" ));
        contents.add(new contents("venir", "to come" ));
        contents.add(new contents("passer", "to pass, to go past" ));
        contents.add(new contents("comprendre", "to understand, to include, to comprehend" ));
        contents.add(new contents("rester", "to stay, to remain" ));
        contents.add(new contents("tenir", "to hold, to keep" ));
        contents.add(new contents("porter", "to carry, to wear" ));
        contents.add(new contents("parler", "to speak, to talk" ));
        contents.add(new contents("montrer", "to show, to display" ));
        contents.add(new contents("continuer", "to continue" ));
        contents.add(new contents("penser", "to think" ));
        contents.add(new contents("vivre", "to live" ));
        contents.add(new contents("revenir", "to return, to come back" ));
        contents.add(new contents("servir", "to serve" ));
        contents.add(new contents("recevoir", "to receive, to welcome" ));
        contents.add(new contents("arriver", "to arrive, to happen" ));
        contents.add(new contents("occuper", "to occupy, to take up (space/time)" ));
        contents.add(new contents("appeler", "to call, to contact" ));
        contents.add(new contents("attendre", "to wait, to expect" ));
        contents.add(new contents("présenter", "to present, to introduce" ));
        contents.add(new contents("accepter", "to accept" ));
        contents.add(new contents("aimer", "to like, to love" ));
        contents.add(new contents("lire", "to read " ));
        contents.add(new contents("travailler", "to work" ));
        contents.add(new contents("reprendre", "to resume, to recover, to take back" ));
        contents.add(new contents("apprendre", "to learn, to teach, to hear of" ));
        contents.add(new contents("apporter", "to bring, to cause" ));












        contentsAdapter items = new contentsAdapter(this, contents);
        ListView l = (ListView) findViewById(R.id.listView4);
        l.setAdapter(items);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //YOUR CODE
    } @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;

    }
}
