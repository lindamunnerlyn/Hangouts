// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class ejr extends eib
    implements eiq
{

    private String a;
    private String b;
    private String g;
    private aoa h;
    private android.view.View.OnClickListener i;

    public ejr(Context context)
    {
        this(context, (byte)0);
    }

    private ejr(Context context, byte byte0)
    {
        super(context, null);
    }

    static String a(ejr ejr1)
    {
        return ejr1.g;
    }

    static String a(ejr ejr1, String s)
    {
        ejr1.g = s;
        return s;
    }

    static void b(ejr ejr1)
    {
        ejr1.g();
    }

    static aoa c(ejr ejr1)
    {
        return ejr1.h;
    }

    static String d(ejr ejr1)
    {
        return ejr1.a;
    }

    static String e(ejr ejr1)
    {
        return ejr1.b;
    }

    private void g()
    {
        if (a != null && b != null && TextUtils.isEmpty(g))
        {
            setEnabled(false);
            (new ejt(this)).execute(new Void[0]);
        }
    }

    public void a(aoa aoa, boolean flag, String s, ad ad, String s1, String s2, String s3, 
            int j, int k, int i1)
    {
        h = aoa;
        a = s2;
        b = s1;
        a(s3, 0L);
        if (!flag || !TextUtils.isEmpty(s3))
        {
            g();
        }
        i = new ejs(this, ad);
        setOnClickListener(i);
        a(l.sK);
        super.a(aoa, flag, s, j, k, i1);
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
