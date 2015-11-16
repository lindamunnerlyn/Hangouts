// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bjs
{

    private static int c = 16;
    private static final Object d = new Object();
    private final Context a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private bjv e;

    public bjs(Context context)
    {
        a = context;
        (new bju(this)).a(new Void[0]);
    }

    static Context a(bjs bjs1)
    {
        return bjs1.a;
    }

    static int b()
    {
        return c;
    }

    static CopyOnWriteArrayList b(bjs bjs1)
    {
        return bjs1.b;
    }

    static bjv c(bjs bjs1)
    {
        return bjs1.e;
    }

    static Object c()
    {
        return d;
    }

    public CopyOnWriteArrayList a()
    {
        return b;
    }

    public void a(int i)
    {
        while (b.remove(Integer.valueOf(i))) ;
        b.add(0, Integer.valueOf(i));
        if (e != null)
        {
            e.g_();
        }
        gbk.a(new bjt(this));
    }

    public void a(bjv bjv1)
    {
        e = bjv1;
    }

}
