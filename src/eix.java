// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.MultiLineLayout;

public final class eix extends eiy
{

    final MultiLineLayout a;
    private int c;
    private int d;
    private int e;
    private int f;

    public eix(MultiLineLayout multilinelayout)
    {
        a = multilinelayout;
        super(multilinelayout, (byte)0);
    }

    public void a(int i)
    {
        super.a(i);
        c = c + a.getPaddingRight();
        d = d + a.getPaddingBottom();
        MultiLineLayout.a(a, View.resolveSize(c, e), View.resolveSize(d, f));
    }

    public void a(int i, int j)
    {
        c = 0;
        d = 0;
        e = i;
        f = j;
    }

    protected void a(View view)
    {
        MultiLineLayout.a(a, view, e, f);
    }

    protected void a(View view, int i, int j, int k, int l)
    {
        c = Math.max(c, i + k);
        d = Math.max(d, j + l);
    }
}
