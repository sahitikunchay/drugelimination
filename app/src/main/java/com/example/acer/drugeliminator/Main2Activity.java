package com.example.acer.drugeliminator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

public class Main2Activity extends AppCompatActivity {

    String actos = "", byetta = "", glucophage="", janovia = "", victoza = "", score="", sentiment = "";
    String actosScore = "", actosSentiment = "", byettaScore = "", byettaSentiment = "", glucophageScore = "", glucophageSentiment = "",
            januviaScore = "", januviaSentiment = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final CheckBox nauseaCheckBox = (CheckBox) findViewById(R.id.nauseacheckBox);
        final CheckBox bladderCancerCheckBox = (CheckBox) findViewById(R.id.bloodCancerVheckBox);
        final CheckBox bloodGlucoseIncreaseCheckBox = (CheckBox) findViewById(R.id.bgincreasecheckBox13);
        final CheckBox weightDecreasedCheckBox = (CheckBox) findViewById(R.id.weightLossCheckbox);
        final CheckBox decreasedAppetiteCheckBox = (CheckBox) findViewById(R.id.appetiteCheckBox);
        final CheckBox bloodGlucoseDecreaseCheckBox = (CheckBox) findViewById(R.id.bloodGlucoseDecreasecheckBox);
        final CheckBox dizzinessCheckBox = (CheckBox) findViewById(R.id.dizzyCheckbox);
        final CheckBox vomitingCheckBox = (CheckBox) findViewById(R.id.vomitingCheckbox);
        final CheckBox dyspnoiaCheckBox = (CheckBox) findViewById(R.id.DyspnoeacheckBox);
        final CheckBox diarrhoeaCheckBox = (CheckBox) findViewById(R.id.diarrCheckbox);
        final CheckBox swellingCheckbox = (CheckBox) findViewById(R.id.cswellingheckBox11);
        final CheckBox fatigueCheckbox = (CheckBox) findViewById(R.id.fatiguecheckBox8);
        final CheckBox painCheckbox = (CheckBox) findViewById(R.id.PaincheckBox12);
        final CheckBox headacheCheckBox = (CheckBox) findViewById(R.id.headachecheckBox);
        final CheckBox erucationCheckbox = (CheckBox) findViewById(R.id.ErucationcheckBox);
        final CheckBox somnolenceCheckbox = (CheckBox) findViewById(R.id.SomnolencecheckBox);
        final CheckBox dyspepsiaCheckbox = (CheckBox) findViewById(R.id.DyspepsiacheckBox);
        final CheckBox discomfortCheckbox = (CheckBox) findViewById(R.id.DiscomfortcheckBox);
        final CheckBox orophCheckbox = (CheckBox) findViewById(R.id.OropharengialcheckBox);
        final CheckBox extremepainCheckbox = (CheckBox) findViewById(R.id.ExtremecheckBox);
        final CheckBox ineffectiveCheckbox = (CheckBox) findViewById(R.id.ineffectivecheckBox);
        final CheckBox coldCheckbox = (CheckBox) findViewById(R.id.coldcheckBox2);
        final CheckBox flatulenceCheckbox = (CheckBox) findViewById(R.id.FlatulencecheckBox);
        final CheckBox abdominaldistentionCheckbox = (CheckBox) findViewById(R.id.AbdominalDistentioncheckBox);
        final CheckBox abdominaldiscomfortCheckbox = (CheckBox) findViewById(R.id.AbdominalDomfortcheckBox);
        final CheckBox constipationCheckbox = (CheckBox) findViewById(R.id.ConstipationcheckBox);
        final CheckBox arathralgiaCheckbox = (CheckBox) findViewById(R.id.ArethralgiacheckBox);

        Button submit = (Button) findViewById(R.id.button2);

