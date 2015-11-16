// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;

public final class aif
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private String b;
    private final int c;
    private final aih d;

    public aif(aig aig1)
    {
        gdv.b("Circle id can't be null", aig1.a);
        a = aig1.a;
        b = aig1.b;
        c = aig1.c;
        d = aig1.d;
    }

    public static aig newBuilder()
    {
        return new aig();
    }

    public static aig newBuilder(aif aif1)
    {
        return newBuilder().a(aif1);
    }

    public boolean a()
    {
        return !TextUtils.isEmpty(a);
    }

    public String b()
    {
        return a;
    }

    public boolean c()
    {
        return !TextUtils.isEmpty(b);
    }

    public Object clone()
    {
        aig aig1 = new aig();
        aig1.d = d;
        aig1.a = a;
        aig1.b = b;
        aig1.c = c;
        return aig1.a();
    }

    public String d()
    {
        return b;
    }

    public int e()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof aif))
        {
            return false;
        } else
        {
            obj = (aif)obj;
            return a.equals(((aif) (obj)).a);
        }
    }

    public boolean f()
    {
        return d != null;
    }

    public aih g()
    {
        return d;
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
