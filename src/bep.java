// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.widget.FrameLayout;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;
import java.util.Iterator;
import java.util.List;

final class bep
    implements bel
{

    final ben a;

    bep(ben ben1)
    {
        a = ben1;
        super();
    }

    public void a(int i)
    {
        if (i != ben.i()) goto _L2; else goto _L1
_L1:
        g.a(ben.g(a), 2497);
        ben.h(a).setBackgroundResource(h.hM);
        ben.i(a).setVisibility(4);
        if (ben.j(a) instanceof cfc)
        {
            i = ben.j();
        } else
        if (ben.j(a) instanceof cfe)
        {
            i = ben.k();
        } else
        {
            String s = String.valueOf(ben.j(a));
            throw new AssertionError((new StringBuilder(String.valueOf(s).length() + 32)).append("Unexpected primary action type: ").append(s).toString());
        }
        ben.i(a).setVisibility(0);
        ben.k(a).a(i, bem.a);
        ben.l(a).show();
_L4:
        return;
_L2:
        if (i == ben.j() || i == ben.k())
        {
            ben.a(ben.i(a).getContext(), ben.j(a));
            return;
        }
        if (i != ben.l())
        {
            break; /* Loop/switch isn't completed */
        }
        g.a(ben.g(a), 2498);
        Iterator iterator = ben.m(a).iterator();
        while (iterator.hasNext()) 
        {
            ((android.view.View.OnClickListener)iterator.next()).onClick(ben.k(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i != ben.m() || ben.n(a) == null) goto _L4; else goto _L5
_L5:
        g.a(ben.g(a), 2499);
        ben.n(a).onClick(ben.k(a));
        return;
    }
}
