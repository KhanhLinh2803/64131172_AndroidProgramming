package thigk2.nguyenthikhanhlinh;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class cau2 extends AppCompatActivity {
    ListView lv;
    ArrayList<String> dsGk = new ArrayList<String>();
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cau2);
        lv = findViewById(R.id.lv);

        dsGk.add("Tiến về Sài Gòn");
        dsGk.add("Giải phóng Miền nam");
        dsGk.add("Đất nước trọn niềm vui");
        dsGk.add("Bài ca thống nhất");
        dsGk.add("Mùa xuân trên thành phố HCM");
        dsGk.add("...");
        ArrayAdapter<String> adapterDS = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dsGk);
        lv.setAdapter(adapterDS);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String getdsGK = dsGk.get(position);
                Intent ds = new Intent(cau2.this, cau22.class);
                ds.putExtra("abc", getdsGK);
                startActivity(ds);
            }
        });

    }
}