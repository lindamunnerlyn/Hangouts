// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Notification;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.os.Bundle;
import java.util.ArrayList;

public final class cs
    implements ch
{

    private ArrayList a;
    private int b;
    private PendingIntent c;
    private ArrayList d;
    private Bitmap e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;

    public cs()
    {
        a = new ArrayList();
        b = 1;
        d = new ArrayList();
        g = 0x800005;
        h = -1;
        i = 0;
        k = 80;
    }

    private void a(int i1, boolean flag)
    {
        b = b | i1;
    }

    public cf a(cf cf1)
    {
        Bundle bundle = new Bundle();
        if (!a.isEmpty())
        {
            bundle.putParcelableArrayList("actions", ca.a().a((cb[])a.toArray(new cb[a.size()])));
        }
        if (b != 1)
        {
            bundle.putInt("flags", b);
        }
        if (c != null)
        {
            bundle.putParcelable("displayIntent", c);
        }
        if (!d.isEmpty())
        {
            bundle.putParcelableArray("pages", (android.os.Parcelable[])d.toArray(new Notification[d.size()]));
        }
        if (e != null)
        {
            bundle.putParcelable("background", e);
        }
        if (f != 0)
        {
            bundle.putInt("contentIcon", f);
        }
        if (g != 0x800005)
        {
            bundle.putInt("contentIconGravity", g);
        }
        if (h != -1)
        {
            bundle.putInt("contentActionIndex", h);
        }
        if (i != 0)
        {
            bundle.putInt("customSizePreset", i);
        }
        if (j != 0)
        {
            bundle.putInt("customContentHeight", j);
        }
        if (k != 80)
        {
            bundle.putInt("gravity", k);
        }
        if (l != 0)
        {
            bundle.putInt("hintScreenTimeout", l);
        }
        cf1.f().putBundle("android.wearable.EXTENSIONS", bundle);
        return cf1;
    }

    public cs a()
    {
        a(8, true);
        return this;
    }

    public cs a(Notification notification)
    {
        d.add(notification);
        return this;
    }

    public cs a(Bitmap bitmap)
    {
        e = bitmap;
        return this;
    }

    public cs a(cb cb1)
    {
        a.add(cb1);
        return this;
    }

    public cs b()
    {
        a(4, true);
        return this;
    }

    public cs c()
    {
        l = -1;
        return this;
    }

    public Object clone()
    {
        cs cs1 = new cs();
        cs1.a = new ArrayList(a);
        cs1.b = b;
        cs1.c = c;
        cs1.d = new ArrayList(d);
        cs1.e = e;
        cs1.f = f;
        cs1.g = g;
        cs1.h = h;
        cs1.i = i;
        cs1.j = j;
        cs1.k = k;
        cs1.l = l;
        return cs1;
    }
}
