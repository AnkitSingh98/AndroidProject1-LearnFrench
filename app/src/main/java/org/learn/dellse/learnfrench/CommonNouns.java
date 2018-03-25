package org.learn.dellse.learnfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

public class CommonNouns extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //YOUR CODE

        setContentView(R.layout.activity_common_nouns);
        ArrayList<contents> contents = new ArrayList<>();
        contents.add(new contents("Le Crayon", "The Pencil" ));
        contents.add(new contents("Le Stylo", "The Fountain Pen" ));
        contents.add(new contents("La Gomme", "The Eraser" ));
        contents.add(new contents("Le Taille-crayon", "The Sharpner" ));
        contents.add(new contents("La Regle", "The Ruler Scacle" ));
        contents.add(new contents("Le Cahier", "The Notebook" ));
        contents.add(new contents("Le Chaise", "The Chair" ));
        contents.add(new contents("La Table", "The Table" ));
        contents.add(new contents("La Porte", "The Door" ));
        contents.add(new contents("La Fenetre", "The Window" ));
        contents.add(new contents("Le Cartable", "The Leather Bag" ));
        contents.add(new contents("La Trousse", "The Pouch" ));
        contents.add(new contents("La Bouteille", "The Bottle" ));
        contents.add(new contents("L'ecole", "The School" ));
        contents.add(new contents("L'Universite", "The University" ));
        contents.add(new contents("Le Garcon", "The Boy" ));
        contents.add(new contents("La fille", "The Daughter" ));
        contents.add(new contents("L'etudiante", "The Student" ));
        contents.add(new contents("Le Professeur", "The Professor" ));
        contents.add(new contents("Le Velo", "The Bicycle" ));








        contentsAdapter items = new contentsAdapter(this, contents);
        ListView l = (ListView) findViewById(R.id.listView4);
        l.setAdapter(items);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;
    }

}
