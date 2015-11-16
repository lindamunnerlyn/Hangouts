// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class cty
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final cgd a;
    public final String b;
    public final String c;
    public final int d;

    private cty(ixn ixn1)
    {
        String s = null;
        super();
        a = g.a(ixn1.a, null);
        c = ixn1.b;
        if (ixn1.e != null)
        {
            s = ixn1.e.a;
        }
        b = s;
        d = g.a(ixn1.c, 0);
    }

    public static List a(ixn aixn[])
    {
        ArrayList arraylist = new ArrayList();
        int j = aixn.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new cty(aixn[i]));
        }

        return arraylist;
    }
}
