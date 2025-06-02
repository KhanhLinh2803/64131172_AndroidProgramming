package linhntk.ntu.funwords;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    adapteritem adapter;
    List<item> itemList;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // layout của test.java

        recyclerView = findViewById(R.id.lvhinh); // Dùng id 'lvhinh' cho RecyclerView

        itemList = new ArrayList<>();
        itemList.add(new item("Chó", "dog"));   // R.drawable.dog
        itemList.add(new item("Mèo", "cat"));   // R.drawable.cat
        itemList.add(new item("Vịt", "duck"));  // R.drawable.duck

        adapter = new adapteritem(this, itemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
