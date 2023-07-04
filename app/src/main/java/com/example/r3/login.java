package com.example.r3;

import androidx.appcompat.app.AppCompatActivity;
import android.app.AlertDialog;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.content.Intent;
public class login extends AppCompatActivity {
    Button b5;
    EditText et2,et3;
    String user = null;
    String pass = null;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginn);
        b5=findViewById(R.id.b5);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
        db = openOrCreateDatabase("userDB", Context.MODE_PRIVATE, null);
        db.execSQL("CREATE TABLE IF NOT EXISTS user(username varchar PRIMARY kEY,password varchar)");
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et2.getText().toString().length() == 0 || et3.getText().toString().length()
                        == 0) {
                    Toast.makeText(getApplicationContext(), "Please enter details",Toast.LENGTH_LONG).show();
                    return;

                }
                if(et3.getText().toString().length()<8){
                    Toast.makeText(getApplicationContext(), "Password must contain 8 characters",Toast.LENGTH_LONG).show();
                    return;
                }
                Cursor c=db.rawQuery("SELECT * FROM user WHERE username='"+et2.getText()+"'", null);
                if(c.moveToFirst())
                {
                    user=c.getString(0);
                    pass=c.getString(1);
                }

                if(et3.getText().toString().equals(pass) ){
                    Toast.makeText(getApplicationContext(),"logged in succesfully",Toast.LENGTH_LONG).show();
                    goToRecipes();
                    clearText();
                }else{
                    showMessage("ERROR","INCORRECT PASSWORD");
                    clearText();
                }
                if(user == null){
                    showMessage("ERROR","PLEASE SIGN UP FIRST TO LOGIN");
                    clearText();
                }
            }
        });

    }
    public void showMessage(String title,String message)
    {
        AlertDialog.Builder b=new AlertDialog.Builder(this);
        b.setCancelable(true);
        b.setTitle(title);
        b.setMessage(message);
        b.show();
    }
    private void clearText()
    {
        et2.setText("");
        et3.setText("");

    }
    public void goToRecipes() {
        Intent intent = new Intent(login.this, RecipesActivity.class);
        startActivity(intent);
    }




}


