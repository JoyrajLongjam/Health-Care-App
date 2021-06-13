package com.app.joyrajlongjam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class miki<button36> extends AppCompatActivity {
    private Button button35;
    Button button36;
    Button button39;
    Button button40;
    Button button38;
    Button button37;
    Button button50;
    Button button44;
    Button button43;
    Button button46;
    Button button49;
    Button button56;
    Button button58;
    Button button52;
    Button button59;
    Button button60;
    Button button61;
    Button button45;
    Button button48;
    Button button47;
    Button button57;
    Button button41;
    Button button51;
    Button button42;
    Button button54;
    Button button53;
    Button button55;
    Button button62;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miki);

        button35 = (Button) findViewById(R.id.button35);

        button35.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openpage();

            }
        });
        button36=(Button) findViewById(R.id.button36);
        button36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                    openpage2();
                }

        });
        button39=(Button) findViewById(R.id.button39);
        button39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage3();
            }

        });

        button40 = (Button) findViewById(R.id.button40);

        button40.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openpage4();

            }
        });
        button38=(Button) findViewById(R.id.button38);
        button38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage5();
            }

        });
        button37=(Button) findViewById(R.id.button37);
        button37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage6();
            }

        });
        button50 = (Button) findViewById(R.id.button50);

        button50.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openpage7();

            }
        });
        button44=(Button) findViewById(R.id.button44);
        button44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage8();
            }

        });
        button43=(Button) findViewById(R.id.button43);
        button43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage9();
            }

        });

        button46 = (Button) findViewById(R.id.button46);

        button46.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openpage10();

            }
        });
        button49=(Button) findViewById(R.id.button49);
        button49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage11();
            }

        });
        button56=(Button) findViewById(R.id.button56);
        button56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage12();
            }

        });
        button58=(Button) findViewById(R.id.button58);
        button58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage13();
            }

        });
        button52=(Button) findViewById(R.id.button52);
        button52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage14();
            }

        });

        button59 = (Button) findViewById(R.id.button59);

        button59.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openpage15();

            }
        });
        button60=(Button) findViewById(R.id.button60);
        button60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage16();
            }

        });
        button61=(Button) findViewById(R.id.button61);
        button61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage17();
            }

        });

        button45 = (Button) findViewById(R.id.button45);

        button45.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openpage18();

            }
        });
        button48=(Button) findViewById(R.id.button48);
        button48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage19();
            }

        });
        button47=(Button) findViewById(R.id.button47);
        button47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage20();
            }

        });

        button57 = (Button) findViewById(R.id.button57);

        button57.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openpage21();

            }
        });
        button41=(Button) findViewById(R.id.button41);
        button41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage22();
            }

        });
        button51=(Button) findViewById(R.id.button51);
        button51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage23();
            }

        });
        button42= (Button) findViewById(R.id.button42);

        button42.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openpage24();

            }
        });
        button54=(Button) findViewById(R.id.button54);
        button54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage25();
            }

        });
        button53=(Button) findViewById(R.id.button53);
        button53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage26();
            }

        });

        button55 = (Button) findViewById(R.id.button55);

        button55.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openpage27();

            }
        });
        button62=(Button) findViewById(R.id.button62);
        button62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                openpage28();
            }



        });


    }
    public void openpage() {
        Intent intent = new Intent(this, andhra.class);
        startActivity(intent);
    }
    public void openpage2() {
        Intent intent = new Intent(this, aruna.class);
        startActivity(intent);
    }

    public void openpage3() {
        Intent intent = new Intent(this, assam.class);
        startActivity(intent);
    }
    public void openpage4() {
        Intent intent = new Intent(this, bihar.class);
        startActivity(intent);
    }
    public void openpage5() {
        Intent intent = new Intent(this, chatisgarh.class);
        startActivity(intent);
    }

    public void openpage6() {
        Intent intent = new Intent(this, goa.class);
        startActivity(intent);
    }
    public void openpage7() {
        Intent intent = new Intent(this, gujarat.class);
        startActivity(intent);
    }
    public void openpage8() {
        Intent intent = new Intent(this, haryana.class);
        startActivity(intent);
    }

    public void openpage9() {
        Intent intent = new Intent(this, himachalpradesh.class);
        startActivity(intent);
    }
    public void openpage10() {
        Intent intent = new Intent(this, jharkhand.class);
        startActivity(intent);
    }
    public void openpage11() {
        Intent intent = new Intent(this, odisha.class);
        startActivity(intent);
    }

    public void openpage12() {
        Intent intent = new Intent(this,tamilnadu.class);
        startActivity(intent);
    }
    public void openpage13() {
        Intent intent = new Intent(this, hyderabad.class);
        startActivity(intent);
    }

    public void openpage14() {
        Intent intent = new Intent(this, sikkim .class);
        startActivity(intent);
    }
    public void openpage15() {
        Intent intent = new Intent(this, tripura.class);
        startActivity(intent);
    }
    public void openpage16() {
        Intent intent = new Intent(this, uttarpradesh.class);
        startActivity(intent);
    }

    public void openpage17() {
        Intent intent = new Intent(this,uttarakhand.class);
        startActivity(intent);
    }
    public void openpage18() {
        Intent intent = new Intent(this, karnataka.class);
        startActivity(intent);
    }
    public void openpage19() {
        Intent intent = new Intent(this, kerala.class);
        startActivity(intent);
    }

    public void openpage20() {
        Intent intent = new Intent(this, madhya.class);
        startActivity(intent);
    }
    public void openpage21() {
        Intent intent = new Intent(this, maharashtra.class);
        startActivity(intent);
    }
    public void openpage22() {
        Intent intent = new Intent(this, manipur.class);
        startActivity(intent);
    }

    public void openpage23() {
        Intent intent = new Intent(this, meghalaya.class);
        startActivity(intent);
    }
    public void openpage24() {
        Intent intent = new Intent(this, mizoram.class);
        startActivity(intent);
    }
    public void openpage25() {
        Intent intent = new Intent(this, nagaland.class);
        startActivity(intent);
    }

    public void openpage26() {
        Intent intent = new Intent(this, punjab.class);
        startActivity(intent);
    }
    public void openpage27() {
        Intent intent = new Intent(this, rajasthan.class);
        startActivity(intent);
    }
    public void openpage28() {
        Intent intent = new Intent(this, wb.class);
        startActivity(intent);
    }



}









