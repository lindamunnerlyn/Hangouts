// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class btl
    implements android.view.View.OnClickListener
{

    final bpc a;
    final gmt b;
    final btf c;

    btl(btf btf, bpc bpc1, gmt gmt1)
    {
        c = btf;
        a = bpc1;
        b = gmt1;
        super();
    }

    public void onClick(View view)
    {
        view = a;
        bog.a(b.a()).a(view.e(), null);
    }
}
