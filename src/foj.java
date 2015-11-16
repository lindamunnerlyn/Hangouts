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

final class foj extends fqp
{

    private volatile boolean b;
    private final int c;
    private DataHolder d;
    private Cursor e;
    private fpk f;
    private fpk g;
    private ArrayList h;
    private HashMap i;
    private Context j;
    private fon k;
    private fon l;
    private final boolean m;
    private foi n;

    public foj(DataHolder dataholder, Cursor cursor, Context context, int i1, fpk fpk1, fpk fpk2, ArrayList arraylist, 
            HashMap hashmap, int j1, Bundle bundle)
    {
        boolean flag1 = true;
        super(dataholder);
        h.a(dataholder);
        h.a(cursor);
        h.a(hashmap);
        boolean flag;
        if (i1 == fpk1.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.b(flag);
        if (i1 == fpk2.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.b(flag);
        if (i1 == arraylist.size())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h.b(flag);
        d = dataholder;
        e = cursor;
        c = i1;
        h = arraylist;
        j = context;
        i = hashmap;
        k = new fok(this, j.getResources());
        l = new fol(this, j.getResources());
        f = fpk1;
        g = fpk2;
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
        m = flag;
        n = new foi(bundle);
    }

    static fpk a(foj foj1)
    {
        return foj1.f;
    }

    static fpk b(foj foj1)
    {
        return foj1.g;
    }

    static void c(foj foj1)
    {
        foj1.e();
    }

    static DataHolder d(foj foj1)
    {
        return foj1.d;
    }

    static Cursor e(foj foj1)
    {
        return foj1.e;
    }

    private void e()
    {
        if (b)
        {
            throw new IllegalStateException("Already released");
        } else
        {
            return;
        }
    }

    static ArrayList f(foj foj1)
    {
        return foj1.h;
    }

    static boolean g(foj foj1)
    {
        return foj1.m;
    }

    static foi h(foj foj1)
    {
        return foj1.n;
    }

    static fon i(foj foj1)
    {
        return foj1.k;
    }

    static HashMap j(foj foj1)
    {
        return foj1.i;
    }

    static fon k(foj foj1)
    {
        return foj1.l;
    }

    public int a()
    {
        e();
        return c;
    }

    public Object a(int i1)
    {
        e();
        return new fom(this, i1);
    }

    public void b()
    {
        if (b)
        {
            return;
        } else
        {
            b = true;
            d.i();
            e.close();
            d = null;
            e = null;
            f = null;
            g = null;
            h = null;
            i = null;
            j = null;
            k = null;
            l = null;
            n = null;
            return;
        }
    }
}
