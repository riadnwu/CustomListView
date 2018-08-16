package com.example.mdriadulislam.customlistview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v4.graphics.BitmapCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mdriadulislam.customlistview.adepter.CreateBaseAdeptere;
import com.example.mdriadulislam.customlistview.data_model.ProgramList;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

public class CustomListViewMainActivity extends AppCompatActivity {

    private int[] languageImage;
    private String[] languageName,languageCompiler;
    private List<ProgramList> programListList;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list_view_main);
        programListList=new ArrayList<>();
        languageImage= new int[]{R.drawable.android, R.drawable.java, R.drawable.python, R.drawable.php, R.drawable.cs, R.drawable.cpp, R.drawable.cuda,R.drawable.js, R.drawable.ruby};
        languageName=new String[]{"Android","Java","Python","PHP","C#","C++","CUDA C","Java Script","Ruby"};
        languageCompiler=new String[]{"Android Stdio","Net Beans","Pycharm","Net Beans","Visual Stdio","Code Blocks","Visual Stdio","Net Beans","Janina"};
        for (int i=0;i<9;i++)
        {
            ProgramList programList=new ProgramList(languageImage[i],languageName[i],languageCompiler[i]);
            programListList.add(programList);
        }
        listView=findViewById(R.id.list_view);
        CreateBaseAdeptere createBaseAdeptere=new CreateBaseAdeptere(this,programListList);
        listView.setAdapter(createBaseAdeptere);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                ImageView programImageView;
                TextView programName,programCompiler;
                intent = new Intent(CustomListViewMainActivity.this,LanguageActivity.class);
                programImageView=findViewById(R.id.program_image);
                programName= findViewById(R.id.program_name);
                programCompiler=findViewById(R.id.program_compiler);
                intent.putExtra("programName",programName.getText().toString());
                intent.putExtra("programCompiler",programCompiler.getText().toString());

//                ByteArrayOutputStream baos=new ByteArrayOutputStream();
//                bitmap.compress(Bitmap.CompressFormat.PNG,50,baos);
//                intent.putExtra("programImage",baos.toByteArray());


                startActivity(intent);


            }
        });

    }
}
