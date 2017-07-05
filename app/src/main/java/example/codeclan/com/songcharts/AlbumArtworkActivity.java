package example.codeclan.com.songcharts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class AlbumArtworkActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_album_artwork);
        ImageView imageView = (ImageView)findViewById(R.id.imageView1);
        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String imageUrl = extras.getString("url");
        Picasso.with(this).load(imageUrl).into(imageView);
    }

    public void onClickRemoveAlbum(ImageView view){
    }

}
