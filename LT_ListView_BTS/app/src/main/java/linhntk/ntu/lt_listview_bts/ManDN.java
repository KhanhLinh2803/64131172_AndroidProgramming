package linhntk.ntu.lt_listview_bts;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class ManDN extends AppCompatActivity {
    ListView lvDSBH;
   public ArrayList<String> Dsbh = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_man_dn);
        lvDSBH = findViewById(R.id.lvDSBH);
        Dsbh.add("Boy with Love");
        Dsbh.add("DNA");
        Dsbh.add("Idol");
        Dsbh.add("Fake love");
        //khai bao adapter
        ArrayAdapter<String> adapterDsbh = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Dsbh);
        //gan adapter cho listview
        lvDSBH.setAdapter(adapterDsbh);
        //gan su kien
        lvDSBH.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //
                String Baihatduochon = Dsbh.get(position);

            }
        });
    }
}