// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.view.View;

final class axp
    implements fsn, hjf, hkb
{

    final ave a;

    axp(ave ave1)
    {
        a = ave1;
        super();
    }

    public void a(View view, Bundle bundle)
    {
        if (bundle != null)
        {
            view = (ang)bundle.getParcelable("draft");
            ave.a(a, view);
            return;
        }
        if (ave.aK(a) != null)
        {
            ave.a(a, ave.aK(a));
            return;
        } else
        {
            ave.aL(a);
            return;
        }
    }

    public void b(Bundle bundle)
    {
        ave.aI(a).a(bundle);
        bundle.putParcelable("draft", a.S());
        bundle.putBoolean("share_intent_processed", ave.aJ(a));
    }
}
