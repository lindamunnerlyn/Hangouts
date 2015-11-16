// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

public final class qo
{

    private final qg a;
    private int b;

    public qo(Context context)
    {
        this(context, qn.a(context, 0));
    }

    private qo(Context context, int i)
    {
        a = new qg(new ContextThemeWrapper(context, qn.a(context, i)));
        b = i;
    }

    public Context a()
    {
        return a.a;
    }

    public qo a(android.content.DialogInterface.OnKeyListener onkeylistener)
    {
        a.r = onkeylistener;
        return this;
    }

    public qo a(Drawable drawable)
    {
        a.d = drawable;
        return this;
    }

    public qo a(View view)
    {
        a.g = view;
        return this;
    }

    public qo a(ListAdapter listadapter, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a.t = listadapter;
        a.u = onclicklistener;
        return this;
    }

    public qo a(CharSequence charsequence)
    {
        a.f = charsequence;
        return this;
    }

    public qn b()
    {
        qn qn1 = new qn(a.a, b);
        a.a(qn.a(qn1));
        qn1.setCancelable(a.o);
        if (a.o)
        {
            qn1.setCanceledOnTouchOutside(true);
        }
        qn1.setOnCancelListener(a.p);
        qn1.setOnDismissListener(a.q);
        if (a.r != null)
        {
            qn1.setOnKeyListener(a.r);
        }
        return qn1;
    }
}
