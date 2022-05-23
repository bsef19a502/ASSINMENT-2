package org.haqnawaz.mylearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class LearningModule extends AppCompatActivity
{

    public Button btn_a, btn_b, btn_c, btn_d, btn_e, btn_f, btn_g, btn_h, btn_i, btn_j,
            btn_k, btn_l, btn_m, btn_n, btn_o, btn_p, btn_q, btn_r, btn_s, btn_t, btn_u, btn_v, btn_w, btn_x, btn_y, btn_z, btn_back;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_module);

        btn_a = findViewById(R.id.btn_a);
        btn_b = findViewById(R.id.btn_b);
        btn_c = findViewById(R.id.btn_c);
        btn_d = findViewById(R.id.btn_d);
        btn_e = findViewById(R.id.btn_e);
        btn_f = findViewById(R.id.btn_f);
        btn_g = findViewById(R.id.btn_g);
        btn_h = findViewById(R.id.btn_h);
        btn_i = findViewById(R.id.btn_i);
        btn_j = findViewById(R.id.btn_j);
        btn_k = findViewById(R.id.btn_k);
        btn_l = findViewById(R.id.btn_l);
        btn_m = findViewById(R.id.btn_m);
        btn_n = findViewById(R.id.btn_n);
        btn_o = findViewById(R.id.btn_o);
        btn_p = findViewById(R.id.btn_p);
        btn_q = findViewById(R.id.btn_q);
        btn_r = findViewById(R.id.btn_r);
        btn_s = findViewById(R.id.btn_s);
        btn_t = findViewById(R.id.btn_t);
        btn_u = findViewById(R.id.btn_u);
        btn_v = findViewById(R.id.btn_v);
        btn_w = findViewById(R.id.btn_w);
        btn_x = findViewById(R.id.btn_x);
        btn_y = findViewById(R.id.btn_y);
        btn_z = findViewById(R.id.btn_z);
        btn_back = findViewById(R.id.btn_back);

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_back();
            }
        });

        btn_a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_a();
            }
        });
        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_b();
            }
        });
        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_c();
            }
        });
        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_d();
            }
        });
        btn_e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_e();
            }
        });
        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_f();
            }
        });
        btn_g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_g();
            }
        });
        btn_h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_h();
            }
        });
        btn_i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_i();
            }
        });
        btn_j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_j();
            }
        });
        btn_k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_k();
            }
        });
        btn_l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_l();
            }
        });
        btn_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_m();
            }
        });
        btn_n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_n();
            }
        });
        btn_o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_o();
            }
        });
        btn_p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_p();
            }
        });
        btn_q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_q();
            }
        });
        btn_r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_r();
            }
        });
        btn_s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_s();
            }
        });
        btn_t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_t();
            }
        });
        btn_u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_u();
            }
        });
        btn_v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_v();
            }
        });
        btn_w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_w();
            }
        });
        btn_x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_x();
            }
        });
        btn_y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_y();
            }
        });
        btn_z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                func_z();
            }
        });

    }

    private void func_a()
    {
        Intent intent_a = new Intent(this,Activity_a.class);
        startActivity(intent_a);
    }
    private void func_b()
    {
        Intent intent_b = new Intent(this, Activity_b.class);
        startActivity(intent_b);
    }
    private void func_c()
    {
        Intent intent_c = new Intent(this, Activity_c.class);
        startActivity(intent_c);
    }
    private void func_d()
    {
        Intent intent_d = new Intent(this, Activity_d.class);
        startActivity(intent_d);
    }
    private void func_e()
    {
        Intent intent_e = new Intent(this, Activity_e.class);
        startActivity(intent_e);
    }
    private void func_f()
    {
        Intent intent_f = new Intent(this, Activity_f.class);
        startActivity(intent_f);
    }
    private void func_g()
    {
        Intent intent_g = new Intent(this, Activity_g.class);
        startActivity(intent_g);
    }
    private void func_h()
    {
        Intent intent_h = new Intent(this, Activity_h.class);
        startActivity(intent_h);
    }
    private void func_i()
    {
        Intent intent_i = new Intent(this, Activity_i.class);
        startActivity(intent_i);
    }
    private void func_j()
    {
        Intent intent_j = new Intent(this, Activity_j.class);
        startActivity(intent_j);
    }
    private void func_k()
    {
        Intent intent_k = new Intent(this, Activity_k.class);
        startActivity(intent_k);
    }
    private void func_l()
    {
        Intent intent_l = new Intent(this, Activity_l.class);
        startActivity(intent_l);
    }
    private void func_m()
    {
        Intent intent_m = new Intent(this, Activity_m.class);
        startActivity(intent_m);
    }
    private void func_n()
    {
        Intent intent_n = new Intent(this, Activity_n.class);
        startActivity(intent_n);
    }
    private void func_o()
    {
        Intent intent_o = new Intent(this, Activity_o.class);
        startActivity(intent_o);
    }
    private void func_p()
    {
        Intent intent_p = new Intent(this, Activity_p.class);
        startActivity(intent_p);
    }
    private void func_q()
    {
        Intent intent_q = new Intent(this, Activity_q.class);
        startActivity(intent_q);
    }
    private void func_r()
    {
        Intent intent_r = new Intent(this, Activity_r.class);
        startActivity(intent_r);
    }
    private void func_s()
    {
        Intent intent_s = new Intent(this, Activity_s.class);
        startActivity(intent_s);
    }
    private void func_t()
    {
        Intent intent_t = new Intent(this, Activity_t.class);
        startActivity(intent_t);
    }
    private void func_u()
    {
        Intent intent_u = new Intent(this, Activity_u.class);
        startActivity(intent_u);
    }
    private void func_v()
    {
        Intent intent_v = new Intent(this, Activity_v.class);
        startActivity(intent_v);
    }
    private void func_w()
    {
        Intent intent_w = new Intent(this, Activity_w.class);
        startActivity(intent_w);
    }
    private void func_x()
    {
        Intent intent_x = new Intent(this, Activity_x.class);
        startActivity(intent_x);
    }
    private void func_y()
    {
        Intent intent_y = new Intent(this, Activity_y.class);
        startActivity(intent_y);
    }
    private void func_z()
    {
        Intent intent_z = new Intent(this, Activity_z.class);
        startActivity(intent_z);
    }

    private void func_back()
       {
           Intent intent_back = new Intent(this,MainActivity.class);
           startActivity(intent_back);
       }
}