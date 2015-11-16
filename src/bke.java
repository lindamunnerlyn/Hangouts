// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

public final class bke
{

    private static int c = 16;
    private static final Object d = new Object();
    private final Context a;
    private final CopyOnWriteArrayList b = new CopyOnWriteArrayList();
    private bkh e;

    public bke(Context context)
    {
        a = context;
        (new bkg(this)).a(new Void[0]);
    }

    static Context a(bke bke1)
    {
        return bke1.a;
    }

    static int b()
    {
        return c;
    }

    static CopyOnWriteArrayList b(bke bke1)
    {
        return bke1.b;
    }

    static bkh c(bke bke1)
    {
        return bke1.e;
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
            e.i_();
        }
        gdy.a(new bkf(this));
    }

    public void a(bkh bkh1)
    {
        e = bkh1;
    }

}
