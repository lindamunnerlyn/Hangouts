// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.ListAdapter;

public final class qq
{

    private final qi a;
    private int b;

    public qq(Context context)
    {
        this(context, qp.a(context, 0));
    }

    private qq(Context context, int i)
    {
        a = new qi(new ContextThemeWrapper(context, qp.a(context, i)));
        b = i;
    }

    public Context a()
    {
        return a.a;
    }

    public qq a(android.content.DialogInterface.OnKeyListener onkeylistener)
    {
        a.r = onkeylistener;
        return this;
    }

    public qq a(Drawable drawable)
    {
        a.d = drawable;
        return this;
    }

    public qq a(View view)
    {
        a.g = view;
        return this;
    }

    public qq a(ListAdapter listadapter, android.content.DialogInterface.OnClickListener onclicklistener)
    {
        a.t = listadapter;
        a.u = onclicklistener;
        return this;
    }

    public qq a(CharSequence charsequence)
    {
        a.f = charsequence;
        return this;
    }

    public qp b()
    {
        qp qp1 = new qp(a.a, b);
        a.a(qp1.a);
        qp1.setCancelable(a.o);
        if (a.o)
        {
            qp1.setCanceledOnTouchOutside(true);
        }
        qp1.setOnCancelListener(a.p);
        qp1.setOnDismissListener(a.q);
        if (a.r != null)
        {
            qp1.setOnKeyListener(a.r);
        }
        return qp1;
    }
}
