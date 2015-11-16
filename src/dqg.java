// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

public final class dqg
    implements dqd
{

    public dqg()
    {
    }

    public void a(Context context, ad ad1, String s, String s1, String s2)
    {
        if (s == null)
        {
            return;
        } else
        {
            ani ani1 = dbf.e(((gmo)hgx.a(context, gmo)).a());
            int i = context.getResources().getColor(g.ds);
            ad1.startActivityForResult(((gad)hgx.a(context, gad)).a().b(s).a(ani1.a()).a().a(i).c(s1).d(s2).b().b(i).c(), 0);
            return;
        }
    }
}
