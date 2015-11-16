// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;
import java.util.HashMap;

final class frf extends fti
{

    DataHolder b;
    Cursor c;
    fsf d;
    fsf e;
    ArrayList f;
    HashMap g;
    frj h;
    frj i;
    final boolean j;
    fre k;
    private volatile boolean l;
    private final int m;
    private Context n;

    public frf(DataHolder dataholder, Cursor cursor, Context context, int i1, fsf fsf1, fsf fsf2, ArrayList arraylist, 
            HashMap hashmap, int j1, Bundle bundle)
    {
        boolean flag1 = true;
        super(dataholder);
        g.d(dataholder);
        g.d(cursor);
        g.d(hashmap);
        boolean flag;
        if (i1 == fsf1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag);
        if (i1 == fsf2.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag);
        if (i1 == arraylist.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag);
        b = dataholder;
        c = cursor;
        m = i1;
        f = arraylist;
        n = context;
        g = hashmap;
        h = new frg(this, n.getResources());
        i = new frh(this, n.getResources());
        d = fsf1;
        e = fsf2;
        if ((j1 & 1) != 0 && g.m(6))
        {
            Log.e("PeopleAggregator", "PeopleExtraColumnBitmask.EMAILS is not supported in aggregation.  Ignored.");
        }
        if ((j1 & 2) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        j = flag;
        k = new fre(bundle);
    }

    public int a()
    {
        e();
        return m;
    }

    public Object a(int i1)
    {
        e();
        return new fri(this, i1);
    }

    public void b()
    {
        if (l)
        {
            return;
        } else
        {
            l = true;
            b.f();
            c.close();
            b = null;
            c = null;
            d = null;
            e = null;
            f = null;
            g = null;
            n = null;
            h = null;
            i = null;
            k = null;
            return;
        }
    }

    void e()
    {
        if (l)
        {
            throw new IllegalStateException("Already released");
        } else
        {
            return;
        }
    }
}
