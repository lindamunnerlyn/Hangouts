// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class cuv extends cup
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    private final boolean j;

    public cuv(String s, String s1, String s2, boolean flag, boolean flag1)
    {
        gdv.b("Expected condition to be false", TextUtils.isEmpty(s));
        a = s;
        b = s1;
        c = s2;
        d = flag;
        j = flag1;
    }

    public kws a(String s, int i, int k)
    {
        Object obj = new ipg();
        obj.c = a;
        s = new ipt();
        s.a = ((ipg) (obj));
        s.b = c;
        obj = new ipu();
        obj.a = (new ipt[] {
            s
        });
        obj.b = Boolean.valueOf(d);
        s = new iqf();
        s.a = ((ipu) (obj));
        if (!d)
        {
            s.d = Boolean.valueOf(true);
        }
        obj = new hya();
        obj.a = s;
        return ((kws) (obj));
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return j && super.a(cdn, dcx);
    }

    public String f()
    {
        return "blockuser";
    }
}
