// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;

public final class ees extends gea
{

    private ArrayList a;

    public ees(Context context, int ai[], ArrayList arraylist)
    {
        super(context, ai);
        a = arraylist;
    }

    public void a(String s)
    {
        a.add(s);
    }

    protected void a(jll jll1)
    {
        super.a(jll1);
        gmq gmq1 = bnk.a().g();
        if (gmq1 != null)
        {
            jll1.a = new jlk();
            jll1.a.k = gmq1.c();
            jll1.a.e = gmq1.e();
            jll1.a.b = gmq1.d();
            jll1.g = new iui();
            jll1.g.d = Integer.valueOf(gmq1.f());
        }
    }
}
