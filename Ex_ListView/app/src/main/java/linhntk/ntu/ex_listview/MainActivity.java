package linhntk.ntu.ex_listview;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listViewNNLT;
    ArrayList<String> dsNgonngu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        listViewNNLT = findViewById(R.id.lvNNLT);
        //Buoc 1: chuan bi du lieu, hard-core
        dsNgonngu = new ArrayList<String>();
        dsNgonngu.add("C++");
        dsNgonngu.add("C#");
        dsNgonngu.add("Java");
        //Buoc 2:
        ArrayAdapter<String> adapterNNLT;
        adapterNNLT = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, dsNgonngu);
        //Buoc 3: gan adapter
        listViewNNLT.setAdapter(adapterNNLT);
        //Buoc 4: gan bo lang nghe va xuly sk
        listViewNNLT.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //code xu ly truc tiep o day
                //chu y: bien position chu vi tri item duoc click
                String giatriDuochon = dsNgonngu.get(position);
                //lam gi do voi gia tri tuy yeu cau
                Toast.makeText(MainActivity.this, giatriDuochon, Toast.LENGTH_SHORT).show();
            }
        });

    }
}