package org.learn.dellse.learnfrench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

import org.ankithacks.learnfrench.R;

import java.util.Random;

public class quiz extends AppCompatActivity {

    private RadioGroup radioSexGroup;
    private RadioButton radioSexButton;
    int i=0,j=1,marks=0,count=1;
    String[] O = new String[450];
    String[] Q = new String[150];
    final String[] a = new String[150];
    String k;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-7339653404752392~9205637465");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);


        Q[0]="Fill in the indefinite Articles :\n___________ ordinateur";
        Q[1]="Fill in the indefinite Articles  :\n" +
                "___________ pere";
        Q[2]="Fill in the indefinite Articles  :\n" +
                "___________ livres";
        Q[3]="Fill in the indefinite Articles  :\n" +
                "___________ ecole";
        Q[4]="Fill in the indefinite Articles  :\n" +
                "___________ voiture";
        Q[5]="50 in french is written as : ";
        Q[6]="81 in french is written as :";
        Q[7]="16 in french is written as :";
        Q[8]="Completez les phrases avec les prepositions de lieu :\n\n____________ angleterre";
        Q[9]="Completez les phrases avec les prepositions de lieu :\n\n" +
                "Je suis ____________ Strasboung";
        Q[10]="Completez les phrases avec les prepositions de lieu :\n\n" +
                "____________ Canada";
        Q[11]="Completez les phrases avec les prepositions de lieu :\n\n" +
                "____________ Pays-Bas";
        Q[12]="Completez les phrases avec les prepositions de lieu :\n\n" +
                "____________ Chine";
        Q[13]="15 in french is written as :";
        Q[14]="20 in french is written as";
        Q[15]="Fill in the definite Articles :\n ___________ Fenetre";
        Q[16]="Fill in the definite Articles :\n" +
                " ___________ Livre";
        Q[17]="Fill in the definite Articles :\n" +
                " ___________ Porte";
        Q[18]="Fill in the definite Articles :\n" +
                " ___________ Gommes";
        Q[19]="Fill in the definite Articles :\n" +
                " ___________ Cahier";
        Q[20]="Write in french : \nWelcome --> ____________";
        Q[21]="Write in french : \n" +
                "Not Bad --> ____________";
        Q[22]="Write in french : \n" +
                "No Mention --> ____________";
        Q[23]="Write in french : \n" +
                "Please --> ____________";
        Q[24]="Write in french : \n" +
                "OK --> ____________";
        Q[25]="Write in french : \n" +
                "Have a nice day --> ____________";
        Q[26]="Write in french : \n" +
                "Enjoy your meal --> ____________";
        Q[27]="Write in french : \n" +
                "Good Bye --> ____________";
        Q[28]="Write in french : \n" +
                "Immediately --> ____________";
        Q[29]="Write in french : \n" +
                "See you soon --> ____________";
        Q[30]="Which one is Asian Francophone Country : ";
        Q[31]="Which one is African Francophone Country : ";
        Q[32]="Which one is Europian Francophone Country : ";
        Q[33]="Which one is North American Francophone Country : ";
        Q[34]="Which one is  Francophone Country : ";
        Q[35]="Completez avec les adjectifs possessifs: \n\nEt elle,C'est isabelle.\nC'est_________amie";
        Q[36]="Completez avec les adjectifs possessifs: \n\nJ'etudie en 3eme annee de medicine.\nC'est____________ 3eme annee de medecine";
        Q[37]="Completez avec les adjectifs possessifs: \n\nNous avons un nouveau numero de telephone.\n________nouveau numero de telephone est le 02-97-19-13-08";
        Q[38]="Completez avec les adjectifs possessifs: \n\nJ'ai une copine,elle s' appele Amelie.\nC'est__________copine.";
        Q[39]="Completez avec les adjectifs possessifs: \n\nC'est anniversaire d'Amelie.\nC'est________anniversaire";
        Q[40]="Mettez les pronoms toniques: \n\n_________ ,C'est jean-Michel,il est infirmier.";
        Q[41]="Mettez les pronoms toniques: \n" +
                "\nTu habites avec Neela? Oui,j'habite avec__________";
        Q[42]="Mettez les pronoms toniques: \n" +
                "\n__________,vous parlez le francais?";
        Q[43]="Mettez les pronoms toniques: \n" +
                "\nDemain,on va chez_________? J'ai des super films a regarder.";
        Q[44]="Mettez les pronoms toniques: \n" +
                "\nJ'ai deux freres et __________ ?";
        Q[45]="Conjuguez le verbe au present: \n\nTu ___________ le francais, un peu(Comprendre)?";
        Q[46]="Conjuguez le verbe au present: \n" +
                "\nDemain,je_______ une fete pour mon anniversaire(faire)";
        Q[47]="Conjuguez le verbe au present: \n" +
                "\nJ'________ 20 ans.(avoir)";
        Q[48]="Conjuguez le verbe au present: \n" +
                "\nComment ___________ tu?(aller)";
        Q[49]="Conjuguez le verbe au present: \n" +
                "\nTu __________ ou?(habiter)";

