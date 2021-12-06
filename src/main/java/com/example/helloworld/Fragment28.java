package com.example.helloworld;

import static android.graphics.Color.BLACK;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;


import com.example.helloworld.databinding.Fragment28Binding;
import com.madrapps.pikolo.ColorPicker;
import com.madrapps.pikolo.listeners.SimpleColorSelectionListener;

public class Fragment28 extends Fragment {

    private Fragment28Binding binding;
    private ColorPicker colorPicker;
    private ImageView imageView;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;

    int[][] arrayRGB = new int[240][3];
    int red;
    int green;
    int blue;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = Fragment28Binding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        imageView = view.findViewById(R.id.imageView);
        button1 = view.findViewById(R.id.button1);
        button2 = view.findViewById(R.id.button2);
        button3 = view.findViewById(R.id.button3);
        button4 = view.findViewById(R.id.button4);
        button5 = view.findViewById(R.id.button5);
        button6 = view.findViewById(R.id.button6);
        button7 = view.findViewById(R.id.button7);
        button8 = view.findViewById(R.id.button8);
        button9 = view.findViewById(R.id.button9);
        button10 = view.findViewById(R.id.button10);

        button1.setBackgroundColor(BLACK);
        button2.setBackgroundColor(BLACK);
        button3.setBackgroundColor(BLACK);
        button4.setBackgroundColor(BLACK);
        button5.setBackgroundColor(BLACK);
        button6.setBackgroundColor(BLACK);
        button7.setBackgroundColor(BLACK);
        button8.setBackgroundColor(BLACK);
        button9.setBackgroundColor(BLACK);
        button10.setBackgroundColor(BLACK);

        colorPicker = view.findViewById(R.id.RGBColorPicker);
        colorPicker.setColorSelectionListener(new SimpleColorSelectionListener() {
            @Override
            public void onColorSelected(int color) {
                // Do whatever you want with the color
                imageView.getBackground().setColorFilter(color, PorterDuff.Mode.MULTIPLY);

                binding.button1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button1.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=32; j<44; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                        }
                        //32-43
                    }
                });
                binding.button2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button2.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=20; j<32; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                        }
                        //20-31
                    }
                });
                binding.button3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button3.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=7; j<20; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                        }
                        //7-19
                    }
                });
                binding.button4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button4.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=0; j<7; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                            for(int j=121; j<128; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                        }
                        //0-6 & 121-127
                    }
                });
                binding.button5.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button5.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=108; j<121; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                        }
                        //108-120
                    }
                });
                binding.button6.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button6.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=96; j<108; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                        }
                        //96-107
                    }
                });
                binding.button7.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button7.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=84; j<96; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                        }
                        //84-95
                    }
                });
                binding.button8.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button8.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=71; j<84; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                        }
                        //71-83
                    }
                });
                binding.button9.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button9.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=57; j<71; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                        }
                        //57-70
                    }
                });
                binding.button10.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button10.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=44; j<57; j++){
                                if(i==0){
                                    arrayRGB[j][i] = red;
                                }
                                if(i==1){
                                    arrayRGB[j][i] = green;
                                }
                                if(i==2){
                                    arrayRGB[j][i] = blue;
                                }
                            }
                        }
                        //44-56
                    }
                });

            }
        });


        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Fragment28.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}