// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.Choreographer;

public final class eet
    implements hor, hou, hoy
{

    private static final boolean a = false;
    private final String b;
    private final eeu c;
    private long d;
    private int e;

    public eet(String s, hof hof1)
    {
        b = s;
        hof1.a(this);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            c = new eeu(this);
            return;
        } else
        {
            c = null;
            return;
        }
    }

    static long a(eet eet1)
    {
        return eet1.d;
    }

    static long a(eet eet1, long l)
    {
        eet1.d = l;
        return l;
    }

    static String b(eet eet1)
    {
        return eet1.b;
    }

    static int c(eet eet1)
    {
        return eet1.e;
    }

    private void c()
    {
        Choreographer.getInstance().postFrameCallback(c);
    }

    static int d(eet eet1)
    {
        eet1.e = 0;
        return 0;
    }

    static int e(eet eet1)
    {
        int i = eet1.e;
        eet1.e = i + 1;
        return i;
    }

    static void f(eet eet1)
    {
        eet1.c();
    }

    public void G_()
    {
        if (a && android.os.Build.VERSION.SDK_INT >= 16)
        {
            c();
        }
    }

    public void a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            Choreographer.getInstance().removeFrameCallback(c);
        }
    }

    static 
    {
        hnc hnc = eev.g;
    }
}
