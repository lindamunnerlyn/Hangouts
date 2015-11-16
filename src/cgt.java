// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

final class cgt extends zq
{

    final cgh l;
    private TextView m;

    cgt(cgh cgh, View view)
    {
        l = cgh;
        super(view);
        m = (TextView)view.findViewById(l.uF);
    }

    static TextView a(cgt cgt1)
    {
        return cgt1.m;
    }
}
