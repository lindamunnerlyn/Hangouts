// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class aaj
{

    private final Intent a;
    private Integer b;
    private String c;
    private String d;
    private String e;
    private String f[];
    private String g;
    private Float h;
    private boolean i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private boolean q;

    public aaj(Context context, Class class1)
    {
        a = new Intent(context, class1);
        k = false;
        p = false;
        q = false;
        i = true;
    }

    public aaj a()
    {
        p = true;
        return this;
    }

    public aaj a(float f1)
    {
        h = Float.valueOf(f1);
        return this;
    }

    public aaj a(int i1, int j1, int k1, int l1)
    {
        k = true;
        l = i1;
        m = j1;
        n = k1;
        o = l1;
        return this;
    }

    public aaj a(String s)
    {
        c = s;
        return this;
    }

    public aaj a(boolean flag)
    {
        q = flag;
        return this;
    }

    public aaj a(String as[])
    {
        f = as;
        return this;
    }

    public aaj b(String s)
    {
        d = s;
        return this;
    }

    public Intent b()
    {
        a.setAction("android.intent.action.VIEW");
        a.setFlags(0x4080000);
        if (b != null)
        {
            a.putExtra("photo_index", b.intValue());
        }
        if (c != null)
        {
            a.putExtra("initial_photo_uri", c);
        }
        if (c != null && b != null)
        {
            throw new IllegalStateException("specified both photo index and photo uri");
        }
        if (d != null)
        {
            a.putExtra("photos_uri", d);
            a.setData(Uri.parse(d));
        }
        if (e != null)
        {
            a.putExtra("resolved_photo_uri", e);
        }
        if (f != null)
        {
            a.putExtra("projection", f);
        }
        if (g != null)
        {
            a.putExtra("thumbnail_uri", g);
        }
        if (h != null)
        {
            a.putExtra("max_scale", h);
        }
        a.putExtra("watch_network", j);
        a.putExtra("scale_up_animation", k);
        if (k)
        {
            a.putExtra("start_x_extra", l);
            a.putExtra("start_y_extra", m);
            a.putExtra("start_width_extra", n);
            a.putExtra("start_height_extra", o);
        }
        a.putExtra("action_bar_hidden_initially", p);
        a.putExtra("display_thumbs_fullscreen", q);
        a.putExtra("enable_timer_lights_out", i);
        return a;
    }

    public aaj c(String s)
    {
        e = s;
        return this;
    }

    public aaj d(String s)
    {
        g = s;
        return this;
    }
}
