// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class dbk
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final dbl a;
    public final int b;
    private final String c;

    private dbk(jaw jaw1)
    {
        a = new dbl(jaw1.a);
        c = jaw1.b;
        b = g.a(jaw1.c, 0);
    }

    public static List a(jaw ajaw[])
    {
        ArrayList arraylist = new ArrayList();
        int j = ajaw.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new dbk(ajaw[i]));
        }

        return arraylist;
    }
}
