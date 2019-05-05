package com.example.ege.popquiz;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {
    TextView txtQuestion;
    TextView txtAnswer;
    String result="";
    Spinner spn;
    int qId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtQuestion = findViewById(R.id.txtQ);
        txtAnswer = findViewById(R.id.txtA);
        spn= findViewById(R.id.spn);
        ArrayAdapter adapter =  new ArrayAdapter(this,R.layout.support_simple_spinner_dropdown_item,new String[]{"a","b","c","d"});
        spn.setAdapter(adapter);
        try {
            GetQuiz getQuiz= new GetQuiz();
            txtQuestion.setText( getQuiz.execute("http://94.138.207.51:8080/AndroidQuizService/rest/quiz/question").get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }

    class GetQuiz extends AsyncTask<String,Void,String>

    {

        @Override
        protected String doInBackground(String... strings) {
            String urlStr = strings[0];
            String qu="";
            URL url = null;
            try {
                url = new URL(urlStr);

            HttpURLConnection conn =
                    (HttpURLConnection)url.openConnection();

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );
            String question = reader.readLine();
                JSONObject obj = new JSONObject(question);
                JSONArray arr = obj.getJSONArray("questionArray");
                for(int i = 0;i< arr.length();i++)
                {
                    JSONObject current =(JSONObject) arr.get(i);
                    qId=current.getInt("id");
                   qu =current.getString("question") + current.getString("answers");

                }

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (JSONException e) {
                e.printStackTrace();
            }
            return qu;
        }

    }

    public void onclickAnswer()
    {

        spn.getSelectedItem().toString();
    }

}
