package vn.edu.hust.listapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class ThirdActivity extends AppCompatActivity {

    List<ContactModel> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        contacts = new ArrayList<>();
        contacts.add(new ContactModel("hoang", "one" , R.drawable.thumb1,"10 am"));
        contacts.add(new ContactModel("huy", "two", R.drawable.thumb2,"10:01 am"));
        contacts.add(new ContactModel("hung", "how are you", R.drawable.thumb3,"10:02 am"));
        contacts.add(new ContactModel("face", "free style", R.drawable.thumb4,"10:03 am"));
        contacts.add(new ContactModel("User5", "ty", R.drawable.thumb5,"10:04 am"));
        contacts.add(new ContactModel("User6", "this is my first test", R.drawable.thumb6,"10:05 am"));
        contacts.add(new ContactModel("User7", "uufhgiudh", R.drawable.thumb7,"10:06 am"));
        contacts.add(new ContactModel("User8", "user8@localhost", R.drawable.thumb8,"10:07 am"));
        contacts.add(new ContactModel("User9", "user9@localhost", R.drawable.thumb9,"10:08 am"));
        contacts.add(new ContactModel("User10", "user10@localhost", R.drawable.thumb10,"10:09 am"));
        contacts.add(new ContactModel("User11", "user11@localhost", R.drawable.thumb11,"10:10 am"));
        contacts.add(new ContactModel("User12", "user12@localhost", R.drawable.thumb12,"10:11 am"));
        contacts.add(new ContactModel("User13", "user13@localhost", R.drawable.thumb13,"10:12 am"));
        contacts.add(new ContactModel("User14", "user14@localhost", R.drawable.thumb14,"10:13 am"));
        contacts.add(new ContactModel("User15", "user15@localhost", R.drawable.thumb15,"10:14 am"));

        ListView listView = findViewById(R.id.list_view);
        ContactAdapter adapter = new ContactAdapter(contacts, this);
        listView.setAdapter(adapter);
    }
}
