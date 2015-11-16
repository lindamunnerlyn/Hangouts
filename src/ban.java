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

public class ban extends hhu
    implements aur
{

    private gow a;
    private final gov b = new bao(this);
    private final gov c = new bap(this);
    private final gov d = new baq(this);

    public ban()
    {
    }

    static hhb a(ban ban1)
    {
        return ban1.context;
    }

    static gow b(ban ban1)
    {
        return ban1.a;
    }

    static void c(ban ban1)
    {
        ((bdp)ban1.binder.a(bdp)).a(2340);
    }

    static hhb d(ban ban1)
    {
        return ban1.context;
    }

    static hhb e(ban ban1)
    {
        return ban1.context;
    }

    private void e()
    {
        String s = getResources().getString(g.kS);
        Toast.makeText(context, s, 1).show();
    }

    static hgx f(ban ban1)
    {
        return ban1.binder;
    }

    public boolean a()
    {
        ((ayf)binder.a(ayf)).h();
        if (!g.a(dbf.e(((gmo)binder.a(gmo)).a()), apk.f))
        {
            Toast.makeText(context, g.kM, 1).show();
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
        Intent intent = azg.a(context);
        if (intent == null)
        {
            e();
            return;
        }
        try
        {
            intent.putExtra("android.intent.extra.showActionIcons", false);
            a.a(g.ku, intent);
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
        a = ((gow)binder.a(gow)).a(g.ku, b);
        a = ((gow)binder.a(gow)).a(g.kv, c);
        a = ((gow)binder.a(gow)).a(g.ko, d);
        a = ((gow)binder.a(gow)).a(g.kp, d);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return null;
    }
}
