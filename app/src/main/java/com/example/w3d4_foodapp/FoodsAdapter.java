package com.example.w3d4_foodapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;


//TODO: 4. Recyclerview neyden extend olacağını belirttik
//TODO: 5. Adapter in methodlarını implement ettik
//TODO: 6. FoodViewHolder ı oluşturduk
//TODO: 7. onCreateViewHolder --> onBindViewHolder --> getItemCount
public class FoodsAdapter extends RecyclerView.Adapter<FoodsAdapter.FoodViewHolder> {

    private final List<FoodModel> foodList;

    private final LayoutInflater layoutInflater;

    private FoodItemClickListener foodItemClickListener;


    @NonNull
    @Override
    public FoodsAdapter.FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView=layoutInflater.inflate(R.layout.row_food,parent,false);
        return new FoodViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodsAdapter.FoodViewHolder holder, int position) {

        FoodModel foodModel=foodList.get(position);
        holder.foodName.setText(foodModel.getFoodName());
        holder.foodTime.setText(foodModel.getFoodTime());
        holder.foodImage.setImageResource(foodModel.getFoodImage());
        holder.foodCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foodItemClickListener.onItemClicked(foodModel);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    //TODO: 8.
    public FoodsAdapter(Context context, ArrayList<FoodModel> foodList, FoodItemClickListener foodItemClickListener){
        layoutInflater=LayoutInflater.from(context);
        this.foodList=foodList;
        this.foodItemClickListener=foodItemClickListener;
    }

    class FoodViewHolder extends RecyclerView.ViewHolder{

        public final TextView foodName;
        public final TextView foodTime;
        public final ImageView foodImage;
        public final CardView foodCardView;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName=itemView.findViewById(R.id.textViewFoodName);
            foodTime=itemView.findViewById(R.id.textViewFoodTime);
            foodImage=itemView.findViewById(R.id.imageViewFood);
            foodCardView=itemView.findViewById(R.id.cardViewFood);
        }
    }

    //TODO: 9. FoodItemClickListener adlı interface i ekledik
    public interface FoodItemClickListener{
        void onItemClicked(FoodModel foodModel);
    }


}
