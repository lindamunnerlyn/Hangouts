// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

final class fqb
    implements fqe
{

    final fqa a;

    fqb(fqa fqa)
    {
        a = fqa;
        super();
    }

    public fqd a(View view)
    {
        fqd fqd1 = new fqd();
        fqd1.e = (ImageView)view.findViewById(g.rK);
        fqd1.d = (TextView)view.findViewById(g.rC);
        return fqd1;
    }
}
