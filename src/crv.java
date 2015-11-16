// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class crv
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final cey a;
    public final String b;
    public final String c;
    public final int d;

    private crv(iri iri1)
    {
        String s = null;
        super();
        a = g.a(iri1.a, null);
        c = iri1.b;
        if (iri1.e != null)
        {
            s = iri1.e.a;
        }
        b = s;
        d = g.a(iri1.c, 0);
    }

    public static List a(iri airi[])
    {
        ArrayList arraylist = new ArrayList();
        int j = airi.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new crv(airi[i]));
        }

        return arraylist;
    }
}
