// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class hea
{

    public static final String a = hdn.getName();
    public static final String b = hdo.getName();
    public static final String c = hig.getName();
    private static hdz d;

    public static void a(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new hdz();
        }
        hgx1.a(hdn, new hdk(context));
    }

    public static void a(hgx hgx1)
    {
        if (d == null)
        {
            d = new hdz();
        }
        hij hij = hig.a;
        hgx1.a(hig, new hig[0]);
    }

    public static void b(Context context, hgx hgx1)
    {
        if (d == null)
        {
            d = new hdz();
        }
        ArrayList arraylist = new ArrayList(2);
        hij hij = hdl.a;
        context = (hbn)hgx.b(context, hbn);
        if (context != null)
        {
            arraylist.add(new hdv(context));
        }
        hgx1.a(hdo, (hdo[])arraylist.toArray(new hdo[arraylist.size()]));
    }

}
