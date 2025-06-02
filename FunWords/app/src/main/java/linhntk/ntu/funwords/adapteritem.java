package linhntk.ntu.funwords;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class adapteritem extends RecyclerView.Adapter<adapteritem.itemnho> {

    private Context context;
    private List<item> itemList;

    public adapteritem(Context context, List<item> itemList) {
        this.context = context;
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public itemnho onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_test, parent, false);
        return new itemnho(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemnho holder, int position) {
        item currentItem = itemList.get(position);

        // Lấy id hình ảnh từ tên
        int imageResId = context.getResources().getIdentifier(currentItem.getId_img(), "drawable", context.getPackageName());
        holder.imgg.setImageResource(imageResId);

        // Set text cho button
        holder.btnn.setText(currentItem.getId_button());

        // Xử lý sự kiện nếu cần
        holder.btnn.setOnClickListener(v -> {
            // Ví dụ: In ra tên button
            // Toast.makeText(context, "Bạn bấm: " + currentItem.getId_button(), Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }

    public static class itemnho extends RecyclerView.ViewHolder {
        ImageView imgg;
        Button btnn;

        public itemnho(@NonNull View itemView) {
            super(itemView);
            imgg = itemView.findViewById(R.id.imgg);
            btnn = itemView.findViewById(R.id.btnn);
        }
    }
}
