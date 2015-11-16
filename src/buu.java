// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

final class buu
    implements fsn, hhi, hju, hjw, hjy, hkc, hkd
{

    final ps a;
    btu b;
    buz c;
    private bts d;
    private final buw e = new buw(this);
    private bpn f;

    buu(ps ps1, hjm hjm1)
    {
        a = ps1;
        hjm1.a(this);
    }

    private boolean d()
    {
        btv btv1 = b.a();
        return b.b() && (btv1 == btv.b || btv1 == btv.c || btv1 == btv.d) && d.b();
    }

    public void a(Context context, hgx hgx1, Bundle bundle)
    {
        b = (btu)hgx1.a(btu);
        d = (bts)hgx1.a(bts);
        c = (buz)hgx1.a(buz);
    }

    boolean a(int i)
    {
        if (!d()) goto _L2; else goto _L1
_L1:
        g.b(i);
        buv.a[b.a().ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 54
    //                   2 74
    //                   3 74;
           goto _L2 _L3 _L4 _L4
_L2:
        return false;
_L3:
        (new btw()).a(a.t_(), null);
        return true;
_L4:
        (new bun()).a(a.t_(), null);
        return true;
    }

    public boolean a(Menu menu)
    {
        (new MenuInflater(a)).inflate(g.mt, menu);
        return b(menu);
    }

    public boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == g.mr)
        {
            return a(2243);
        } else
        {
            return false;
        }
    }

    public boolean b(Menu menu)
    {
        menu = menu.findItem(g.mr);
        boolean flag = d();
        menu.setVisible(flag);
        return flag;
    }

    void c()
    {
        Object obj1;
        boolean flag;
        obj1 = null;
        a.p_();
        if (f == null)
        {
            return;
        }
        flag = d();
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = a.getResources();
        buv.a[b.a().ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 122
    //                   2 133
    //                   3 144;
           goto _L2 _L3 _L4 _L5
_L2:
        obj = null;
_L7:
        f.a(((android.graphics.drawable.Drawable) (obj)));
        bpn bpn1 = f;
        obj = obj1;
        if (flag)
        {
            obj = e;
        }
        bpn1.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        f.setClickable(flag);
        return;
_L3:
        obj = ((Resources) (obj)).getDrawable(g.mg);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = ((Resources) (obj)).getDrawable(g.mj);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = ((Resources) (obj)).getDrawable(g.mm);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void j_()
    {
        b.a(e);
        d.a(e);
        f = (bpn)a.g().c();
        c();
    }

    public void k_()
    {
        b.b(e);
        d.b(e);
    }
}
