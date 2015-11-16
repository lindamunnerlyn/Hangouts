// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import java.util.Random;

public abstract class bib extends bkj
    implements ara, eic
{

    public static final Random e = new Random();

    public bib()
    {
    }

    public static boolean a(dsu dsu1)
    {
        switch (bic.a[dsu1.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            return true;
        }
    }

    public abstract void D();

    public abstract void E();

    public abstract void H();

    public abstract boolean I();

    public abstract cfz M();

    public abstract String O();

    public abstract int R();

    public abstract Handler T();

    public abstract aoa a();

    public abstract void a(bid bid);

    public abstract void a(CharSequence charsequence);

    public abstract boolean a(long l);

    public abstract void c(int i);

    public abstract void c(long l);

    public abstract String d(cgd cgd);

    public abstract void d(String s);

    public abstract String e(cgd cgd);

    public abstract String f(cgd cgd);

    public abstract String g(cgd cgd);

    public abstract boolean v();

}
