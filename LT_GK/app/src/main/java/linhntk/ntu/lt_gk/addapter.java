package linhntk.ntu.lt_gk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class addapter extends RecyclerView.Adapter<addapter.ItemadapterHolder> {

    @NonNull
    @Override
    public ItemadapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemadapterHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    class ItemadapterHolder extends RecyclerView.ViewHolder{
        TextView txtTitle, txtContent;
        ImageView imgBTS;

        public ItemadapterHolder(@NonNull View itemView) {
            super(itemView);
            txtContent = itemView.findViewById(R.id.txtContent);
            txtTitle = itemView.findViewById(R.id.txtTitle);
            imgBTS = itemView.findViewById(R.id.imgBTS);
        }
    }
}
