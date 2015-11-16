// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.support.v7.internal.widget.ActivityChooserView;
import android.view.View;
import android.widget.AdapterView;

public final class ur
    implements android.view.View.OnClickListener, android.view.View.OnLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.PopupWindow.OnDismissListener
{

    final ActivityChooserView a;

    public ur(ActivityChooserView activitychooserview)
    {
        a = activitychooserview;
        super();
    }

    public void onClick(View view)
    {
        if (view == a.e)
        {
            a.b();
            view = a.a.b();
            int i = a.a.e().a(view);
            view = a.a.e().b(i);
            if (view != null)
            {
                view.addFlags(0x80000);
                a.getContext().startActivity(view);
            }
            return;
        }
        if (view == a.d)
        {
            a.j = false;
            a.b(a.k);
            return;
        } else
        {
            throw new IllegalArgumentException();
        }
    }

    public void onDismiss()
    {
        if (a.i != null)
        {
            a.i.onDismiss();
        }
        if (a.g != null)
        {
            a.g.a(false);
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        ((uq)adapterview.getAdapter()).getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 32
    //                   0 50
    //                   1 40;
           goto _L1 _L2 _L3
_L1:
        throw new IllegalArgumentException();
_L3:
        a.b(0x7fffffff);
_L5:
        return;
_L2:
        a.b();
        if (!a.j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i > 0)
        {
            a.a.e().c(i);
            return;
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (!a.a.f())
        {
            i++;
        }
        adapterview = a.a.e().b(i);
        if (adapterview != null)
        {
            adapterview.addFlags(0x80000);
            a.getContext().startActivity(adapterview);
            return;
        }
        if (true) goto _L5; else goto _L6
_L6:
    }

    public boolean onLongClick(View view)
    {
        if (view == a.e)
        {
            if (a.a.getCount() > 0)
            {
                a.j = true;
                a.b(a.k);
            }
            return true;
        } else
        {
            throw new IllegalArgumentException();
        }
    }
}
