package com.example.a1hw5;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CountryFragment extends Fragment implements Listener{
    private Adapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Model> list;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadCountries();


        recyclerView = view.findViewById(R.id.container_country);
        adapter = new Adapter(this,  list);
        recyclerView.setAdapter(adapter);

    }

    private void loadCountries() {
        Bundle bundle = getArguments();
        list=new ArrayList<>();
        int a = bundle.getInt(getString(R.string.key));
        if (a == 1){
            list.add(new Model(R.drawable.ic_chad, "Chad", "'Djamena"));
            list.add(new Model(R.drawable.ic_mauritania, "Mauritania", "Nouakchott"));
            list.add(new Model(R.drawable.ic_madagascar, "Madagasgar", "Antananarivo"));
            list.add(new Model(R.drawable.ic_mali, "Mali", "Bamako"));
            list.add(new Model(R.drawable.ic_southafrica, "South Africa", "Pretoria"));

        }

        if (a == 2){
            list.add(new Model(R.drawable.ic_kg_3x, "Kyrgyzstan", "Bishkek"));
            list.add(new Model(R.drawable.ic_uzbekistan, "Uzbekistan", "Tashkent"));
            list.add(new Model(R.drawable.ic_tuekey, "Turkey", "Ankara"));
            list.add(new Model(R.drawable.ic_ukraina, "Ukraina", "Kiev"));
            list.add(new Model(R.drawable.ic_kazakstan, "Kazakstan", "Astana"));
        }

        if (a == 3){
            list.add(new Model(R.drawable.ic_brazil, "Brazil", "Brasilia"));
            list.add(new Model(R.drawable.ic_argentina, "Argentina", "Buenos Aires"));
            list.add(new Model(R.drawable.ic_urugvay, "Urugvay", "Montevideo"));
            list.add(new Model(R.drawable.ic_chili, "Chili", "Santiago,"));
            list.add(new Model(R.drawable.ic_columbia, "Columbia", "Bogota"));
        }
        if (a == 4){
            list.add(new Model(R.drawable.ic_australia, "Australia", "Canberra"));
        }
        if (a == 5){
            list.add(new Model(R.drawable.ic_canada, "Canada", "Ottawa"));
            list.add(new Model(R.drawable.ic_usa, "USA", "Vashington"));
            list.add(new Model(R.drawable.ic_urugvay, "Urugvay", "Montevideo"));
            list.add(new Model(R.drawable.ic_chili, "Chili", "Santiago,"));
            list.add(new Model(R.drawable.ic_columbia, "Columbia", "Bogota"));
        }
        if (a == 6){

        }


    }

    @Override
    public void onClickListener(Model model) {

    }
}