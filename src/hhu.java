// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class hhu extends hki
    implements hha
{

    private hjr a;
    public final hgx binder;
    public final hhb context = new hhb();

    public hhu()
    {
        binder = context.getBinder();
    }

    static hjg a(hhu hhu1)
    {
        return hhu1.lifecycle;
    }

    public hgx getBinder()
    {
        return binder;
    }

    public Context getContext()
    {
        return context;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(context);
    }

    public void onAttach(Activity activity)
    {
        hgx hgx1 = hgx.a(activity, getParentFragment());
        context.a(activity);
        context.a(hgx1);
        binder.b(getClass().getName());
        super.onAttach(activity);
    }

    public void onAttachBinder(Bundle bundle)
    {
        binder.a(new hia(this, lifecycle));
    }

    public void onCreate(Bundle bundle)
    {
        onAttachBinder(bundle);
        for (Iterator iterator = binder.c(hib).iterator(); iterator.hasNext(); iterator.next()) { }
        binder.a();
        a = lifecycle.a(new hhv(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        lifecycle.b(a);
        super.onDestroy();
    }
}
