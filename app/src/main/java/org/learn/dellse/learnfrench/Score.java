package org.learn.dellse.learnfrench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import org.ankithacks.learnfrench.R;

public class Score extends AppCompatActivity {
    int m;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Bundle msg = getIntent().getExtras();
        if (msg == null) {
            return;
        }

        m = msg.getInt("message");
        TextView ts=(TextView)findViewById(R.id.textView49);
        ts.setText(""+m);
        TextView tp=(TextView)findViewById(R.id.textView50);

        if(m>=70)
            tp.setText("Congratulations !!! ......  ");
        if(m>=40 && m<70)
            tp.setText("EXCELLENT !!! ......  ");
        if(m>0 && m<40)
            tp.setText("Good ...... Try once again ");

        if(m<=0)
            tp.setText("Poor ...... Try again!!!");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //YOUR CODE
    }


    public void again(View view)
    {
        Intent i = new Intent(Score.this, MainActivity.class);
        startActivity(i);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        onBackPressed();
        return true;


    }

}
