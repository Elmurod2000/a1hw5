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


public class ContinentFragment extends Fragment implements Listener{

    private Adapter adapter;
    private RecyclerView recyclerView;
    private ArrayList<Model> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_continent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadContinents();


        recyclerView = view.findViewById(R.id.rv_container);
        adapter = new Adapter(this, list);
        recyclerView.setAdapter(adapter);

    }

    private void loadContinents() {
        list = new ArrayList<>();
        list.add(new Model(R.drawable.ic_africa, "Africa", " ", 1));
        list.add(new Model(R.drawable.ic_asia, "Eurasia", " ", 2));
        list.add(new Model(R.drawable.ic_south1, "South America", "", 3));
        list.add(new Model(R.drawable.ic_avstralia, "Australia", "", 4 ));
        list.add(new Model(R.drawable.ic_northamerica, "North America", "", 5 ));
        list.add(new Model(R.drawable.ic_antractida, "Antractida", "", 6));

    }

    @Override
    public void onClickListener(Model model) {
        Bundle bundle = new Bundle();
        Fragment fragment = new CountryFragment();
        bundle.putInt(getString(R.string.key), model.getId());
        fragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container,
                fragment).addToBackStack("Назад").commit();

    }
}