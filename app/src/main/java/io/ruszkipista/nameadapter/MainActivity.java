package io.ruszkipista.nameadapter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random mRandom = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    private String getRandomName() {
        String[] names = new String[] {
                "David Beck", "David Berry", "Ian Berry", "Niall Broderick", "Conor Clancy", "Mary Cronin",
                "Matthew Daniels", "Paul Delaney", "Debra Donovan", "Mark Egan", "Anna Hudakova",
                "Brian Hyland", "Emer Kennedy Ozdemir", "Senan O'Callaghan", "Thomas O'Connor",
                "Cahir O'Leary", "Deirdre O'Loughlin", "Adrian O'Sullivan", "Istvan Orosz", "Mark Quigley",
                "Deirdre Shanahan", "Kevin St John", "Sergejs Sushinskis"
        };
        return names[mRandom.nextInt(names.length)];
    }
}
