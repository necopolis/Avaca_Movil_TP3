package com.avaca.avaca_tp3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewLista;
    private PeliculaAdapter peliculaAdapter;
    private PeliculaViewModel iViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iViewModel = new PeliculaViewModel();
        recyclerViewLista = findViewById(R.id.RVLista);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(
                this,
                LinearLayoutManager.VERTICAL,
                false
        );
        recyclerViewLista.setLayoutManager(linearLayoutManager);
        peliculaAdapter = new PeliculaAdapter(this, iViewModel.getInmuebles());
        recyclerViewLista.setAdapter(peliculaAdapter);
    }
}