        Q[50]="Mettez le dialogue en order :\n\n1)Sebastian:C'est la premiere fois que tu viens en France?\n2)Kamal:Oui\n3)Isabelle:Mais tu comprends le francais, un peu ?\n4)Kamal:Oui,un peu.\n5)Kamal:Salut!\n6)Isabelle:Salut,Bienvenue a paris! ";

        Q[51]="Completez avec les adjectifs possessifs: \n" +
                "\nC'est le livre de Robert.\n C'est __________livre";
        Q[52]="Completez avec les adjectifs possessifs: \n" +
                "\nC'est la soeur de Robert.\nC'est ________" +
                " soeur. ";
        Q[53]="Completez avec les adjectifs possessifs: \n" +
                "\nC'est la petite amie de Robert.\nC'est " +
                "amie";
        Q[54]="Completez avec les adjectifs possessifs: \n" +
                "\nCe sont les parents de Mireille et de Marie-Laure.\nCe sont______ " +
                " parents";
        Q[55]="Completez avec les adjectifs possessifs: \n" +
                "\nC'est la classe des étudiants.\nC'est______ " +
                " classe. ";
        Q[56]="Completez avec les adjectifs possessifs: \n" +
                "\nJ'ai une radio.\nC'est________" +
                "radio.  ?";
        Q[57]="Completez avec les adjectifs possessifs: \n" +
                "\nNous avons une maison.\nC'est_________" +
                " maison.";
        Q[58]="Completez avec les adjectifs possessifs: \n" +
                "\nTu as des amis.\nCe sont________" +
                "amis. ";
        Q[59]="Completez avec les adjectifs possessifs: \n" +
                "\n Vous avez des problèmes.\nCe sont________" +
                " problèmes. ";
        Q[60]="Completez avec les adjectifs possessifs: \n" +
                "\nTu as un stylo.\nC'est_________" +
                " stylo. ";
        Q[61]="Completez avec les adjectifs possessifs: \n" +
                "\nVous avez une voiture.\nC'est _________" +
                " voiture. ";
        Q[62]="Completez avec les adjectifs possessifs: \n" +
                "\nJ'ai des idées.\nCe sont________" +
                "idées";
        Q[63]="Completez avec les adjectifs possessifs: \n" +
                "\n Nous avons des amis.\nCe sont________" +
                "amis. ";
        Q[64]="Completez avec les adjectifs possessifs: \n" +
                "\n J'ai un appartement.\nC'est__________" +
                "appartement.";
        Q[65]="Completez avec les adjectifs possessifs: \n" +
                "\nMichel a des cousins.\nCe sont__________" +
                "cousins.";




