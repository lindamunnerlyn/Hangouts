// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

public final class eik
{

    public static final ejw a;
    public static final ejt b;
    public static final ejs c;
    public static final eio d = new eix();
    private final Context e;
    private final String f;
    private final int g;
    private String h;
    private int i;
    private String j;
    private String k;
    private final boolean l;
    private int m;
    private final eio n;
    private final eor o;
    private ein p;

    public eik(Context context, String s, String s1)
    {
        this(context, s, s1, d, eot.c());
    }

    private eik(Context context, String s, String s1, eio eio1, eor eor)
    {
        boolean flag = false;
        super();
        i = -1;
        m = 0;
        e = context;
        f = context.getPackageName();
        g = a(context);
        i = -1;
        h = s;
        j = s1;
        k = null;
        l = false;
        n = eio1;
        o = eor;
        p = new ein();
        m = 0;
        if (l)
        {
            if (j == null)
            {
                flag = true;
            }
            h.b(flag, "can't be anonymous with an upload account");
        }
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

    static int a(eik eik1)
    {
        return eik1.i;
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

    static String b(eik eik1)
    {
        return eik1.h;
    }

    static String c(eik eik1)
    {
        return eik1.j;
    }

    static String d(eik eik1)
    {
        return eik1.k;
    }

    static int e(eik eik1)
    {
        return eik1.m;
    }

    static eor f(eik eik1)
    {
        return eik1.o;
    }

    static ein g(eik eik1)
    {
        return eik1.p;
    }

    static boolean h(eik eik1)
    {
        return eik1.l;
    }

    static String i(eik eik1)
    {
        return eik1.f;
    }

    static int j(eik eik1)
    {
        return eik1.g;
    }

    static eio k(eik eik1)
    {
        return eik1.n;
    }

    public eim a(byte abyte0[])
    {
        return new eim(this, abyte0);
    }

    public void a(ejx ejx)
    {
        n.a(ejx);
    }

    static 
    {
        a = new ejw();
        b = new eil();
        c = new ejs("ClearcutLogger.API", b, a);
    }
}
