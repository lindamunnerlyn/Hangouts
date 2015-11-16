// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.social.settings.PreferenceCategory;
import com.google.android.libraries.social.settings.PreferenceScreen;

public final class hfg
{

    private final Context a;
    private final PreferenceScreen b;

    public hfg(Context context)
    {
        a = context;
        b = ((hfy)hgx.a(context, hfy)).a();
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

    public hfa a(String s, String s1)
    {
        hfa hfa1 = new hfa(a);
        hfa1.c(s);
        hfa1.b(s1);
        return hfa1;
    }

    public hfa a(String s, String s1, Intent intent)
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
        b.c(s);
        return s;
    }
}
