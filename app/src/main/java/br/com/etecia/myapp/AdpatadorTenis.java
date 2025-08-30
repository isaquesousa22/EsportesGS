package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdpatadorTenis extends RecyclerView.Adapter<AdpatadorTenis.ViewHolder> {

    private Context context;
    private List<Tenis> lstTenis;

    public AdpatadorTenis(Context context, List<Tenis> lstTenis){
        this.context = context;
        this.lstTenis = lstTenis;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater .inflate(R.layout.modelotenis,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nomeTenis.setText(lstTenis.get(position).getNomeTenis());
        holder.imgCardTenis.setImageResource(lstTenis.get(position).getImgCardTenis());

    }

    @Override
    public int getItemCount() {
        return lstTenis.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView  imgCardTenis;
        TextView   nomeTenis;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imgCardTenis = itemView.findViewById(R.id.imgCardTenis);
            nomeTenis = itemView.findViewById(R.id.nomeTenis);
        }
    }


}
