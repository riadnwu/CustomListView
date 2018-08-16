package com.example.mdriadulislam.customlistview.adepter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mdriadulislam.customlistview.R;
import com.example.mdriadulislam.customlistview.data_model.ProgramList;

import java.util.List;

public class CreateBaseAdeptere extends BaseAdapter {
    private List<ProgramList> programListList;
    private Context context;
    private ImageView programImageView;
    private TextView programName,programCompiler;

    public CreateBaseAdeptere(Context context,List<ProgramList> programListList)
    {
        this.programListList = programListList;
        this.context=context;
    }
    @Override
    public int getCount() {
        return programListList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.custom_list_view,null);
            programImageView=view.findViewById(R.id.program_image);
            programName= view.findViewById(R.id.program_name);
            programCompiler=view.findViewById(R.id.program_compiler);
            programImageView.setImageResource(programListList.get(i).getLanguageImage());
            programName.setText(programListList.get(i).getLanguage());
            programCompiler.setText(programListList.get(i).getLanguageCompiler());
            return view;
    }
}
