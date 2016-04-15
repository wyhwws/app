package wyh.tutorial.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import wyh.tutorial.ItemDetailActivity;
import wyh.tutorial.R;
import wyh.tutorial.model.MessageDetailModel;

/**
 * Created by Administrator on 2016/4/14.
 */
public class MessageListAdapter extends RecyclerView.Adapter<MessageListAdapter.ViewHolder>{
    private Context mContext;
    private ArrayList<MessageDetailModel> mMessageDetailModels;

    public MessageListAdapter(Context mContext,ArrayList<MessageDetailModel> mMessageDetailModels) {
        this.mContext = mContext;
        this.mMessageDetailModels = mMessageDetailModels;

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_list_content,null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, ItemDetailActivity.class);
                intent.putExtra("id",mMessageDetailModels.get(position).getId());
                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{

        public TextView name;
        public TextView address;
        public View itemView;
        public ImageView icon;
        public ViewHolder(View itemView) {

            super(itemView);
            this.itemView=itemView;
            name = (TextView)itemView.findViewById(R.id.title);
            address=(TextView)itemView.findViewById(R.id.address);
            icon=(ImageView) itemView.findViewById(R.id.icon);

        }
    }
}
