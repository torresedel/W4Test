package com.example.admin.w4test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  1.    Say you have a string of characters.
//      Write an algorithm to collect and return
//      a list of all substrings such that order is
//      maintained but characters may be skipped.
//      So “frog” can produce fog, fg, rg, etc.

//2. Sort the array with multiple same values in the array in an ascending order.
//        Input: {2,8,9,3,4,3,2,6,6,2,4,9,8}
//        Output: {2,2,2,3,3,4,4,6,6,8,8,9,9}
//        -Also find the highest number in the array (do not use any collections method)

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);

        textView = (TextView) findViewById(R.id.textView);

    }


    public void getStringCombination(View view) {

        String string = editText.getText().toString();

        List<String> stringList = getSubstrings(string);

        String print = "";

        for (int i = 0; i < stringList.size(); i++) {
            print += stringList.get(i) + " - ";
        }
        textView.setText(print);

    }

    private List<String> getSubstrings(String string) {

        //rop - fop - frp - fro - fr - fo - fp - ro - rp - op - f - r - o - p - frop - empty

        /*List<String> list = new ArrayList<>();

        int size = string.length();
        int iter = size * size;
        int counter = 0;
        int x = 0;
        String tempStr = "";

        list.add(string);
        for (int i = 0; i < size; i++) {

            for (int j = 0; j < size; j++) {

                if(counter < size) {
                    if (i != j) {
                        tempStr += string.charAt(j);
                    }
                }else if(counter > size)
            }
            counter++;
            if (counter != size && i == size - 1) {
                i = -1;
            }
        }

        return list;


        }*/

        List<String> list = new ArrayList<>();

        for (int i = 0; i < (1 << string.length()); i++) {
            list.add(getSubSet(string, i));
        }
        return list;
    }

    public String getSubSet(String input, int index) {
        String returnValue = "";
        for (int i = 0; i < input.length(); i++) {
            if (i != 0 && (1 << i) != 0)
                returnValue += input.charAt(i);
        }
        return returnValue;
    }
}