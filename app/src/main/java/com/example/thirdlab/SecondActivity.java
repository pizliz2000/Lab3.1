package com.example.thirdlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String dateString = format.format(new Date());
    String text = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView) findViewById(R.id.textView);

        DatabaseHelper db = new DatabaseHelper(this);

        //   db.deleteAll();




        //reading and displaying all contacts
        List<Contact> contacts = db.getAllContacts();

        for (Contact c : contacts) {
            String log = "ID: " + c.getId() + "\nFIO: " +
                    c.getName()+" " + c.getMiddleName()+" " + c.getLastName()+" "
                    + "\nDATE: " + c.getDate() + "\n+-------------------------------------+\n";
            text = text + log;
        }

        textView.setText(text);

    }
}
