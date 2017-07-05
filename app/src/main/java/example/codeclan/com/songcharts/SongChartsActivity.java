package example.codeclan.com.songcharts;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.support.v7.app.AppCompatActivity;


import java.util.ArrayList;

public class SongChartsActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.songs_list);


        SongCharts songCharts = new SongCharts();
        ArrayList<Song> list = songCharts.getList();

        SongChartsAdaptor songChartsAdaptor = new SongChartsAdaptor(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(songChartsAdaptor);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.action_home) {
            Intent intent = new Intent(this, SongChartsActivity.class);
            startActivity(intent);
            return true;
        }
        if(item.getItemId() == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void getSong(View listItem){
        Song song = (Song) listItem.getTag();
        String url = song.getUrl();
        Intent intent = new Intent(this, AlbumArtworkActivity.class);
        intent.putExtra("url", url);
        startActivity(intent);
    }


    @Override
    public void onClick(View v) {
    }
}
