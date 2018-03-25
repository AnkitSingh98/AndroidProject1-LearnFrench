package org.learn.dellse.learnfrench;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import org.ankithacks.learnfrench.R;

import java.util.ArrayList;

public class frenchNumbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_numbers);
        ArrayList<contents> contents = new ArrayList<>();
        contents.add(new contents("1", "    Une" ));
        contents.add(new contents("2", "    Deux"));
        contents.add(new contents("3", "    Trois"));
        contents.add(new contents("4", "    Quatre"));
        contents.add(new contents("5", "    Cinq"));
        contents.add(new contents("6", "    Six"));
        contents.add(new contents("7", "    Sept"));
        contents.add(new contents("8", "    Huit"));
        contents.add(new contents("9", "    Neuf"));
        contents.add(new contents("10","   Dix"));
        contents.add(new contents("11","   Onze"));
        contents.add(new contents("12","   Douze"));
        contents.add(new contents("13","   Treize"));
        contents.add(new contents("14","   Quatorze"));
        contents.add(new contents("15","   Quinze"));
        contents.add(new contents("16","   Seize"));
        contents.add(new contents("17","   Dix Sept"));
        contents.add(new contents("18","   Dix Huit"));
        contents.add(new contents("19","   Dix Neuf"));
        contents.add(new contents("20","   Vingt"));
        contents.add(new contents("21","   Vingt et un"));
        contents.add(new contents("22","   Vingt deux"));
        contents.add(new contents("23","   Vingt trois"));
        contents.add(new contents("24","   Vingt quatre"));
        contents.add(new contents("25","   Vingt cinq"));
        contents.add(new contents("26","   Vingt six"));
        contents.add(new contents("27","   Vingt sept"));
        contents.add(new contents("28","   Vingt huit"));
        contents.add(new contents("29","   Vingt neuf"));

        contents.add(new contents("30","   Trente"));
        contents.add(new contents("31","   Trente et un"));
        contents.add(new contents("32","   Trente deux"));
        contents.add(new contents("33","   Trente trois"));
        contents.add(new contents("34","   Trente quatre"));
        contents.add(new contents("35","   Trente cinq"));
        contents.add(new contents("36","   Trente six"));
        contents.add(new contents("37","   Trente sept"));
        contents.add(new contents("38","   Trente huit"));
        contents.add(new contents("39","   Trente neuf"));
        contents.add(new contents("40","   Quarante"));
        contents.add(new contents("41","   Quarante et un"));
        contents.add(new contents("50","   Cinquante"));
        contents.add(new contents("60","   Soixante"));
        contents.add(new contents("70","   Soixante Dis"));
        contents.add(new contents("80","   Quatre vingts"));
        contents.add(new contents("81","   Quatre vingt un"));
        contents.add(new contents("90","   Quatre vingt dix"));
        contents.add(new contents("91","   Quatre vingt onze"));
        contents.add(new contents("100"," Cent"));
        contents.add(new contents("1000","Mille"));
        contents.add(new contents("10000","Dix Mille"));





        contentsAdapter items = new contentsAdapter(this, contents);
        ListView l = (ListView) findViewById(R.id.listView);
        l.setAdapter(items);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //YOUR CODE
    } @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;



    }
}