        O[0]="un";
        O[1]="une";
        O[2]="des";
        O[3]="None";
        O[4]="un";
        O[5]="une";
        O[6]="des";
        O[7]="None";
        O[8]="un";
        O[9]="une";
        O[10]="des";
        O[11]="None";
        O[12]="un";
        O[13]="une";
        O[14]="des";
        O[15]="None";
        O[16]="un";
        O[17]="une";
        O[18]="des";
        O[19]="None";
        O[20]="Trente";
        O[21]="Quarante";
        O[22]="Cinquante";
        O[23]="Soixante";
        O[24]="Quatre vingt et un";
        O[25]="Quatre vingt un";
        O[26]="Quatre vingt onze";
        O[27]="Soixante et un";
        O[28]="Quinze";
        O[29]="Quatorze";
        O[30]="Onze";
        O[31]="Seize";
        O[32]="de";
        O[33]="a";
        O[34]="en";
        O[35]="au";
        O[36]="de";
        O[37]="a";
        O[38]="en";
        O[39]="au";
        O[40]="de";
        O[41]="a";
        O[42]="en";
        O[43]="au";
        O[44]="de";
        O[45]="aux";
        O[46]="en";
        O[47]="au";
        O[48]="de";
        O[49]="a";
        O[50]="en";
        O[51]="au";
        O[52]="Quinze";
        O[53]="Douze";
        O[54]="Vingt";
        O[55]="Seize";
        O[56]="Quinze";
        O[57]="Douze";
        O[58]="Vingt";
        O[59]="Seize";
        O[60]="le";
        O[61]="la";
        O[62]="les";
        O[63]="l'";
        O[64]="le";
        O[65]="la";
        O[66]="les";
        O[67]="l'";
        O[68]="le";
        O[69]="la";
        O[70]="les";
        O[71]="l'";
        O[72]="le";
        O[73]="la";
        O[74]="les";
        O[75]="l'";
        O[76]="le";
        O[77]="la";
        O[78]="les";
        O[79]="l'";
        O[80]="Enchante";
        O[81]="Pardon";
        O[82]="Bienvenue";
        O[83]="Merci";
        O[84]="Pasmal";
        O[85]="Pardon";
        O[86]="Bienvenue";
        O[87]="Merci";
        O[88]="Pasmal";
        O[89]="Je vous en prie";
        O[90]="Bienvenue";
        O[91]="Merci";
        O[92]="Pasmal";
        O[93]="Pardon";
        O[94]="Bienvenue";
        O[95]="S'il vous plait";
        O[96]="D'accord";
        O[97]="Pardon";
        O[98]="Bienvenue";
        O[99]="Merci";

        O[100]="Volontiers";
        O[101]="Bonne journee";
        O[102]="Bonne Soiree";
        O[103]="Bon Voyage";

        O[104]="Volontiers";
        O[105]="Bonne journee";
        O[106]="Bonne Soiree";
        O[107]="Bon Appetit";

        O[108]="Au revoir";
        O[109]="Bonne journee";
        O[110]="A tout de suite";
        O[111]="Bon Voyage";

              O[112]="Volontiers";
        O[113]="A tout de suite";
        O[114]="Bonne Soiree";
        O[115]="A Bientot";
        O[116]="Volontiers";
        O[117]="A tout de suite";
        O[118]="Bonne Soiree";
        O[119]="A Bientot";
        O[120]="Le Luxembourg";
        O[121]="Le Martinique";
        O[122]="Le Vietnam";
        O[123]="Le Haiti";
        O[124]="Le Luxembourg";
        O[125]="Le Rawanda";
        O[126]="Le Vietnam";
        O[127]="Le Haiti";
        O[128]="Le Monoco";
        O[129]="Le Martinique";
        O[130]="Le Vietnam";
        O[131]="Le Haiti";
        O[132]="Le Luxembourg";
        O[133]="Le Martinique";
        O[134]="Le Vietnam";
        O[135]="Le Haiti";
        O[136]="Le Luxembourg";
        O[137]="Le China";
        O[138]="Le Nepal";
        O[139]="Le India";
        O[140]="son";
        O[141]="sa";
        O[142]="ses";
        O[143]="mon";

        O[144]="mon";
        O[145]="ma";
        O[146]="mes";
        O[147]="son";

        O[148]="notre";
        O[149]="nos";
        O[150]="mon";
        O[151]="vos";

        O[152]="mon";
        O[153]="ma";
        O[154]="mes";
        O[155]="son";

        O[156]="son";
        O[157]="sa";
        O[158]="ses";
        O[159]="son";

        O[160]="lui";
        O[161]="elle";
        O[162]="vous";
        O[163]="moi";

        O[164]="lui";
        O[165]="elle";
        O[166]="vous";
        O[167]="moi";

        O[168]="lui";
        O[169]="elle";
        O[170]="vous";
        O[171]="moi";

