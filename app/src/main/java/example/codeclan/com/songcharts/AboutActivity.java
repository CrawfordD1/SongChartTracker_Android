package example.codeclan.com.songcharts;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.Random;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ArrayList<Song> songCharts = new SongCharts().getList();
        ImageView imageView3 = (ImageView)findViewById(R.id.imageView3);
        Picasso.with(this).load(getRandomURL(songCharts)).into(imageView3);

        ImageView imageView4 = (ImageView)findViewById(R.id.imageView4);
        Picasso.with(this).load(getRandomURL(songCharts)).into(imageView4);

        ImageView imageView5 = (ImageView)findViewById(R.id.imageView5);
        Picasso.with(this).load(getRandomURL(songCharts)).into(imageView5);

        ImageView imageView6 = (ImageView)findViewById(R.id.imageView6);
        Picasso.with(this).load(getRandomURL(songCharts)).into(imageView6);

        ImageView imageView7 = (ImageView)findViewById(R.id.imageView7);
        Picasso.with(this).load(getRandomURL(songCharts)).into(imageView7);

        ImageView imageView8 = (ImageView)findViewById(R.id.imageView8);
        Picasso.with(this).load(getRandomURL(songCharts)).into(imageView8);

        ImageView imageView9 = (ImageView)findViewById(R.id.imageView9);
        Picasso.with(this).load(getRandomURL(songCharts)).into(imageView9);

        ImageView imageView10 = (ImageView)findViewById(R.id.imageView10);
        Picasso.with(this).load(getRandomURL(songCharts)).into(imageView10);


    }

    public String getRandomURL(ArrayList<Song> songCharts){
            Random random = new Random();
            int index = random.nextInt(songCharts.size());
            return songCharts.get(index).getUrl();

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

}
