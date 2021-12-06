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

import com.example.helloworld.databinding.Fragment50Binding;
import com.madrapps.pikolo.ColorPicker;
import com.madrapps.pikolo.listeners.SimpleColorSelectionListener;

public class Fragment50 extends Fragment {

    private Fragment50Binding binding;
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
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;

    int[][] arrayRGB = new int[240][3];
    int red;
    int green;
    int blue;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = Fragment50Binding.inflate(inflater, container, false);
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
        button11 = view.findViewById(R.id.button11);
        button12 = view.findViewById(R.id.button12);
        button13 = view.findViewById(R.id.button13);
        button14 = view.findViewById(R.id.button14);
        button15 = view.findViewById(R.id.button15);
        button16 = view.findViewById(R.id.button16);

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
        button11.setBackgroundColor(BLACK);
        button12.setBackgroundColor(BLACK);
        button13.setBackgroundColor(BLACK);
        button14.setBackgroundColor(BLACK);
        button15.setBackgroundColor(BLACK);
        button16.setBackgroundColor(BLACK);

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
                            for(int j=62; j<75; j++){
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
                        //62-74
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
                            for(int j=48; j<62; j++){
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
                        //48-61
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
                            for(int j=35; j<48; j++){
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
                        //35-47
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
                            for(int j=21; j<35; j++){
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
                        //21-34
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
                            for(int j=7; j<21; j++){
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
                        //7-20
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
                            for(int j=213; j<220; j++){
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
                        //0-6 & 213-219
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
                            for(int j=199; j<213; j++){
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
                        //199-212
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
                            for(int j=185; j<199; j++){
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
                        //185-198
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
                            for(int j=172; j<185; j++){
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
                        //172-184
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
                            for(int j=158; j<172; j++){
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
                        //158-171
                    }
                });
                binding.button11.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button11.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=145; j<158; j++){
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
                        //145-157
                    }
                });
                binding.button12.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button12.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=131; j<145; j++){
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
                        //131-144
                    }
                });
                binding.button13.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button13.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=117; j<131; j++){
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
                        //117-130
                    }
                });
                binding.button14.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button14.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=103; j<117; j++){
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
                        //103-116
                    }
                });
                binding.button15.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button15.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=89; j<103; j++){
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
                        //89-102
                    }
                });
                binding.button16.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        button16.setBackgroundColor(color);
                        red = Color.red(color);
                        green = Color.green(color);
                        blue = Color.blue(color);
                        for(int i=0; i<3; i++){
                            for(int j=75; j<89; j++){
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
                        //75-88
                    }
                });

            }
        });





        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Fragment50.this)
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