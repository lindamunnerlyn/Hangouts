// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Locale;

final class gy extends gx
{

    gy()
    {
        super((byte)0);
    }

    public int a(Locale locale)
    {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
