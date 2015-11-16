// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cus extends cui
{

    private static final int a[] = {
        1
    };
    private static final long serialVersionUID = 1L;
    private final String b;
    private final String c;

    public cus(String s, String s1)
    {
        c = s;
        b = s1;
    }

    public String a()
    {
        return "ui_queue";
    }

    public kop a(String s, int i, int j)
    {
        ixk ixk1 = new ixk();
        ixk1.a = c;
        ixk1.b = Integer.valueOf(50);
        ixk1.f = a;
        ixk1.requestHeader = ctq.a(null, true, s, i, j, h);
        return ixk1;
    }

    public boolean a(ccg ccg)
    {
        gbh.a(getClass(), ccg.getClass());
        return TextUtils.equals(((cus)ccg).b, b);
    }

    public boolean a(cci cci, dbo dbo)
    {
        return false;
    }

    public String g()
    {
        return "contacts/searchentities";
    }

}
