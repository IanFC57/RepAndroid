package com.example.meuapp;

import java.util.ArrayList;

public class PlanetaDAO {
    ArrayList<Planeta> ListaPlanetas;
    public PlanetaDAO() {
        ListaPlanetas = new ArrayList<>();
        ListaPlanetas.add(new Planeta("Mercurio", R.drawable.mercury));
        ListaPlanetas.add(new Planeta("Terra", R.drawable.earth));
        ListaPlanetas.add(new Planeta("Jupiter", R.drawable.jupter));
        ListaPlanetas.add(new Planeta("Marte", R.drawable.mars));
        ListaPlanetas.add(new Planeta("Netuno", R.drawable.neptune));
        ListaPlanetas.add(new Planeta("Saturno", R.drawable.saturn));
        ListaPlanetas.add(new Planeta("Urano", R.drawable.uranus));
        ListaPlanetas.add(new Planeta("Venus", R.drawable.venus));
    }

    public ArrayList<Planeta> ListaPlanetas(){
        return ListaPlanetas;
    }
}