        O[172]="lui";
        O[173]="elle";
        O[174]="vous";
        O[175]="moi";

        O[176]="lui";
        O[177]="toi";
        O[178]="vous";
        O[179]="moi";

        O[180]="Comprends";
        O[181]="Comprenent";
        O[182]="Comprenons";
        O[183]="Comprenez";

        O[184]="fais";
        O[185]="fait";
        O[186]="faisons";
        O[187]="faites";

        O[188]="ai";
        O[189]="as";
        O[190]="a";
        O[191]="avons";

        O[192]="vais";
        O[193]="va";
        O[194]="vas";
        O[195]="allez";

        O[196]="habite";
        O[197]="habitons";
        O[198]="habitez";
        O[199]="habites";
        O[200]="3-4-5-6-1-2";
        O[201]="6-4-5-3-2-1";
        O[202]="3-4-5-6-2-1";
        O[203]="4-3-5-6-2-1";

        O[204]="son";
        O[205]="sa";
        O[206]="ses";
        O[207]="ma";

        O[208]="son";
        O[209]="sa";
        O[210]="ses";
        O[211]="ma";

        O[212]="son";
        O[213]="sa";
        O[214]="ses";
        O[215]="ma";

        O[216]="vos";
        O[217]="nos";
        O[218]="leurs";
        O[219]="leur";

        O[220]="vos";
        O[221]="nos";
        O[222]="leurs";
        O[223]="leur";

        O[224]="mon";
        O[225]="sa";
        O[226]="ses";
        O[227]="ma";

        O[228]="nos";
        O[229]="notre";
        O[230]="votre";
        O[231]="vos";

        O[232]="tes";
        O[233]="mes";
        O[234]="ses";
        O[235]="mon";

        O[236]="nos";
        O[237]="notre";
        O[238]="ses";
        O[239]="vos";

        O[240]="ton";
        O[241]="ta";
        O[242]="tes";
        O[243]="ses";

        O[244]="nos";
        O[245]="notre";
        O[246]="votre";
        O[247]="vos";

        O[248]="ma";
        O[249]="mes";
        O[250]="ses";
        O[251]="mon";

        O[252]="nos";
        O[253]="notre";
        O[254]="votre";
        O[255]="vos";

        O[256]="ma";
        O[257]="mes";
        O[258]="ses";
        O[259]="mon";

        O[256]="sa";
        O[257]="mes";
        O[258]="ses";
        O[259]="mon";









        a[0]="un";
        a[1]="un";
        a[2]="des";
        a[3]="une";
        a[4]="une";
        a[5]="Cinquante";
        a[6]="Quatre vingt un";
        a[7]="Seize";
        a[8]="en";
        a[9]="de";
        a[10]="au";
        a[11]="aux";
        a[12]="en";
        a[13]="Quinze";
        a[14]="Vingt";
        a[15]="la";
        a[16]="le";
        a[17]="la";
        a[18]="les";
        a[19]="la";
        a[20]="Bienvenue";
        a[21]="Pasmal";
        a[22]="Je vous en prie";

        a[23]="S'il vous plait";
        a[24]="D'accord";
        a[25]="Bonne journee";
        a[26]="Bon Appetit";
        a[27]="Au revoir";
        a[28]="A tout de suite";
        a[29]="A Bientot";
        a[30]="Le Vietnam";
        a[31]="Le Rawanda";
        a[32]="Le Monaco";
        a[33]="Le Haiti";
        a[34]="Le Luxembourg";
        a[35]="son";
        a[36]="ma";
        a[37]="notre";
        a[38]="ma";
        a[39]="son";
        a[40]="lui";
        a[41]="elle";
        a[42]="vous";
        a[43]="moi";
        a[44]="toi";
        a[45]="Comprends";
        a[46]="fais";
        a[47]="ai";
        a[48]="vas";
        a[49]="habites";
        a[50]="3-4-5-6-2-1";
        a[51]="son";
        a[52]="sa";
        a[53]="son";
        a[54]="leurs";
        a[55]="leur";
        a[56]="ma";
        a[57]="notre";
        a[58]="tes";
        a[59]="vos";
        a[60]="ton";
        a[61]="votre";
        a[62]="mes";
        a[63]="nos";
        a[64]="mon";
        a[65]="ses";


