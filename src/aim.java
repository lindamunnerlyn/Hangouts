// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.Serializable;

public final class aim
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private final String a;
    private String b;
    private final int c;
    private final aio d;

    public aim(ain ain1)
    {
        gbh.b("Circle id can't be null", ain1.a);
        a = ain1.a;
        b = ain1.b;
        c = ain1.c;
        d = ain1.d;
    }

    public static ain newBuilder()
    {
        return new ain();
    }

    public static ain newBuilder(aim aim1)
    {
        return newBuilder().a(aim1);
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
        ain ain1 = new ain();
        ain1.d = d;
        ain1.a = a;
        ain1.b = b;
        ain1.c = c;
        return ain1.a();
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
        if (!(obj instanceof aim))
        {
            return false;
        } else
        {
            obj = (aim)obj;
            return a.equals(((aim) (obj)).a);
        }
    }

    public boolean f()
    {
        return d != null;
    }

    public aio g()
    {
        return d;
    }

    public int hashCode()
    {
        return a.hashCode();
    }
}
