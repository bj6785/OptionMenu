package com.sweetlover.activity;

import com.sweetlover.optionmenu.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.root, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onPrepareOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		return super.onPrepareOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case R.id.delete:
			Toast.makeText(MainActivity.this, "删除菜单被点击了!", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.save:
			Toast.makeText(MainActivity.this, "保存菜单被点击了！", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.help:
			Toast.makeText(MainActivity.this, "帮助菜单被点击了！", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.add:
			Toast.makeText(MainActivity.this, "添加菜单被点击了！", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.detail:
			Toast.makeText(MainActivity.this, "详细菜单被点击了！", Toast.LENGTH_SHORT)
					.show();
			break;
		case R.id.send:
			Toast.makeText(MainActivity.this, "发送菜单被点击了！", Toast.LENGTH_SHORT)
					.show();
			break;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onOptionsMenuClosed(Menu menu) {
		// TODO Auto-generated method stub
		super.onOptionsMenuClosed(menu);
		Toast.makeText(MainActivity.this, "optionmenu closed!", Toast.LENGTH_SHORT)
				.show();
	}
}
