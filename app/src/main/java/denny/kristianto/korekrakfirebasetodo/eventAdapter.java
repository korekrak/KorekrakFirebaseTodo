package denny.kristianto.korekrakfirebasetodo;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

/**
 * KorekrakFirebaseTodo
 * Created by Denny Kristianto on 21/09/2017.
 * Copyright (c) 2017 by Denny Kristianto
 */

public class eventAdapter  extends RecyclerView.Adapter<eventAdapter.EventHolder>{
    private ArrayList<EventObj> eventObjs;

    public class EventHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView eName, eDesc;

        public EventHolder(View itemView) {
            super(itemView);
            eName=(TextView) itemView.findViewById(R.id.textEventTitle);
            eDesc=(TextView)itemView.findViewById(R.id.textEventDesc);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.d("RecyclerViewClick","Clicked :)");
            /*
            Context context = itemView.getContext();
            Intent showPhotoIntent = new Intent(context, PhotoActivity.class);
            showPhotoIntent.putExtra(PHOTO_KEY, mPhoto);
            context.startActivity(showPhotoIntent);
            * */
        }
    }

    public  eventAdapter (ArrayList<EventObj> eventObj){
        eventObjs=eventObj;
    }
    @Override
    public eventAdapter.EventHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflated= LayoutInflater.from(parent.getContext()).inflate(R.layout.event_row,parent,false);
        return new EventHolder(inflated);
    }

    @Override
    public void onBindViewHolder(eventAdapter.EventHolder holder, int position) {
        EventObj event=eventObjs.get(position);
        holder.eName.setText(event.getEventName());
        holder.eDesc.setText(event.getEventDesc());
    }

    @Override
    public int getItemCount() {
        return  eventObjs.size();
    }
}
