package com.example.kingsleague.ui.menu;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.example.kingsleague.databinding.PantallaMenuBinding;
import com.example.kingsleague.ui.calendario.calendario;

public class menuPantalla extends Fragment {

private PantallaMenuBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        menuViewModel menuViewModel =
                new ViewModelProvider(this).get(menuViewModel.class);

    binding = PantallaMenuBinding.inflate(inflater, container, false);
    View root = binding.getRoot();

        return root;

        }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
    }
