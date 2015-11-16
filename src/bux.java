// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.ColorStateList;
import android.text.TextUtils;

public final class bux
{

    public final int a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;
    public final ColorStateList f;
    public final ColorStateList g;
    public final android.view.View.OnClickListener h;

    bux(int i, boolean flag, String s, String s1, ColorStateList colorstatelist, ColorStateList colorstatelist1, android.view.View.OnClickListener onclicklistener, 
            int j)
    {
        gbh.b(TextUtils.isEmpty(s));
        gbh.a(i, 0, 2);
        a = i;
        b = flag;
        c = s;
        e = s1;
        f = colorstatelist;
        g = colorstatelist1;
        h = onclicklistener;
        d = j;
    }
}
