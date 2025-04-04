package linhntk.ntu.lt_gk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class Cau2 extends AppCompatActivity {
    ImageView imgcau2;
    ListView lvGK;
    ArrayList<String> dsGk = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        imgcau2 = findViewById(R.id.imgcau2);
        lvGK = findViewById(R.id.lvGK);

        imgcau2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent img2 = new Intent(Cau2.this, MainActivity.class);
                startActivity(img2);
            }
        });
        dsGk.add("Chuyên đề_G6.204");
        dsGk.add("Linux_NDN.206");
        dsGk.add("Nguyên lý máy học_G6.204");
        dsGk.add("Lập trình thuyết bị di động_NDN.205");
        ArrayAdapter<String> adapterDS = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsGk);
        lvGK.setAdapter(adapterDS);
        lvGK.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String getdsGK = dsGk.get(position);
                Intent ds = new Intent(Cau2.this, Cau2_2.class);
                ds.putExtra("abc", getdsGK);
                startActivity(ds);
            }
        });
    }
}