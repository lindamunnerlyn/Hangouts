// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;

final class ayd
    implements hnx, hov, hoy
{

    final avv a;

    ayd(avv avv1)
    {
        a = avv1;
        super();
    }

    public void a(View view, Bundle bundle)
    {
        if (bundle != null)
        {
            view = (any)bundle.getParcelable("draft");
            avv.a(a, view);
            return;
        }
        if (avv.aI(a) != null)
        {
            avv.a(a, avv.aI(a));
            return;
        } else
        {
            avv.aJ(a);
            return;
        }
    }

    public void b(Bundle bundle)
    {
        bundle.putParcelable("draft", a.S());
    }
}
