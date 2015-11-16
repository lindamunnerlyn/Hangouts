// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

final class cad
    implements Runnable
{

    final int a;
    final ArrayList b;
    final cac c;

    cad(cac cac1, int i, ArrayList arraylist)
    {
        c = cac1;
        a = i;
        b = arraylist;
        super();
    }

    public void run()
    {
        int i = ((dgt)hgx.a(c.c, dgt)).a(dbf.e(a), b);
        c.a(i);
    }
}
