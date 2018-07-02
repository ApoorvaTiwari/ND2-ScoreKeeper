package com.example.apoorva.keepthescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    int pointA = 0;
    int pointB = 0;
    int foulA = 0;
    int foulB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displaypointA(int point) {
        TextView pointView = (TextView) findViewById(R.id.team_a_score);
        pointView.setText(String.valueOf(point));
    }

    public void pointA(View view) {
        pointA = pointA + 1;
        displaypointA(pointA);
    }

    public void displayfoulbyA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_score);
        foulView.setText(String.valueOf(foul));
    }

    public void foulA(View view) {
        pointA = pointA - 1;
        displayfoulbyA(pointA);
    }

    public void displaypointB(int point) {
        TextView pointView = (TextView) findViewById(R.id.team_b_score);
        pointView.setText(String.valueOf(point));
    }

    public void pointB(View view) {
        pointB = pointB + 1;
        displaypointB(pointB);
    }

    public void displayfoulbyB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_score);
        foulView.setText(String.valueOf(foul));
    }

    public void foulB(View view) {
        pointB = pointB - 1;
        displayfoulbyB(pointB);
    }


    public void resetScore (View view) {
         pointA = 0;
         pointB = 0;
         foulA = 0;
         foulB = 0;
         displaypointA(pointA);
         displaypointB(pointB);
         displayfoulbyA(foulA);
         displayfoulbyB(foulB);

    }

}
