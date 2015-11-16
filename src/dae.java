// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public final class dae
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    public final daf a;
    public final int b;
    private final String c;

    private dae(iur iur1)
    {
        a = new daf(iur1.a);
        c = iur1.b;
        b = g.a(iur1.c, 0);
    }

    public static List a(iur aiur[])
    {
        ArrayList arraylist = new ArrayList();
        int j = aiur.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(new dae(aiur[i]));
        }

        return arraylist;
    }
}
