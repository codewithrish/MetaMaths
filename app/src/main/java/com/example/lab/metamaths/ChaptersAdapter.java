package com.example.lab.metamaths;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ChaptersAdapter extends RecyclerView.Adapter<ChaptersAdapter.VHChapters> {

    private List<Chapter> chapters;
    private Context context;

    public ChaptersAdapter(List<Chapter> chapters, Context context) {
        this.chapters = chapters;
        this.context = context;
    }

    @NonNull
    @Override
    public VHChapters onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.chapter_list_item, parent, false);

        return new VHChapters(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull final VHChapters vhChapters, final int i) {
        vhChapters.setBookNumber(chapters.get(i).getChapterName());
        vhChapters.setOpenGraph(chapters.get(i).getGraph());

        vhChapters.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vhChapters.itemView.getContext().startActivity(new Intent(context, PdfActivity.class));
            }
        });

        vhChapters.openGraph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, ShowGraph.class);
                intent.putExtra("book_number", chapters.get(i).getChapterName());
                vhChapters.openGraph.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return chapters.size();
    }

    public class VHChapters extends RecyclerView.ViewHolder {

        private TextView bookNumber;
        private ImageView  openGraph;

        public VHChapters(@NonNull View itemView) {
            super(itemView);

            bookNumber = itemView.findViewById(R.id.book_number);
            openGraph = itemView.findViewById(R.id.open_graph);
        }

        public void setBookNumber(String bookNumber_s) {
            bookNumber.setText(bookNumber_s);
        }

        public void setOpenGraph(int image) {
            openGraph.setImageResource(image);
        }
    }
}
