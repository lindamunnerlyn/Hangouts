// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class gon
{

    public static final String a = gok.getName();
    public static final String b = hig.getName();
    private static gom c;

    public static void a(Context context, hgx hgx1)
    {
        if (c == null)
        {
            c = new gom();
        }
        hgx1.a(gok, new gol(context));
    }

    public static void a(hgx hgx1)
    {
        if (c == null)
        {
            c = new gom();
        }
        hij hij = hig.a;
        hgx1.a(hig, new hig[0]);
    }

}
