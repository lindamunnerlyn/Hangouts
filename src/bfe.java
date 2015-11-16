// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Dialog;
import android.widget.FrameLayout;
import com.google.android.apps.hangouts.floatingactionbutton.impl.FloatingActionButton;
import com.google.android.apps.hangouts.floatingactionbutton.impl.QuickButtonContainer;
import java.util.Iterator;
import java.util.List;

final class bfe
    implements bfb
{

    final bfd a;

    bfe(bfd bfd1)
    {
        a = bfd1;
        super();
    }

    public void a(int i)
    {
        if (i != bfd.a) goto _L2; else goto _L1
_L1:
        g.a(a.k(), 2497);
        a.i.setBackgroundResource(h.hs);
        a.m.setVisibility(4);
        if (a.n instanceof cgh)
        {
            i = bfd.b;
        } else
        if (a.n instanceof cgj)
        {
            i = bfd.c;
        } else
        {
            String s = String.valueOf(a.n);
            throw new AssertionError((new StringBuilder(String.valueOf(s).length() + 32)).append("Unexpected primary action type: ").append(s).toString());
        }
        a.m.setVisibility(0);
        a.g.a(i, bfc.a);
        a.l.show();
_L4:
        return;
_L2:
        if (i == bfd.b || i == bfd.c)
        {
            bfd.a(a.m.getContext(), a.n);
            return;
        }
        if (i != bfd.d)
        {
            break; /* Loop/switch isn't completed */
        }
        g.a(a.k(), 2498);
        Iterator iterator = a.y.iterator();
        while (iterator.hasNext()) 
        {
            ((android.view.View.OnClickListener)iterator.next()).onClick(a.g);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (i != bfd.e || a.z == null) goto _L4; else goto _L5
_L5:
        g.a(a.k(), 2499);
        a.z.onClick(a.g);
        return;
    }
}
