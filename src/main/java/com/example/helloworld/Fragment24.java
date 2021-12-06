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

import com.example.helloworld.databinding.Fragment24Binding;
import com.madrapps.pikolo.ColorPicker;
import com.madrapps.pikolo.listeners.SimpleColorSelectionListener;

public class Fragment24 extends Fragment {

    private Fragment24Binding binding;
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

        binding = Fragment24Binding.inflate(inflater, container, false);
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
                            for(int j=29; j<39; j++){
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
                        //29-38
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
                            for(int j=18; j<29; j++){
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
                        //18-28
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
                            for(int j=6; j<18; j++){
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
                        //6-17
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
                            for(int j=0; j<6; j++){
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
                            for(int j=107; j<112; j++){
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
                        //0-5 & 107-111
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
                            for(int j=95; j<107; j++){
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
                        //95-106
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
                            for(int j=84; j<95; j++){
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
                        //84-94
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
                            for(int j=74; j<84; j++){
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
                        //74-83
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
                            for(int j=62; j<74; j++){
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
                        //62-73
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
                            for(int j=51; j<62; j++){
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
                        //51-61
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
                            for(int j=39; j<51; j++){
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
                        //39-50
                    }
                });

            }
        });


        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Fragment24.this)
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