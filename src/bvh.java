// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

final class bvh
    implements hma, hoo, hoq, hos, how, hox, hoy
{

    final pu a;
    buh b;
    bvm c;
    private buf d;
    private final bvj e = new bvj(this);
    private bpw f;

    bvh(pu pu1, hof hof1)
    {
        a = pu1;
        hof1.a(this);
    }

    private boolean d()
    {
        bui bui1 = b.a();
        return b.b() && (bui1 == bui.b || bui1 == bui.c || bui1 == bui.d) && d.b();
    }

    public void a(Context context, hlp hlp1, Bundle bundle)
    {
        b = (buh)hlp1.a(buh);
        d = (buf)hlp1.a(buf);
        c = (bvm)hlp1.a(bvm);
    }

    boolean a(int i)
    {
        if (!d()) goto _L2; else goto _L1
_L1:
        g.b(i);
        bvi.a[b.a().ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 54
    //                   2 74
    //                   3 74;
           goto _L2 _L3 _L4 _L4
_L2:
        return false;
_L3:
        (new buj()).a(a.u_(), null);
        return true;
_L4:
        (new bva()).a(a.u_(), null);
        return true;
    }

    public boolean a(Menu menu)
    {
        (new MenuInflater(a)).inflate(g.mh, menu);
        return b(menu);
    }

    public boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == g.mf)
        {
            return a(2243);
        } else
        {
            return false;
        }
    }

    public boolean b(Menu menu)
    {
        menu = menu.findItem(g.mf);
        boolean flag = d();
        menu.setVisible(flag);
        return flag;
    }

    void c()
    {
        Object obj1;
        boolean flag;
        obj1 = null;
        a.q_();
        if (f == null)
        {
            return;
        }
        flag = d();
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj = a.getResources();
        bvi.a[b.a().ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 122
    //                   2 133
    //                   3 144;
           goto _L2 _L3 _L4 _L5
_L2:
        obj = null;
_L7:
        f.a(((android.graphics.drawable.Drawable) (obj)));
        bpw bpw1 = f;
        obj = obj1;
        if (flag)
        {
            obj = e;
        }
        bpw1.setOnClickListener(((android.view.View.OnClickListener) (obj)));
        f.setClickable(flag);
        return;
_L3:
        obj = ((Resources) (obj)).getDrawable(g.lU);
        continue; /* Loop/switch isn't completed */
_L4:
        obj = ((Resources) (obj)).getDrawable(g.lX);
        continue; /* Loop/switch isn't completed */
_L5:
        obj = ((Resources) (obj)).getDrawable(g.ma);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void k_()
    {
        b.a(e);
        d.a(e);
        f = (bpw)a.g().c();
        c();
    }

    public void l_()
    {
        b.b(e);
        d.b(e);
    }
}
