package thlaurebtssio.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CalcDev extends MainActivity {

    /*Déclaration des membres de la classe CalcDev*/
    Button btnBin1;
    Button btnBin2;
    Button btnDec1;
    Button btnDec2;
    Button btnHexa1;
    Button btnHexa2;
    Button btnOctal1;
    Button btnOctal2;
    Button btnEgal;
    EditText ecran1;
    EditText ecran2;

    private boolean clicOperateur = false;
    private boolean update = false;
    private String operateur = "";


    /* Méthode onCreate */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_calc_dev);

        btnBin1 = (Button) findViewById(R.id.buttonBin1);
        btnBin2 = (Button) findViewById(R.id.buttonBin2);
        btnDec1 = (Button) findViewById(R.id.buttonDec1);
        btnDec2 = (Button) findViewById(R.id.buttonDec2);
        btnHexa1 = (Button) findViewById(R.id.buttonHexa1);
        btnHexa2 = (Button) findViewById(R.id.buttonHexa2);
        btnOctal1 = (Button) findViewById(R.id.buttonOctal1);
        btnOctal2 = (Button) findViewById(R.id.buttonOctal2);
        btnEgal = (Button) findViewById(R.id.buttonEgal);
        ecran1 = (EditText) findViewById(R.id.editTextNb1);
        ecran2 = (EditText) findViewById(R.id.editTextNb2);

        /* Méthodes liées aux boutons */
        btnBin1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                binClick();
            }
        });

        btnBin2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                binClick();
            }
        });

        btnDec1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                decClick();
            }
        });

        btnDec2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                decClick();
            }
        });

        btnHexa1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                hexaClick();
            }
        });

        btnHexa2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                hexaClick();
            }
        });

        btnOctal1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                octalClick();
            }
        });

        btnOctal2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                octalClick();
            }
        });

        btnEgal.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                egalClick();
            }
        });
    }


    /* Méthodes liées aux calculs */
    public void egalClick(){
        calcul();
        update = true;
        clicOperateur = false;
    }

    public void binClick(){}

    public void decClick(){}

    public void hexaClick(){}

    public void octalClick(){}

    private void calcul(){}
}
