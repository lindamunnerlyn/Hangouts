// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.TextView;

final class cgu extends zq
{

    final cgh l;
    private final TextView m;

    public cgu(cgh cgh, View view)
    {
        l = cgh;
        super(view);
        m = (TextView)view.findViewById(l.uv);
    }

    static TextView a(cgu cgu1)
    {
        return cgu1.m;
    }

    public void b(int i)
    {
        m.setText(i);
    }
}
