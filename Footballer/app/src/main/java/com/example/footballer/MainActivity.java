package com.example.footballer;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView players;
    ArrayList<Footballer> arrayPlayers;
    FootballerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        mappings();
        adapter = new FootballerAdapter(this, R.layout.activity_footballer, arrayPlayers);
        players.setAdapter(adapter);
    }

    private  void mappings() {
        players = findViewById(R.id.listPlayer);
        arrayPlayers = new ArrayList<>();

        arrayPlayers.add(new Footballer("Ronaldo", "Real Madrid", R.drawable.ronaldo, R.drawable.portugal));
        arrayPlayers.add(new Footballer("Messi", "Barcalona", R.drawable.messi, R.drawable.agrentina));
        arrayPlayers.add(new Footballer("Ramos", "Real Madrid", R.drawable.ramos, R.drawable.spain));
        arrayPlayers.add(new Footballer("Mbappe", "PSG", R.drawable.mbappe, R.drawable.france));
        arrayPlayers.add(new Footballer("Haaland", "Manchester City", R.drawable.haaland, R.drawable.norway));
        arrayPlayers.add(new Footballer("Rudiger", "Real Madrid", R.drawable.diger, R.drawable.germany));
        arrayPlayers.add(new Footballer("Kevin", "Manchester City", R.drawable.kevin, R.drawable.belgium));
        arrayPlayers.add(new Footballer("Son", "Tottenham", R.drawable.son, R.drawable.korea));
        arrayPlayers.add(new Footballer("Neuer", "Bayern Munich", R.drawable.neuer, R.drawable.germany));
        arrayPlayers.add(new Footballer("Bellingham", "Real Madrid", R.drawable.bell, R.drawable.england));
        arrayPlayers.add(new Footballer("Maguine", "Manchester United", R.drawable.maguire, R.drawable.england));
        arrayPlayers.add(new Footballer("Neymar", "PSG", R.drawable.neymar, R.drawable.brazil));
    }
}