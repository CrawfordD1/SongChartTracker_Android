package example.codeclan.com.songcharts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by user on 05/07/2017.
 */

public class SongChartsAdaptor extends ArrayAdapter<Song> {


    public SongChartsAdaptor(Context context, ArrayList<Song> songs){
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent){
//        check if existing view is being reused otherwise inflate view
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.songs_item, parent, false);
        }

        Song currentSong = getItem(position);
        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentSong.getRanking().toString());
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentSong.getTitle());
        TextView year = (TextView) listItemView.findViewById(R.id.artist);
        year.setText(currentSong.getArtist());
        ImageView image = (ImageView) listItemView.findViewById(R.id.imageView);
        Picasso.with(getContext()).load(currentSong.getUrl()).into(image);

        listItemView.setTag(currentSong);

        return listItemView;
    }
}
