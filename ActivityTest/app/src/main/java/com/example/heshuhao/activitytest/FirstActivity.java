package com.example.heshuhao.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.first_layout);

        Button button1 = (Button)findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
//            //点击按钮弹出toast
//            public void onClick(View v){
//                Toast.makeText(FirstActivity.this,"You clicked button 1",Toast.LENGTH_LONG).show();
//            }

//            //点击按钮退出（销毁）
//            @Override
//            public void onClick(View v){
//                finish();
//            }
//            //intent显式的练习
//            @Override
//            public void onClick(View v){
//                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
//                startActivity(intent);
//            }
//            //intent的隐式调用
//            @Override
//            public void onClick(View v){
//                Intent intent = new Intent("com.example.heshuhao.activitytest.ACTION_START");
//                intent.addCategory("com.example.heshuhao.activitytest.MY_CATEGORY");
//                startActivity(intent);
//            }
//            //intent更多的隐式调用：打开网页
//            @Override
//            public void onClick(View v){
//                Intent intent = new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://www.hshsilver.com"));
//                startActivity(intent);
//            }
//            //intent拨打电话
//            @Override
//            public void onClick(View v){
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);
//            }
//            //intent传递数据
//            @Override
//            public void onClick(View v){
//                String data = "Hello Second Activity!";
//                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
//                intent.putExtra("extra_data", data);
//                startActivity(intent);
//            }
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                startActivityForResult(intent,1);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if (requestCode == RESULT_OK){
                    String returnedData = data.getStringExtra("data_return");
                    Log.d("FirstActivity",returnedData);
                }
                break;
            default:
        }
    }
}
