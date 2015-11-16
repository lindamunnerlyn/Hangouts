// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.mergedcontacts.impl.MergeContactsService;
import java.util.ArrayList;

final class cai
    implements Runnable
{

    final int a;
    final ArrayList b;
    final cah c;

    cai(cah cah1, int i, ArrayList arraylist)
    {
        c = cah1;
        a = i;
        b = arraylist;
        super();
    }

    public void run()
    {
        int i = ((dgt)hgx.a(c.b.getApplicationContext(), dgt)).a(dbf.e(a), b);
        c.a(i);
    }
}