        final Intent kIntent = new Intent(this, DisplayActivity.class);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View pView) {



                if(bloodGlucoseIncreaseCheckBox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(bladderCancerCheckBox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(nauseaCheckBox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(weightDecreasedCheckBox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(decreasedAppetiteCheckBox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(bloodGlucoseDecreaseCheckBox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(dizzinessCheckBox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(vomitingCheckBox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(dyspnoiaCheckBox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(diarrhoeaCheckBox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(swellingCheckbox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(fatigueCheckbox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }
                if(painCheckbox.isChecked()==true){
                    actos+="1";
                } else{
                    actos+="0";
                }

                Log.d("Actos", actos);


                if(nauseaCheckBox.isChecked()==true){
                    byetta+="1";
                } else{
                    byetta+="0";
                }
                if(weightDecreasedCheckBox.isChecked()==true){
                    byetta+="1";
                } else{
                    byetta+="0";
                }
                if(decreasedAppetiteCheckBox.isChecked()==true){
                    byetta+="1";
                } else{
                    byetta+="0";
                }
                if(somnolenceCheckbox.isChecked()==true){
                    byetta+="1";
                } else{
                    byetta+="0";
                }
                if(vomitingCheckBox.isChecked()==true){
                    byetta+="1";
                } else{
                    byetta+="0";
                }
                if(diarrhoeaCheckBox.isChecked()==true){
                    byetta+="1";
                } else{
                    byetta+="0";
                }
                if(headacheCheckBox.isChecked()==true){
                    byetta+="1";
                } else{
                    byetta+="0";
                }
                if(dizzinessCheckBox.isChecked()==true){
                    byetta+="1";
                } else{
                    byetta+="0";
                }
                if(painCheckbox.isChecked()==true){
                    byetta+="1";
                } else{
                    byetta+="0";
                }

                Log.d("Byetta", byetta);

                if(diarrhoeaCheckBox.isChecked()==true){
                    glucophage+="1";
                } else{
                    glucophage+="0";
                }
                if(nauseaCheckBox.isChecked()==true){
                    glucophage+="1";
                } else{
                    glucophage+="0";
                }
                if(weightDecreasedCheckBox.isChecked()==true){
                    glucophage+="1";
                } else{
                    glucophage+="0";
                }
                if(flatulenceCheckbox.isChecked()==true){
                    glucophage+="1";
                } else{
                    glucophage+="0";
                }
                if(headacheCheckBox.isChecked()==true){
                    glucophage+="1";
                } else{
                    glucophage+="0";
                }
                if(somnolenceCheckbox.isChecked()==true){
                    glucophage+="1";
                } else{
                    glucophage+="0";
                }
                if(abdominaldistentionCheckbox.isChecked()==true){
                    glucophage+="1";
                } else{
                    glucophage+="0";
                }
                if(decreasedAppetiteCheckBox.isChecked()==true){
                    glucophage+="1";
                } else{
                    glucophage+="0";
                }
                if(abdominaldistentionCheckbox.isChecked()==true){
                    glucophage+="1";
                } else{
                    glucophage+="0";
                }
                if(constipationCheckbox.isChecked()==true){
                    glucophage+="1";
                } else{
                    glucophage+="0";
                }
                Log.d("Glucophage", glucophage);

                if(painCheckbox.isChecked()==true){
                    janovia+="1";
                } else{
                    janovia+="0";
                }
                if(somnolenceCheckbox.isChecked()==true){
                    janovia+="1";
                } else{
                    janovia+="0";
                }
                if(nauseaCheckBox.isChecked()==true){
                    janovia+="1";
                } else{
                    janovia+="0";
                }
                if(discomfortCheckbox.isChecked()==true){
                    janovia+="1";
                } else{
                    janovia+="0";
                }
                if(fatigueCheckbox.isChecked()==true){
                    janovia+="1";
                } else{
                    janovia+="0";
                }
                if(orophCheckbox.isChecked()==true){
                    janovia+="1";
                } else{
                    janovia+="0";
                }
                if(extremepainCheckbox.isChecked()==true){
                    janovia+="1";
                } else{
                    janovia+="0";
                }
                if(ineffectiveCheckbox.isChecked()==true){
                    janovia+="1";
                } else{
                    janovia+="0";
                }
                if(coldCheckbox.isChecked()==true){
                    janovia+="1";
                } else{
                    janovia+="0";
                }
                if(arathralgiaCheckbox.isChecked()==true){
                    janovia+="1";
                } else{
                    janovia+="0";
                }
                Log.d("Janovia", janovia);

                String url = "http://manasak.pythonanywhere.com/getActosRatings?symptoms="+actos;


                String tag_json_obj = "json_obj_req";


                JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                        url, null,
                        new Response.Listener<JSONObject>() {

                            @Override
                            public void onResponse(JSONObject response) {
                                Log.d("drug", response.toString());
                                try {
                                    actosScore = response.getString("score")+"";
                                    actosSentiment = response.getString("sentiment")+"";
                                    Log.d("actos", actosScore+actosSentiment);
                                } catch (JSONException pE) {
                                    pE.printStackTrace();
                                }
                                //pDialog.hide();
                            }
                        }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("drug", "Error: " + error.getMessage());
                    }
                });


                AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);


                url = "http://manasak.pythonanywhere.com/getByettaRatings?symptoms="+byetta;


                tag_json_obj = "json_obj_req";


                jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                        url, null,
                        new Response.Listener<JSONObject>() {

                            @Override
                            public void onResponse(JSONObject response) {
                                Log.d("drug", response.toString());
                                try {
                                    byettaScore = response.getString("score")+"";
                                    byettaSentiment = response.getString("sentiment")+"";
                                    Log.d("byetta", byettaScore+byettaSentiment);
                                } catch (JSONException pE) {
                                    pE.printStackTrace();
                                }
                                //pDialog.hide();
                            }
                        }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("drug", "Error: " + error.getMessage());
                    }
                });


                AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);

                //Toast.makeText(getApplicationContext(), score+sentiment, Toast.LENGTH_LONG).show();

                url = "http://manasak.pythonanywhere.com/getGlucophageRatings?symptoms="+glucophage;


                tag_json_obj = "json_obj_req";


                jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                        url, null,
                        new Response.Listener<JSONObject>() {

                            @Override
                            public void onResponse(JSONObject response) {
                                Log.d("drug", response.toString());
                                try {
                                    glucophageScore = response.getString("score")+"";
                                    glucophageSentiment = response.getString("sentiment")+"";
                                    Log.d("glucophage", glucophageScore+glucophageSentiment);
                                } catch (JSONException pE) {
                                    pE.printStackTrace();
                                }
                                //pDialog.hide();
                            }
                        }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("drug", "Error: " + error.getMessage());
                    }
                });


                AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);

                //Toast.makeText(getApplicationContext(), score+sentiment, Toast.LENGTH_LONG).show();

                url = "http://manasak.pythonanywhere.com/getJanuviaRatings?symptoms="+janovia;


                tag_json_obj = "json_obj_req";


                jsonObjReq = new JsonObjectRequest(Request.Method.GET,
                        url, null,
                        new Response.Listener<JSONObject>() {

                            @Override
                            public void onResponse(JSONObject response) {
                                Log.d("drug", response.toString());
                                try {
                                    januviaScore = response.getString("score")+"";
                                    januviaSentiment = response.getString("sentiment")+"";
                                    Log.d("januvia", januviaScore+januviaSentiment);
                                    kIntent.putExtra("actosScore", actosScore);
                                    kIntent.putExtra("actosSentiment", actosSentiment);
                                    kIntent.putExtra("byettaScore", byettaScore);
                                    kIntent.putExtra("byettaSentiment", byettaSentiment);
                                    kIntent.putExtra("glucophageScore", glucophageScore);
                                    kIntent.putExtra("glucophageSentiment", glucophageSentiment);
                                    kIntent.putExtra("januviaScore", januviaScore);
                                    kIntent.putExtra("januviaSentment", januviaSentiment);
                                    startActivity(kIntent);
                                } catch (JSONException pE) {
                                    pE.printStackTrace();
                                }
                                //pDialog.hide();
                            }
                        }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        VolleyLog.d("drug", "Error: " + error.getMessage());
                    }
                });


                AppController.getInstance().addToRequestQueue(jsonObjReq, tag_json_obj);

                //Toast.makeText(getApplicationContext(), score+sentiment, Toast.LENGTH_LONG).show();

            }
        });





    }
}
