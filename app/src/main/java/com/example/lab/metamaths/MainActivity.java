package com.example.lab.metamaths;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Chapter> chapterList = new ArrayList<>();
    private RecyclerView recyclerView;
    private ChaptersAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        toolbar.setTitle("All Books");

        recyclerView = (RecyclerView) findViewById(R.id.rv_chapters);

        mAdapter = new ChaptersAdapter(chapterList, getApplicationContext());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareChapterData();

    }

    private void prepareChapterData() {
        Chapter chapter = new Chapter(R.drawable.ic_graph, "Book 1");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 2");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 3");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 4");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 5");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 6");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 7");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 8");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 9");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 10");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 11");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 12");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "Book 13");
        chapterList.add(chapter);
        chapter = new Chapter(R.drawable.ic_graph, "All Books");
        chapterList.add(chapter);


        mAdapter.notifyDataSetChanged();
    }

}
