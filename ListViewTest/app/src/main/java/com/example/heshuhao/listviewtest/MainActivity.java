package com.example.heshuhao.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

//    private String[]data={"apple","banana","orange","watermelon","pear","grape","pineapple","strawberry","cherry","mange",
//            "apple","banana","orange","watermelon","pear","grape","pineapple","strawberry","cherry","mange"};

    private List<Fruit> fruitList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
//        ListView listView = (ListView)findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
        initFruit();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruit(){
        for(int i = 0; i<2;i++){
            Fruit apple = new Fruit("Apple",R.drawable.apple_pic);
            fruitList.add(apple);
        }
    }
}
