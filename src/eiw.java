// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.apps.hangouts.views.MultiLineLayout;

public final class eiw extends eiy
{

    final MultiLineLayout a;

    public eiw(MultiLineLayout multilinelayout)
    {
        a = multilinelayout;
        super(multilinelayout, (byte)0);
    }

    protected void a(View view, int i, int j, int k, int l)
    {
        view.layout(i, j, i + k, j + l);
    }
}
