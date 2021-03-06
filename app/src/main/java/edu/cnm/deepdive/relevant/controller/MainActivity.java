package edu.cnm.deepdive.relevant.controller;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import edu.cnm.deepdive.relevant.R;
import edu.cnm.deepdive.relevant.controller.Fragment1;
import edu.cnm.deepdive.relevant.controller.Fragment2;
import edu.cnm.deepdive.relevant.controller.Fragment3;
import edu.cnm.deepdive.relevant.controller.Fragment4;
import edu.cnm.deepdive.relevant.controller.Fragment5;
import edu.cnm.deepdive.relevant.controller.Fragment6;

public class MainActivity extends AppCompatActivity
    implements NavigationView.OnNavigationItemSelectedListener {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
    fab.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
        Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            .setAction("Action", null).show();
      }
    });

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
        this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
    drawer.addDrawerListener(toggle);
    toggle.syncState();

    NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
    navigationView.setNavigationItemSelectedListener(this);
  }

  @Override
  public void onBackPressed() {
    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    if (drawer.isDrawerOpen(GravityCompat.START)) {
      drawer.closeDrawer(GravityCompat.START);
    } else {
      super.onBackPressed();
    }
  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.main, menu);
    return true;
  }

//  @Override
//  public boolean onOptionsItemSelected(MenuItem item) {
//    // Handle action bar item clicks here. The action bar will
//    // automatically handle clicks on the Home/Up button, so long
//    // as you specify a parent activity in AndroidManifest.xml.
//    int id = item.getItemId();
//
//    //noinspection SimplifiableIfStatement
//
//
//    return super.onOptionsItemSelected(item);
//  }

  @SuppressWarnings("StatementWithEmptyBody")
  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle navigation view item clicks here.
    int id = item.getItemId();

    if (id == R.id.fragment_1) {
      // Handle the camera action
    } else if (id == R.id.fragment_2) {

    } else if (id == R.id.fragment_3) {

    }  else if (id == R.id.fragment_4) {

    }else if (id == R.id.fragment_5) {

    }else if (id == R.id.fragment_6) {

    }

    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }

  @Override
  public boolean onNavigationItemSelected(MenuItem item) {

    Bundle args = new Bundle();

    switch(item.getItemId()){
      case R.id.fragment_1:
        loadFragment(new Fragment1(), R.id.fragment_container,"fragment1",null);

        break;
      case R.id.fragment_2:
        loadFragment(new Fragment2(), R.id.fragment_container,"fragment2",null);
        break;
      case R.id.fragment_3:

        //args.putString(Fragment2.BODY_TEXT_KEY,"Here comes another one.");
        loadFragment(new Fragment3(), R.id.fragment_container,"fragment3",null);
        break;

      case R.id.fragment_4:

       // args.putString(Fragment2.BODY_TEXT_KEY,"Here comes another one.");
        loadFragment(new Fragment4(), R.id.fragment_container,"fragment4",null);
        break;

      case R.id.fragment_5:
        // args.putString(Fragment2.BODY_TEXT_KEY,"Here comes another one.");
        loadFragment(new Fragment5(), R.id.fragment_container,"fragment5",null);
        break;
      case R.id.fragment_6:

        //args.putString(Fragment2.BODY_TEXT_KEY,"Here comes another one.");
        loadFragment(new Fragment6(), R.id.fragment_container,"fragment6",null);
        break;
    }


    DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
    drawer.closeDrawer(GravityCompat.START);
    return true;
  }

  public void loadFragment(Fragment fragment, int container,String tag, Bundle args){


    FragmentManager manger = getSupportFragmentManager();
    if (args !=null) {
      fragment.setArguments(args);
    }
    manger.beginTransaction().replace(container,fragment,tag).commit();

  }

}



