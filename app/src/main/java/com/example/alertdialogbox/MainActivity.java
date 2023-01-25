package com.example.alertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        AlertDialog alertDialog = new AlertDialog.Builder(this).create();
//        alertDialog.setTitle("Terms & Condition");
//        alertDialog.setIcon(R.drawable.location);
//        alertDialog.setMessage("You are sure location on");
//        alertDialog.setButton("yes" , new DialogInterface.OnClickListener(){
//
//            @Override
//            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(MainActivity.this, "This is alert Dialog", Toast.LENGTH_SHORT).show();
//            }
//        });
//        alertDialog.show();


        AlertDialog.Builder deleteDialog = new AlertDialog.Builder(MainActivity.this);

        deleteDialog.setTitle("Location verification");
        deleteDialog.setIcon(R.drawable.location);
        deleteDialog.setMessage("Are you sure want to Location On");

        deleteDialog.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Your data re deleted", Toast.LENGTH_SHORT).show();
            }
        });

        deleteDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Your data will not be delete", Toast.LENGTH_SHORT).show();
            }
        });

        deleteDialog.show();
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder exit=new AlertDialog.Builder(this);

        exit.setTitle("Exit");
        exit.setIcon(R.drawable.delete);
        exit.setMessage("Are you want to deleted messagge");

        exit.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "Your data are not deleted  Welcome", Toast.LENGTH_SHORT).show();
            }
        });
        exit.setNegativeButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                MainActivity.super.onBackPressed();
            }
        });

        exit.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this, "You are comig dashboard", Toast.LENGTH_SHORT).show();
            }
        });
        exit.show();

    }
}