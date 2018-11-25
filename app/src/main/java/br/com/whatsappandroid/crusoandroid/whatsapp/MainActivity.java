package br.com.whatsappandroid.crusoandroid.whatsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    //private DatabaseReference referenciaFireBase = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        try {
//            referenciaFireBase.child("pontos").setValue(100);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
