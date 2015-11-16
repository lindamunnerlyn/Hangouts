// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManager;
import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class gsm
    implements grk
{

    private final AccountManager a;
    private final List b;

    gsm(Context context)
    {
        a = AccountManager.get(context);
        b = hlp.c(context, grj);
    }

    public grh a(String s)
    {
        grh agrh[] = a();
        int j = agrh.length;
        for (int i = 0; i < j; i++)
        {
            grh grh1 = agrh[i];
            if (grh1.a().equals(s))
            {
                return grh1;
            }
        }

        return null;
    }

    public void a(ad ad)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", false);
        a.addAccount("com.google", "webupdates", null, bundle, null, new gsn(this, ad), null);
    }

    public grh[] a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.addAll(((grj)iterator.next()).a())) { }
        return (grh[])arraylist.toArray(new grh[arraylist.size()]);
    }
}
