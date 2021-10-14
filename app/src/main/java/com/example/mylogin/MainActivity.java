package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.example.mylogin.adapters.ContactorAdapter;
import com.example.mylogin.entity.Contactor;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity  {

    private AlertDialog dialog;
    private Button loginbtn,nobtn;
    private EditText username,pwdname;

    ListView listView;

    List<Contactor> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //init();
        listView=findViewById(R.id.listview);
        list=new ArrayList<Contactor>();
        list.add(new Contactor("2021年","互联网移动应用开发赛项","获得湖南省一等奖"));
        list.add(new Contactor("2022年","互联网移动应用开发赛项","获得全国二等奖"));
        list.add(new Contactor("2023年","互联网移动应用开发赛项","获得全国一等奖"));

        listView.setAdapter(new ContactorAdapter(this,list));
    }
    private void init(){
        dialog=new AlertDialog.Builder(MainActivity.this).create();
        View dialogView=View.inflate(MainActivity.this,R.layout.activity_main,null);
        dialog.setView(dialogView);
        dialog.setCancelable(false);
        dialog.show();

        username=dialogView.findViewById(R.id.username);
        pwdname=dialogView.findViewById(R.id.pwd);
        loginbtn=dialogView.findViewById(R.id.loginbtn);
        nobtn=dialogView.findViewById(R.id.nobtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                String user=username.getText().toString();
                String pwd=pwdname.getText().toString();
                //是否为空
                if (TextUtils.isEmpty(user)){
                    Toast.makeText(MainActivity.this, "请输入账号", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(pwd)){
                    Toast.makeText(MainActivity.this, "请输入密码", Toast.LENGTH_SHORT).show();
                    return;
                }
                //账号密码
                if (user.equals("admin")&&pwd.equals("123456")){
                    Toast.makeText(MainActivity.this, "登录成功！！！", Toast.LENGTH_SHORT).show();
                    finish();
                }else {
                    Toast.makeText(MainActivity.this, "账号或密码错误！请重新输入", Toast.LENGTH_SHORT).show();
                    username.setText("");
                    pwdname.setText("");
                }
            }
        });
        //取消按钮
        nobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "已取消登录", Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }

}