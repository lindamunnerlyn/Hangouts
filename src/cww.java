// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cww extends cwm
{

    private static final int a[] = {
        1
    };
    private static final long serialVersionUID = 1L;
    private final String b;
    private final String c;

    public cww(String s, String s1)
    {
        c = s;
        b = s1;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kws a(String s, int i, int j)
    {
        jdp jdp1 = new jdp();
        jdp1.a = c;
        jdp1.b = Integer.valueOf(50);
        jdp1.f = a;
        jdp1.requestHeader = cvu.a(null, true, s, i, j, h);
        return jdp1;
    }

    public boolean a(cdl cdl)
    {
        gdv.a(getClass(), cdl.getClass());
        return TextUtils.equals(((cww)cdl).b, b);
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return false;
    }

    public String f()
    {
        return "contacts/searchentities";
    }

}
