package com.example.mylogin.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import android.widget.Toast;

import com.example.mylogin.R;
import com.example.mylogin.entity.Contactor;

import java.util.List;

public class ContactorAdapter extends BaseAdapter implements View.OnClickListener {
    Context context;
    List<Contactor> data;
    public ContactorAdapter(Context context, List<Contactor> list){
        this.context=context;
        this.data=list;
    }
    @Override
    public int getCount() {

        return this.data.size();
    }

    @Override
    public Object getItem(int i) {
        return this.data.get(i);
    }

    @Override
    public long getItemId(int i){
            return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view= LayoutInflater.from(context).inflate(R.layout.list_view,null);
        TextView txtTitle=view.findViewById(R.id.txtTitle);
        TextView txtSubTitle=view.findViewById(R.id.txtSubTitle);
        TextView txtContent=view.findViewById(R.id.txtContent);
        Contactor contactor=this.data.get(i);

        txtTitle.setText(contactor.getTitle());
        txtSubTitle.setText(contactor.getSubtitle());
        txtContent.setText(contactor.getContent());

        view.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        TextView textView=view.findViewById(R.id.txtTitle);
        Toast.makeText(context, textView.getText(), Toast.LENGTH_SHORT).show();
    }
}
