// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class ajd
{

    public static final String a = aiw.getName();
    public static final String b = dha.getName();
    public static final String c = ajf.getName();
    private static ajc d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new ajc();
        }
        hgx1.a(dha, new dha[] {
            new aje(context)
        });
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new ajc();
        }
        hgx1.a(aiw, new aix());
    }

    public static void b(hgx hgx1)
    {
        if (d == null)
        {
            d = new ajc();
        }
        hgx1.a(ajf, new ajf());
    }

}
