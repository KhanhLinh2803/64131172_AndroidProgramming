package linhntk.ntu.recycleview;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class OntapCau2 extends AppCompatActivity {

    adapterRcv adapter2;
    ArrayList<Thuoctinh> arrayList1;
    RecyclerView rvc2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_ontap_cau2);
        rvc2 = findViewById(R.id.rvc2);

        arrayList1 = lv1();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        rvc2.setLayoutManager(layoutManager);

        adapter2 = new adapterRcv(this, arrayList1);

        rvc2.setAdapter(adapter2);
    }
    ArrayList<Thuoctinh> lv1(){
        ArrayList<Thuoctinh> hihi = new ArrayList<Thuoctinh>();
        Thuoctinh hh = new Thuoctinh("Bang khen","img");
        hihi.add(hh);
        return hihi;
    }
}