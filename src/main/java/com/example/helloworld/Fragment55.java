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

import com.example.helloworld.databinding.Fragment55Binding;
import com.madrapps.pikolo.ColorPicker;
import com.madrapps.pikolo.listeners.SimpleColorSelectionListener;

public class Fragment55 extends Fragment {

    private Fragment55Binding binding;
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

        binding = Fragment55Binding.inflate(inflater, container, false);
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
                            for(int j=67; j<82; j++){
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
                        //67-81
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
                            for(int j=53; j<67; j++){
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
                        //53-66
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
                            for(int j=38; j<53; j++){
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
                        //38-52
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
                            for(int j=23; j<38; j++){
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
                        //23-37
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
                            for(int j=8; j<23; j++){
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
                        //8-22
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
                            for(int j=0; j<8; j++){
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
                            for(int j=232; j<240; j++){
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
                        //0-7 & 232-239
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
                            for(int j=217; j<232; j++){
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
                        //217-231
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
                            for(int j=202; j<217; j++){
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
                        //202-216
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
                            for(int j=187; j<202; j++){
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
                        //187-201
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
                            for(int j=173; j<187; j++){
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
                        //173-186
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
                            for(int j=158; j<173; j++){
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
                        //158-172
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
                            for(int j=143; j<158; j++){
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
                        //143-157
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
                            for(int j=128; j<143; j++){
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
                        //128-142
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
                            for(int j=112; j<128; j++){
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
                        //112-127
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
                            for(int j=97; j<112; j++){
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
                        //97-111
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
                            for(int j=82; j<97; j++){
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
                        //82-96
                    }
                });

            }
        });





        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(Fragment55.this)
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