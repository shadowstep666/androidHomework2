package vn.edu.hust.listapp;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactAdapter extends BaseAdapter {

    List<ContactModel> contacts;
    Context context;

    public ContactAdapter(List<ContactModel> contacts, Context context) {
        this.contacts = contacts;
        this.context = context;
    }

    @Override
    public int getCount() {
        return contacts.size();
    }

    @Override
    public Object getItem(int i) {
        return contacts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        MyViewHolder viewHolder;
        if (view == null) {
            view = ((Activity)context).getLayoutInflater().inflate(R.layout.layout_item_2, null);

            viewHolder = new MyViewHolder();
            viewHolder.textUsername = view.findViewById(R.id.text_username);
            viewHolder.textMessage = view.findViewById(R.id.text_message);
//            viewHolder.imageAvatar = view.findViewById(R.id.image_avatar);
            viewHolder.imageAvatar = view.findViewById(R.id.text_avatar);
            viewHolder.checkBox = view.findViewById(R.id.check_box);
            viewHolder.time=view.findViewById(R.id.text_time);
            view.setTag(viewHolder);
        }
        else
        {
            viewHolder = (MyViewHolder)view.getTag();
        }

        final ContactModel contact = contacts.get(i);
        viewHolder.textUsername.setText(contact.getUsername());
        viewHolder.textMessage.setText(contact.getMessage());
//        viewHolder.imageAvatar.setImageResource(contact.getAvatar());

        viewHolder.imageAvatar.setText(contact.getFirstChar());
        viewHolder.time.setText(contact.getTime());
        viewHolder.checkBox.setChecked(contact.isSelected());


        viewHolder.checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contact.setSelected(((CheckBox)view).isChecked());
                notifyDataSetChanged();
            }
        });

        return view;
    }

    public class MyViewHolder {
        TextView textUsername;
        TextView textMessage;
//        ImageView imageAvatar;
        TextView imageAvatar;
        CheckBox checkBox;
        TextView time;
    }
}
