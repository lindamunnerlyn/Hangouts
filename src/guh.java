// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;

public class guh
    implements hon, hov, hoy
{

    private int a;

    public guh(hof hof1)
    {
        hof1.a(this);
    }

    public int a()
    {
        int i = a;
        a = i + 1;
        return i;
    }

    public void a(Bundle bundle)
    {
        if (bundle == null)
        {
            a = 16383;
            return;
        } else
        {
            a = bundle.getInt("com.google.android.apps.photos.activityresult.SafeRequstCodeGenerator.NextRequestCode");
            return;
        }
    }

    public void b(Bundle bundle)
    {
        bundle.putInt("com.google.android.apps.photos.activityresult.SafeRequstCodeGenerator.NextRequestCode", a);
    }
}
