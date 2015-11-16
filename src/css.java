// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;

public class css extends csm
{

    private static final long serialVersionUID = 1L;
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    private final boolean j;

    public css(String s, String s1, String s2, boolean flag, boolean flag1)
    {
        gbh.b(TextUtils.isEmpty(s));
        a = s;
        b = s1;
        c = s2;
        d = flag;
        j = flag1;
    }

    public kop a(String s, int i, int k)
    {
        Object obj = new ikc();
        obj.c = a;
        s = new ikp();
        s.a = ((ikc) (obj));
        s.b = c;
        obj = new ikq();
        obj.a = (new ikp[] {
            s
        });
        obj.b = Boolean.valueOf(d);
        s = new ilb();
        s.a = ((ikq) (obj));
        if (!d)
        {
            s.d = Boolean.valueOf(true);
        }
        obj = new hsw();
        obj.a = s;
        return ((kop) (obj));
    }

    public boolean a(cci cci, dbo dbo)
    {
        if (j)
        {
            return super.a(cci, dbo);
        } else
        {
            return false;
        }
    }

    public String g()
    {
        return "blockuser";
    }
}
