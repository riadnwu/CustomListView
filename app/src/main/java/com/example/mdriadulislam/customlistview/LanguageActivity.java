package com.example.mdriadulislam.customlistview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LanguageActivity extends AppCompatActivity {

    private ImageView programImageView;
    private TextView programName,programCompiler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
       // programImageView=findViewById(R.id.program_image);
        programName= findViewById(R.id.program_name);
        programCompiler=findViewById(R.id.program_compiler);
        Intent secondIntent=getIntent();
        programName.setText("Programming Language: "+secondIntent.getStringExtra("programName"));
        programCompiler.setText("Compiler Name: "+secondIntent.getStringExtra("programCompiler"));

       /* if(getIntent().hasExtra("programImage"))
        {
            Bitmap bitmap= BitmapFactory.decodeByteArray(getIntent().getByteArrayExtra("programImage"),
                    0, getIntent().getByteExtra("programImage").length);
            programImageView.setImageBitmap(bitmap);
        }*/
    }
}
