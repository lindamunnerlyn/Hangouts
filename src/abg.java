// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.android.ex.photo.views.PhotoView;

public class abg extends ad
    implements aam, aan, android.view.View.OnClickListener, br
{

    public String a;
    public ImageView aj;
    public abx ak;
    public int al;
    public boolean am;
    public boolean an;
    public boolean ao;
    public boolean ap;
    public View aq;
    public boolean ar;
    public boolean as;
    public boolean at;
    public String b;
    public Intent c;
    public aal d;
    public abf e;
    public BroadcastReceiver f;
    public PhotoView g;
    public ImageView h;
    public TextView i;

    public abg()
    {
        ap = true;
    }

    public static abg a(Intent intent, int j, boolean flag)
    {
        abg abg1 = new abg();
        Bundle bundle = new Bundle();
        bundle.putParcelable("arg-intent", intent);
        bundle.putInt("arg-position", j);
        bundle.putBoolean("arg-show-spinner", flag);
        abg1.setArguments(bundle);
        return abg1;
    }

    private void v()
    {
        boolean flag;
        if (d == null)
        {
            flag = false;
        } else
        {
            flag = d.b(this);
        }
        b(flag);
    }

    public void a()
    {
        v();
    }

    public void a(Cursor cursor)
    {
        if (e != null && cursor.moveToPosition(al) && !t())
        {
            Object obj = getLoaderManager();
            Object obj1 = ((bq) (obj)).b(3);
            if (obj1 != null)
            {
                obj1 = (abj)obj1;
                a = e.b(cursor);
                ((abj) (obj1)).a(a);
                ((abj) (obj1)).u();
            }
            if (!ar)
            {
                obj = ((bq) (obj)).b(2);
                if (obj != null)
                {
                    obj = (abj)obj;
                    b = e.c(cursor);
                    ((abj) (obj)).a(b);
                    ((abj) (obj)).u();
                    return;
                }
            }
        }
    }

    protected void a(View view)
    {
        g = (PhotoView)view.findViewById(g.cb);
        g.a(c.getFloatExtra("max_scale", 1.0F));
        g.setOnClickListener(this);
        g.a(am);
        g.b(false);
        aq = view.findViewById(g.bZ);
        h = (ImageView)view.findViewById(g.ca);
        ar = false;
        ProgressBar progressbar = (ProgressBar)view.findViewById(g.bV);
        ak = new abx((ProgressBar)view.findViewById(g.bT), progressbar);
        i = (TextView)view.findViewById(g.bU);
        aj = (ImageView)view.findViewById(g.cd);
        v();
    }

    public void a(em em1, abk abk1)
    {
        if (getView() != null && isAdded()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Drawable drawable = abk1.a(getResources());
        em1.o();
        JVM INSTR tableswitch 2 3: default 52
    //                   2 73
    //                   3 161;
           goto _L3 _L4 _L5
_L3:
        if (!ap)
        {
            ak.a(8);
        }
        v();
        return;
_L4:
        if (at) goto _L5; else goto _L6
_L6:
        if (t()) goto _L1; else goto _L7
_L7:
        if (drawable == null)
        {
            h.setImageResource(g.bS);
            ar = false;
        } else
        {
            h.setImageDrawable(drawable);
            ar = true;
        }
        h.setVisibility(0);
        if (getResources().getBoolean(g.bM))
        {
            h.setScaleType(android.widget.ImageView.ScaleType.CENTER);
        }
        a(false);
          goto _L3
_L5:
        if (abk1.c == 1)
        {
            ap = false;
            i.setText(g.ch);
            i.setVisibility(0);
            d.a(this, false);
        } else
        {
            i.setVisibility(8);
            em1 = abk1.a(getResources());
            if (em1 != null)
            {
                if (g != null)
                {
                    g.a(em1);
                }
                a(true);
                aq.setVisibility(8);
                ap = false;
            }
            d.a(this, true);
        }
          goto _L3
    }

    public void a(boolean flag)
    {
        g.b(flag);
    }

    public void b()
    {
        if (!d.a(this))
        {
            s();
        } else
        if (!t())
        {
            getLoaderManager().b(2, null, this);
            return;
        }
    }

    public void b(boolean flag)
    {
        am = flag;
    }

    public void c()
    {
        s();
    }

    public boolean d()
    {
        while (!d.a(this) || g == null || !g.a()) 
        {
            return false;
        }
        return true;
    }

    public boolean e()
    {
        while (!d.a(this) || g == null || !g.b()) 
        {
            return false;
        }
        return true;
    }

    protected aal f()
    {
        return ((aax)getActivity()).h();
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        d = f();
        if (d == null)
        {
            throw new IllegalArgumentException("Activity must be a derived class of PhotoViewActivity");
        }
        e = d.b();
        if (e == null)
        {
            throw new IllegalStateException("Callback reported null adapter");
        } else
        {
            v();
            return;
        }
    }

    public void onClick(View view)
    {
        d.a();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Bundle bundle1 = getArguments();
        if (bundle1 != null)
        {
            c = (Intent)bundle1.getParcelable("arg-intent");
            at = c.getBooleanExtra("display_thumbs_fullscreen", false);
            al = bundle1.getInt("arg-position");
            ao = bundle1.getBoolean("arg-show-spinner");
            ap = true;
            if (bundle != null)
            {
                bundle = bundle.getBundle("com.android.mail.photo.fragments.PhotoViewFragment.INTENT");
                if (bundle != null)
                {
                    c = (new Intent()).putExtras(bundle);
                }
            }
            if (c != null)
            {
                a = c.getStringExtra("resolved_photo_uri");
                b = c.getStringExtra("thumbnail_uri");
                an = c.getBooleanExtra("watch_network", false);
                return;
            }
        }
    }

    public em onCreateLoader(int j, Bundle bundle)
    {
        bundle = null;
        if (ao)
        {
            return null;
        }
        j;
        JVM INSTR tableswitch 2 3: default 36
    //                   2 48
    //                   3 56;
           goto _L1 _L2 _L3
_L1:
        return d.a(j, bundle);
_L2:
        bundle = b;
        continue; /* Loop/switch isn't completed */
_L3:
        bundle = a;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(g.cg, viewgroup, false);
        a(layoutinflater);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        if (g != null)
        {
            g.c();
            g = null;
        }
        super.onDestroyView();
    }

    public void onDetach()
    {
        d = null;
        super.onDetach();
    }

    public void onLoadFinished(em em1, Object obj)
    {
        a(em1, (abk)obj);
    }

    public void onLoaderReset(em em1)
    {
    }

    public void onPause()
    {
        if (an)
        {
            getActivity().unregisterReceiver(f);
        }
        d.b(this);
        d.c(al);
        if (g != null)
        {
            g.d();
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        d.a(al, this);
        d.a(this);
        if (an)
        {
            if (f == null)
            {
                f = new abh(this);
            }
            getActivity().registerReceiver(f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            NetworkInfo networkinfo = ((ConnectivityManager)getActivity().getSystemService("connectivity")).getActiveNetworkInfo();
            if (networkinfo != null)
            {
                as = networkinfo.isConnected();
            } else
            {
                as = false;
            }
        }
        if (!t())
        {
            ap = true;
            aq.setVisibility(0);
            getLoaderManager().a(2, null, this);
            getLoaderManager().a(3, null, this);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        if (c != null)
        {
            bundle.putParcelable("com.android.mail.photo.fragments.PhotoViewFragment.INTENT", c.getExtras());
        }
    }

    public String q()
    {
        return a;
    }

    public Drawable r()
    {
        if (g != null)
        {
            return g.e();
        } else
        {
            return null;
        }
    }

    public void s()
    {
        if (g != null)
        {
            g.g();
        }
    }

    public boolean t()
    {
        return g != null && g.f();
    }

    public int u()
    {
        return al;
    }
}
