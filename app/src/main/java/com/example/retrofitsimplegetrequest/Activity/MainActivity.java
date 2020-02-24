package com.example.retrofitsimplegetrequest.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import android.os.Bundle;
import android.widget.Toast;

import com.example.retrofitsimplegetrequest.Adapter.UserAdapter;
import com.example.retrofitsimplegetrequest.Interface.ApiInterface;
import com.example.retrofitsimplegetrequest.Model.Model;
import com.example.retrofitsimplegetrequest.R;
import com.example.retrofitsimplegetrequest.Retrofit.ApiClient;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private UserAdapter userAdapter;
    private List<Model> models;
    private ApiInterface apiInterface;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
        getData();
    }

    private void getData()
    {
        apiInterface = ApiClient.getInstance().getApi();
        Call<List<Model>> call = apiInterface.getAllData();
        call.enqueue(new Callback<List<Model>>() {
            @Override
            public void onResponse(Call<List<Model>> call, Response<List<Model>> response) {

                models = response.body();
                userAdapter = new UserAdapter(models);
                recyclerView.setAdapter(userAdapter);

            }

            @Override
            public void onFailure(Call<List<Model>> call, Throwable t) {

                Toast.makeText(MainActivity.this,""+t.getMessage(),Toast.LENGTH_SHORT).show();

            }
        });


    }

    private void init() {
        recyclerView = findViewById(R.id.userRecyclerViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        models = new ArrayList<>();


    }
}