        Random r = new Random();
     int randNum = r.nextInt(66);

     i = randNum;

     TextView tt = (TextView) findViewById(R.id.textView46);
     tt.setText("" + j);



     TextView t1 = (TextView) findViewById(R.id.t1);
     t1.setText(Q[i]);


     RadioButton r0 = (RadioButton) findViewById(R.id.radioButton);
        r0.setText(O[(4 * i) + 0]);
        RadioButton r1 = (RadioButton) findViewById(R.id.radioButton2);
        r1.setText(O[(4 * i) + 1]);
        RadioButton r2 = (RadioButton) findViewById(R.id.radioButton3);
        r2.setText(O[(4 * i) + 2]);
        RadioButton r3 = (RadioButton) findViewById(R.id.radioButton4);
        r3.setText(O[(4 * i) + 3]);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //YOUR CODE
    } @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;


}
    void func() {
        if (j <= 10) {
            Random r = new Random();
            int randNum = r.nextInt(66);

            i = randNum;

            TextView tt = (TextView) findViewById(R.id.textView46);
            tt.setText("" + j);

            TextView t1 = (TextView) findViewById(R.id.t1);
            t1.setText(Q[i]);


            RadioButton r0 = (RadioButton) findViewById(R.id.radioButton);
            r0.setText(O[(4 * i) + 0]);
            RadioButton r1 = (RadioButton) findViewById(R.id.radioButton2);
            r1.setText(O[(4 * i) + 1]);
            RadioButton r2 = (RadioButton) findViewById(R.id.radioButton3);
            r2.setText(O[(4 * i) + 2]);
            RadioButton r3 = (RadioButton) findViewById(R.id.radioButton4);
            r3.setText(O[(4 * i) + 3]);
        }
    }



         public void submit(View view)
         {

                 radioSexGroup = (RadioGroup) findViewById(R.id.radiogroup);
                 if (radioSexGroup.getCheckedRadioButtonId() == -1)
                 {
                     Toast.makeText(quiz.this,
                             "Select Your Answer", Toast.LENGTH_SHORT).show();

                     // no radio buttons are checked
                 }
                 else
                 {
                     if(j<=10)
                     {
                     int selectedId = radioSexGroup.getCheckedRadioButtonId();
                     radioSexButton = (RadioButton) findViewById(selectedId);
                         if (radioSexButton.isChecked()) {
                             k = radioSexButton.getText().toString();

                             if (k.equals(a[i])) {
                                 if (count == j) {

                                     Toast.makeText(quiz.this,
                                             "Correct", Toast.LENGTH_SHORT).show();

                                     marks = marks + 10;
                                     TextView tv = (TextView) findViewById(R.id.textView47);
                                     tv.setText("" + marks);
                                     count++;
                                 }
                             }

                             else {

                                 if (count == j) {
                                     Toast.makeText(quiz.this,
                                             "Wrong, the Correct answer is --> "+a[i], Toast.LENGTH_SHORT).show();
                                     marks = marks - 5;
                                     TextView tv = (TextView) findViewById(R.id.textView47);
                                     tv.setText("" + marks);
                                     count++;
                                 }


                             }


                         }
                         else{
                             Toast.makeText(quiz.this,
                                     "Please select your answer", Toast.LENGTH_SHORT).show();

                         }

                     }






                     else
                     {
                         Intent intent = new Intent(quiz.this,Score.class);
                         intent.putExtra("message", marks);
                         startActivity(intent);
                     }


                     // one of the radio buttons is checked
                 }










    }


    public void next(View view)
    {
        if(count!=j) {
            if(j==10)
            {
                finish();
                Intent intent = new Intent(quiz.this,Score.class);
                intent.putExtra("message", marks);
                startActivity(intent);
            }
            else
            {
            j++;
            if(j==9)
            {
                Button b=(Button)findViewById(R.id.button3);
                b.setText("RESULT-->");
            }
            radioSexButton.setChecked(false);
            k = null;
            func();
            }
        }

        else
        {
            Toast.makeText(quiz.this,
                    "Please SUBMIT your answer", Toast.LENGTH_SHORT).show();
        }

    }
}
