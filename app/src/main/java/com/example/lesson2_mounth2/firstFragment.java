package com.example.lesson2_mounth2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class firstFragment extends Fragment {

    Button decrement,increment;
    TextView result;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        decrement = requireActivity().findViewById(R.id.button_);
        increment = requireActivity().findViewById(R.id.button__);
        result = requireActivity().findViewById(R.id.nulll);


        increment.setOnClickListener(view1 -> {
            String currentValue = result.getText().toString();
            int value = Integer.parseInt(currentValue);
            value++;
            result.setText(String.valueOf(value));

        });

        decrement.setOnClickListener(view12 -> {
            String currentValue = result.getText().toString();
            int value = Integer.parseInt(currentValue);
            value--;
            result.setText(String.valueOf(value));


        });
    }
}
