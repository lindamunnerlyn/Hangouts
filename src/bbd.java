// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class bbd extends hmm
    implements avi
{

    private gte a;
    private final gtd b = new bbe(this);
    private final gtd c = new bbf(this);
    private final gtd d = new bbg(this);

    public bbd()
    {
    }

    static hlt a(bbd bbd1)
    {
        return bbd1.context;
    }

    static gte b(bbd bbd1)
    {
        return bbd1.a;
    }

    static void c(bbd bbd1)
    {
        ((beb)bbd1.binder.a(beb)).a(2340);
    }

    static hlt d(bbd bbd1)
    {
        return bbd1.context;
    }

    static hlt e(bbd bbd1)
    {
        return bbd1.context;
    }

    private void e()
    {
        String s = getResources().getString(g.kK);
        Toast.makeText(context, s, 0).show();
    }

    static hlt f(bbd bbd1)
    {
        return bbd1.context;
    }

    static hlp g(bbd bbd1)
    {
        return bbd1.binder;
    }

    public boolean a()
    {
        ((ayt)binder.a(ayt)).h();
        if (!g.a(dcn.e(((gqu)binder.a(gqu)).a()), aqc.f))
        {
            Toast.makeText(context, g.kD, 0).show();
            return false;
        } else
        {
            d();
            return false;
        }
    }

    public void b()
    {
    }

    public boolean c()
    {
        return false;
    }

    void d()
    {
        Intent intent = azt.a(context);
        if (intent == null)
        {
            e();
            return;
        }
        try
        {
            intent.putExtra("android.intent.extra.showActionIcons", false);
            a.a(g.kn, intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            e();
        }
    }

    protected void onAttachBinder(Bundle bundle)
    {
        super.onAttachBinder(bundle);
        a = ((gte)binder.a(gte)).a(g.kn, b);
        a = ((gte)binder.a(gte)).a(g.ko, c);
        a = ((gte)binder.a(gte)).a(g.kh, d);
        a = ((gte)binder.a(gte)).a(g.ki, d);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }
}
