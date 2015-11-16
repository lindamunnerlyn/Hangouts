// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.settings.CheckBoxPreference;

final class dpd extends dgp
{

    final dpa a;

    dpd(dpa dpa1)
    {
        a = dpa1;
        super();
    }

    public void b(ani ani1)
    {
        if (ani1.h() == dpa.e(a).a())
        {
            int i = dpa.e(a).a();
            if (dpa.a(a) != null)
            {
                dpa.a(a).a(dpa.f(a).c(i));
            }
            if (dpa.b(a) != null)
            {
                dpa.b(a).a(dpa.f(a).b(i));
            }
        }
    }
}
