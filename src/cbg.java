// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;

final class cbg
    implements Runnable
{

    final int a;
    final ArrayList b;
    final cbf c;

    cbg(cbf cbf1, int i, ArrayList arraylist)
    {
        c = cbf1;
        a = i;
        b = arraylist;
        super();
    }

    public void run()
    {
        int i = ((dic)hlp.a(c.c, dic)).a(dcn.e(a), b);
        c.a(i);
    }
}
