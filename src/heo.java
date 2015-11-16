// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import java.util.Iterator;
import java.util.List;

public class heo extends hez
    implements hha
{

    public final hhb a = new hhb();
    public final hgx b;
    private hjr e;

    public heo()
    {
        b = a.getBinder();
    }

    public void a(Bundle bundle)
    {
        b.a(new hia(this, c));
    }

    public hgx getBinder()
    {
        return b;
    }

    public Context getContext()
    {
        return a;
    }

    public LayoutInflater getLayoutInflater(Bundle bundle)
    {
        super.getLayoutInflater(bundle);
        return LayoutInflater.from(a);
    }

    public void onAttach(Activity activity)
    {
        hgx hgx1 = hgx.a(activity, getParentFragment());
        a.a(activity);
        a.a(hgx1);
        c.a(activity);
        super.onAttach(activity);
    }

    public void onCreate(Bundle bundle)
    {
        a(bundle);
        for (Iterator iterator = b.c(hib).iterator(); iterator.hasNext(); iterator.next()) { }
        b.a();
        e = c.a(new hep(this, bundle));
        super.onCreate(bundle);
    }

    public void onDestroy()
    {
        c.b(e);
        super.onDestroy();
    }
}
