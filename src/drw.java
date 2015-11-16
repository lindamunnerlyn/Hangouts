// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.social.settings.CheckBoxPreference;

final class drw extends dhy
{

    final drt a;

    drw(drt drt1)
    {
        a = drt1;
        super();
    }

    public void b(aoa aoa1)
    {
        if (aoa1.h() == drt.e(a).a())
        {
            int i = drt.e(a).a();
            if (drt.a(a) != null)
            {
                drt.a(a).a(drt.f(a).c(i));
            }
            if (drt.b(a) != null)
            {
                drt.b(a).a(drt.f(a).b(i));
            }
        }
    }
}
