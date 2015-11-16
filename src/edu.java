// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.hangouts.views.EasterEggView;
import java.util.List;

final class edu
    implements Runnable
{

    final edt a;
    final edt b;

    edu(edt edt1, edt edt2)
    {
        b = edt1;
        a = edt2;
        super();
    }

    public void run()
    {
        b.a();
        EasterEggView.a(b.a).remove(a);
    }
}
