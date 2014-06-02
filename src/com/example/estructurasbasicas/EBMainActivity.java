package com.example.estructurasbasicas;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class EBMainActivity extends Activity {
	// extrae el texto de la palicacion principal
	TextView txv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_ebmain);
		//findViewById : trae los campos de la vista buscado por id  retornando un VIEW
		//R.id: seleciona los elementos de la vista por el id
		
		
		txv=(TextView)findViewById(R.id.textView1);
		
		setTextoPrincipal("mi nuevo texto");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.ebmain, menu);
		return true;
	}

	public void setTextoPrincipal(String texto) {
		txv.setText("Texto anterior: "+txv.getText()+"\n"+texto);		
	}

	public void tipoDatos() {
		// TIPOS DE DATOS BASICOS
		// ENTERO
		int num = 10;
		// Texto STring
		String cadena = "cadena";

		// Decimale O flotante
		double decimal = 12.16;
		float fl = new Float(10);
		// Bolean
		boolean bl = true;

		// ARREGLOS
		// string
		String[] veString = new String[5];
		veString[0] = "hola mundo";
		veString[1] = "hola mundo";
		veString[2] = "hola mundo";
		veString[3] = "hola mundo";
		veString[4] = "hola mundo";

		int[] varNum = new int[] { 0, 1, 2, 3, 4, 5 };

	}

}
