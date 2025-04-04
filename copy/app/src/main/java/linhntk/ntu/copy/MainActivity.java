package linhntk.ntu.copy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Adapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rCv;
    adapter ad1;
    ArrayList<Item> arr;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        rCv = findViewById(R.id.rCv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rCv.setLayoutManager(layoutManager);

        ad1 = new adapter(this, arr);
        rCv.setAdapter(ad1);
    }
    public ArrayList<Item> getData() {
        ArrayList<Item> ar2 = new ArrayList<Item>();
        Item item1 = new Item("item1", "bg2");
        arr.add(item1);
        return arr;
    }
}