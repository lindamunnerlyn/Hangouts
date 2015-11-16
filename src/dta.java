// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;

public final class dta
    implements dsx
{

    public dta()
    {
    }

    public void a(Context context, ad ad1, String s, String s1, String s2)
    {
        if (s == null)
        {
            return;
        } else
        {
            aoa aoa1 = dcn.e(((gqu)hlp.a(context, gqu)).a());
            int i = context.getResources().getColor(g.ds);
            int j = context.getResources().getColor(g.dr);
            ad1.startActivityForResult(((gcr)hlp.a(context, gcr)).a().b(s).a(aoa1.a()).a().a(j).c(s1).d(s2).b().b(i).c(), 0);
            return;
        }
    }
}
