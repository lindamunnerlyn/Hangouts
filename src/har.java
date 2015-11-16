// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class har
{

    final Context a;
    String b;
    String c;
    String d;
    hat e;
    boolean f;
    hba g;
    gzx h;

    public har(Context context)
    {
        e = hap.c();
        g = hba.d;
        h = gzx.a;
        g.c(context, "context must be non-null");
        a = context;
    }

    public hap a()
    {
        g.a(b, "must specify an accountName");
        g.a(c, "must specify an accountGaiaId");
        return new hap(this);
    }

    public har a(hat hat)
    {
        g.c(hat, "progressListener must be non-null");
        e = hat;
        return this;
    }

    public har a(String s)
    {
        b = s;
        return this;
    }

    public har b(String s)
    {
        c = s;
        return this;
    }

    public har c(String s)
    {
        d = s;
        return this;
    }
}
