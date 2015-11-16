// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class ell
{

    public static final emx a;
    public static final emu b;
    public static final emt c;
    public static final elp d = new ely();
    private final Context e;
    private final String f;
    private final int g;
    private String h;
    private int i;
    private String j;
    private String k;
    private final boolean l;
    private int m;
    private final elp n;
    private final erp o;
    private elo p;

    public ell(Context context)
    {
        elp elp1 = d;
        erp erp = err.c();
        new elo();
        this(context, -1, null, null, elp1, erp);
    }

    private ell(Context context, int i1, String s, String s1, elp elp1, erp erp)
    {
        this(context, -1, "", null, null, elp1, erp);
    }

    private ell(Context context, int i1, String s, String s1, String s2, elp elp1, erp erp)
    {
        boolean flag = false;
        super();
        i = -1;
        m = 0;
        e = context;
        f = context.getPackageName();
        g = a(context);
        i = i1;
        h = s;
        j = s1;
        k = s2;
        l = false;
        n = elp1;
        o = erp;
        p = new elo();
        m = 0;
        if (l)
        {
            if (j == null)
            {
                flag = true;
            }
            g.b(flag, "can't be anonymous with an upload account");
        }
    }

    public ell(Context context, String s, String s1)
    {
        this(context, -1, s, s1, null, d, err.c());
    }

    private static int a(Context context)
    {
        int i1;
        try
        {
            i1 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.wtf("ClearcutLogger", "This can't happen.");
            return 0;
        }
        return i1;
    }

    static int a(ell ell1)
    {
        return ell1.i;
    }

    static int[] a(ArrayList arraylist)
    {
        if (arraylist == null)
        {
            return null;
        }
        int ai[] = new int[arraylist.size()];
        arraylist = arraylist.iterator();
        for (int i1 = 0; arraylist.hasNext(); i1++)
        {
            ai[i1] = ((Integer)arraylist.next()).intValue();
        }

        return ai;
    }

    static String b(ell ell1)
    {
        return ell1.h;
    }

    static String c(ell ell1)
    {
        return ell1.j;
    }

    static String d(ell ell1)
    {
        return ell1.k;
    }

    static int e(ell ell1)
    {
        return ell1.m;
    }

    static erp f(ell ell1)
    {
        return ell1.o;
    }

    static elo g(ell ell1)
    {
        return ell1.p;
    }

    static boolean h(ell ell1)
    {
        return ell1.l;
    }

    static String i(ell ell1)
    {
        return ell1.f;
    }

    static int j(ell ell1)
    {
        return ell1.g;
    }

    static elp k(ell ell1)
    {
        return ell1.n;
    }

    static Context l(ell ell1)
    {
        return ell1.e;
    }

    public eln a(byte abyte0[])
    {
        return new eln(this, abyte0);
    }

    public void a(emy emy)
    {
        n.a(emy);
    }

    public boolean a(TimeUnit timeunit)
    {
        return n.a(5000L, timeunit);
    }

    static 
    {
        a = new emx();
        b = new elm();
        c = new emt("ClearcutLogger.API", b, a);
    }
}
