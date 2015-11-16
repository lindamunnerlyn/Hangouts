// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class hhs extends hkh
    implements hha
{

    private hjr aj;
    public final hhb ak = new hhb();
    public final hgx al;

    public hhs()
    {
        al = ak.getBinder();
    }

    static hjg a(hhs hhs1)
    {
        return hhs1.am;
    }

    public void e(Bundle bundle)
    {
        al.a(new hia(this, am));
    }

    public hgx getBinder()
    {
        return al;
    }

    public Context getContext()
    {
        return ak;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(ak);
    }

    public void onAttach(Activity activity)
    {
        hgx hgx1 = hgx.a(activity, getParentFragment());
        ak.a(activity);
        ak.a(hgx1);
        al.b(getClass().getName());
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        e(bundle);
        for (Iterator iterator = al.c(hib).iterator(); iterator.hasNext(); iterator.next()) { }
        al.a();
        aj = am.a(new hht(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        am.b(aj);
        super.onDestroy();
    }
}
