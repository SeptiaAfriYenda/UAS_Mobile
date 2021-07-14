package com.example.uas;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle b = getIntent().getExtras();
//membuat obyek dari widget textview
        TextView nama = (TextView) findViewById(R.id.namaValue);
        TextView umur = (TextView) findViewById(R.id.umurValue);
        TextView jeniskelamin = (TextView) findViewById(R.id.jeniskelaminValue);
        TextView univ = (TextView) findViewById(R.id.univValue);
//menset nilai dari widget textview
        nama.setText(b.getCharSequence("nama"));
        umur.setText(b.getCharSequence("umur"));
        jeniskelamin.setText(b.getCharSequence("jeniskelamin"));
        univ.setText(b.getCharSequence("univ"));
    }
}