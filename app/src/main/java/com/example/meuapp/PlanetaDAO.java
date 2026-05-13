package com.example.meuapp;

import java.util.ArrayList;

public class PlanetaDAO {
    ArrayList<Planeta> ListaPlanetas;
    public PlanetaDAO() {
        ListaPlanetas = new ArrayList<>();
        ListaPlanetas.add(new Planeta("Mercurio", R.drawable.mercury, "200,59"));
        ListaPlanetas.add(new Planeta("Terra", R.drawable.earth, "5.972×10^24"));
        ListaPlanetas.add(new Planeta("Jupiter", R.drawable.jupter, "1.8987×10^27"));
        ListaPlanetas.add(new Planeta("Marte", R.drawable.mars, "6.4191×10^23"));
        ListaPlanetas.add(new Planeta("Netuno", R.drawable.neptune, "1.0244×10^26"));
        ListaPlanetas.add(new Planeta("Saturno", R.drawable.saturn, "5.6851×10^26"));
        ListaPlanetas.add(new Planeta("Urano", R.drawable.uranus, "8.6849×10^25"));
        ListaPlanetas.add(new Planeta("Venus", R.drawable.venus, "4.8690×10^24"));
    }

    public ArrayList<Planeta> ListaPlanetas(){
        return ListaPlanetas;
    }
}
