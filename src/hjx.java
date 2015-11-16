// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class hjx
{

    private final Context a;
    private joj b;
    private PreferenceScreen c;

    public hjx(Context context)
    {
        a = context;
        c = ((hkp)hlp.a(context, hkp)).b();
    }

    public PreferenceCategory a(int i)
    {
        return b(a.getString(i));
    }

    public PreferenceCategory a(String s)
    {
        PreferenceCategory preferencecategory = new PreferenceCategory(a);
        preferencecategory.c(s);
        return preferencecategory;
    }

    public hjr a(String s, String s1)
    {
        hjr hjr1 = new hjr(a);
        hjr1.c(s);
        hjr1.b(s1);
        return hjr1;
    }

    public hjr a(String s, String s1, Intent intent)
    {
        s = a(s, s1);
        s.a(intent);
        return s;
    }

    public void a(PreferenceCategory preferencecategory, int i, Intent intent)
    {
        preferencecategory.c(a(a.getString(i), ((String) (null)), intent));
    }

    public PreferenceCategory b(String s)
    {
        s = a(s);
        if (c == null)
        {
            c = (PreferenceScreen)b.a();
        }
        c.c(s);
        return s;
    }
}
