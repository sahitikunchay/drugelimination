package com.example.acer.drugeliminator;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ListView;
import android.content.Intent;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.example.acer.drugeliminator.DisplayActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    ListView lv;
    Model modelItems[];
    Intent mIntent;
    String score = "", sentiment = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listView);

        modelItems = new Model[26];
        modelItems[0] = new Model("Nausea", 0);
        modelItems[1] = new Model("Weight Loss", 0);
        modelItems[2] = new Model("Headache", 0);
        modelItems[3] = new Model("Diarrhoea", 0);
        modelItems[4] = new Model("Decreased Appetite", 0);
        modelItems[5] = new Model("Vomiting", 0);
        modelItems[6] = new Model("Erucation", 0);
        modelItems[7] = new Model("Somnolence", 0);
        modelItems[8] = new Model("Dyspepsia", 0);
        modelItems[9] = new Model("Pain", 0);
        modelItems[10] = new Model("Discomfort", 0);
        modelItems[11] = new Model("Fatigue", 0);
        modelItems[12] = new Model("Oropharengeal Pain", 0);
        modelItems[13] = new Model("Extreme Pain", 0);
        modelItems[14] = new Model("Ineffectiveness", 0);
        modelItems[15] = new Model("Cold Flashes", 0);
        modelItems[16] = new Model("Arthralgia", 0);
        modelItems[17] = new Model("Flatulence", 0);
        modelItems[18] = new Model("Abdominal Distention", 0);
        modelItems[19] = new Model("Bdominal Discomfort", 0);
        modelItems[20] = new Model("Constipation", 0);
        modelItems[21] = new Model("Dizziness", 0);
        modelItems[22] = new Model("BG Increase", 0);
        modelItems[23] = new Model("Bladder Cancer", 0);
        modelItems[24] = new Model("Swelling and Cramps", 0);
        modelItems[25] = new Model("BG Decrease", 0);



        final CustomAdapter adapter = new CustomAdapter(this, modelItems);
        lv.setAdapter(adapter);

        for(int i=0; i<lv.getChildCount(); i++){
            final int finalI = i;
            lv.getChildAt(i).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View pView) {
                    modelItems[finalI].setValue(1);
                }
            });
        }


        mIntent = new Intent(this, DisplayActivity.class);


        //Intent mIntent;
        Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View pView) {
                startActivity(mIntent);
//                for(int i=0; i<26; i++){
//                    CheckBox c = (CheckBox)lv.getChildAt(i).;
//                    if(c.isChecked()){
//                        modelItems[i].setValue(1);
//                    }
//                }
                //adapter.notifyDataSetChanged();
                //lv.getChildAt()
//                final String actos = modelItems[22].getValue()+modelItems[23].getValue()+modelItems[0].getValue()+modelItems[1].getValue()+modelItems[4].getValue()+modelItems[25].getValue()+modelItems[21].getValue()+modelItems[5].getValue()+"0"+modelItems[3].getValue()+
//                        modelItems[24].getValue()+modelItems[11].getValue()+modelItems[9].getValue();
//
//                Toast.makeText(getApplicationContext(), actos, Toast.LENGTH_LONG);
//                Log.d("drug", actos);
//                String url = "http://manasak.pythonanywhere.com/getActosRatings?symptoms="+actos;
//
//
//                String tag_json_obj = "json_obj_req";
//
//
//                JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
//                        url, null,
//                        new Response.Listener<JSONObject>() {
//
//                            @Override
//                            public void onResponse(JSONObject response) {
//                                Log.d("drug", response.toString());
//                                try {
//                                    score = response.getString("score");
//                                    sentiment = response.getString("sentiment");
//                                } catch (JSONException pE) {
//                                    pE.printStackTrace();
//                                }
//                                //pDialog.hide();
//                            }
//                        }, new Response.ErrorListener() {
//
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        VolleyLog.d("drug", "Error: " + error.getMessage());
//                        // hide the progress dialog
//                        //pDialog.hide();
//                    }
//                });
//
//// Adding request to request queue
//                AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);
            }
        });

    }

//    @Override
//    public boolean onCreateOptionMenu(Menu menu){
//        getMenuInflater().inflate(R.menu.main, menu);
//        return true;
//    }

}
