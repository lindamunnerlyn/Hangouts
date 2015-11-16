// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

final class fnf
    implements fni
{

    final fne a;

    fnf(fne fne)
    {
        a = fne;
        super();
    }

    public fnh a(View view)
    {
        fnh fnh1 = new fnh();
        fnh1.e = (ImageView)view.findViewById(o.m);
        fnh1.d = (TextView)view.findViewById(o.e);
        return fnh1;
    }
}
