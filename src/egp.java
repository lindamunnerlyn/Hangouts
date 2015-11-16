// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class egp extends eez
    implements efo
{

    private String a;
    private String b;
    private String g;
    private ani h;
    private android.view.View.OnClickListener i;

    public egp(Context context)
    {
        this(context, (byte)0);
    }

    private egp(Context context, byte byte0)
    {
        super(context, null);
    }

    static String a(egp egp1)
    {
        return egp1.g;
    }

    static String a(egp egp1, String s)
    {
        egp1.g = s;
        return s;
    }

    static void b(egp egp1)
    {
        egp1.g();
    }

    static ani c(egp egp1)
    {
        return egp1.h;
    }

    static String d(egp egp1)
    {
        return egp1.a;
    }

    static String e(egp egp1)
    {
        return egp1.b;
    }

    private void g()
    {
        if (a != null && b != null && TextUtils.isEmpty(g))
        {
            setEnabled(false);
            (new egr(this)).execute(new Void[0]);
        }
    }

    public void a(ani ani, boolean flag, String s, ad ad, String s1, String s2, String s3, 
            int j, int k, int i1)
    {
        h = ani;
        a = s2;
        b = s1;
        a(s3, 0L);
        if (!flag || !TextUtils.isEmpty(s3))
        {
            g();
        }
        i = new egq(this, ad);
        setOnClickListener(i);
        a(l.ts);
        super.a(ani, flag, s, j, k, i1);
    }

    public void a(String s)
    {
    }

    public void a(String s, long l1)
    {
        g = s;
    }

    public void d()
    {
        super.d();
        g();
    }
}
