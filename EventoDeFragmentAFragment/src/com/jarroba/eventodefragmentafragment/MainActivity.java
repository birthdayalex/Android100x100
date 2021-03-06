package com.jarroba.eventodefragmentafragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.jarroba.eventodefragmentafragment.FragmentSuperior.OnMiClickListener;

/**
 * Código del libro Android 100% para <a href="http://jarroba.com/">www.jarroba.com</a>. Descarga el libro de Android 100% gratis desde <a href="http://jarroba.com/libro-android-100-gratis/">www.jarroba.com/libro-android-100-gratis</a>
 * 
 * @author Ramón Invarato Menéndez
 */
public class MainActivity extends Activity implements OnMiClickListener {

	private ImageView imagen;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		imagen = (ImageView) findViewById(R.id.imageView$activity_main$imagenDeActivity);
	}

	@Override
	public void onClickEnMiBoton(View v) {
		imagen.setImageResource(android.R.drawable.stat_sys_download_done);

		FragmentInferior fInferior = (FragmentInferior) getFragmentManager().findFragmentById(R.id.fragment$activity_main$fragmentInferior);
		fInferior.comunicarmeConElFragment();
	}

}