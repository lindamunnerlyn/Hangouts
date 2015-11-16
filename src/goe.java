// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.accounts.AccountManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class goe
    implements gnd
{

    private final AccountManager a;
    private final List b;

    goe(Context context)
    {
        a = AccountManager.get(context);
        b = hgx.c(context, gnc);
    }

    static void a(goe goe1, ad ad1, Intent intent)
    {
        ap ap1 = ad1.getChildFragmentManager();
        goh goh1 = (goh)ap1.a("new.account.launcher");
        ad1 = goh1;
        if (goh1 == null)
        {
            ad1 = new goh();
            ap1.a().a(ad1, "new.account.launcher").c();
        }
        g.a(new gog(goe1, ad1, intent));
    }

    public gna a(String s)
    {
        gna agna[] = a();
        int j = agna.length;
        for (int i = 0; i < j; i++)
        {
            gna gna1 = agna[i];
            if (gna1.a().equals(s))
            {
                return gna1;
            }
        }

        return null;
    }

    public void a(ad ad1)
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("allowSkip", false);
        a.addAccount("com.google", "webupdates", null, bundle, null, new gof(this, ad1), null);
    }

    public gna[] a()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraylist.addAll(((gnc)iterator.next()).a())) { }
        return (gna[])arraylist.toArray(new gna[arraylist.size()]);
    }
}
